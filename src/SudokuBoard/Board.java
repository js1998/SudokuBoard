package SudokuBoard;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by john_ on 2017-11-10.
 */
public class Board {
    private List<Cell> cells = new ArrayList<>();
    private List<Rows> rows = new ArrayList<>();
    private List<Columns> columns = new ArrayList<>();
    private List<Groups> groups = new ArrayList<>();

    public Board() {
        int i = 0;
        createRows();
        createColumns();
        createGroups();

        while (i < 81){
            Cell cell = new Cell(i,0);
            cells.add(cell);
            addToRows(cell);
            addToColumn(cell);
            addToGroup(cell);
            i++;
        }

		//set-up initialization of a simple board

		initializeBoard();
    }

    public int getNumberOfCells(){
        return cells.size();
    }

    public Cell getCell(int cellPosition){

        return cells.get(cellPosition);
    }

    private List<Cell> getCells(){
        return cells;
    }

    private void addToRows(Cell cell){
        int row = cell.getRow();
        Rows cellRow = rows.get(row);
        cellRow.addCell(cell);
    }

    private void addToColumn(Cell cell){
        int column = cell.getColumn();
        Columns cellColumn = columns.get(column);
        cellColumn.addCell(cell);
    }

    private void addToGroup(Cell cell){
        int group = cell.getGroup();
        Groups cellGroup = groups.get(group);
        cellGroup.addCell(cell);
    }

    public boolean isValid(){
        return(isGroupsValid() && isColumnsValid() && isRowsValid());
    }

    public boolean isGroupsValid(){
        for(Groups group : groups){
            if(!group.isValid())
                return false;
        }
        return true;
    }

    public boolean isColumnsValid(){
        for(Columns column : columns){
            if(!column.isValid())
                return false;
        }
        return true;
    }

    public boolean isRowsValid(){
        for(Rows row : rows){
            if(!row.isValid())
                return false;
        }
        return true;
    }

    public boolean isSolved() {
        return (groupSolved() && columnSolved() && rowSolved());
    }

    public boolean groupSolved() {
        for (Groups group : groups){
            if(!group.solved())
                return false;
        }
        return true;
    }

    public boolean columnSolved(){
        for(Columns column : columns){
            if(!column.solved())
                return false;
        }
        return true;
    }

    public boolean rowSolved(){
        for(Rows row : rows){
            if(!row.solved())
                return false;
        }
        return true;
    }

    public boolean isValidMove(int value, int cellPosition){
        Cell cell = cells.get(cellPosition);
        Groups group = groups.get(cell.getGroup());
        Columns column = columns.get(cell.getColumn());
        Rows row = rows.get(cell.getRow());

        return (group.isValid() && column.isValid() && row.isValid());
    }


    private Cell getFirstEmptyCellPosition(){

        for (Cell cell : cells){
            if (!cell.isFilled()){
                return cell;
            }
        }

        return null; //TODO: make robust
    }

    private Board getCopyOfCurrentBoard(){
        Board copyOfCurrentBoard = new Board();
        List<Cell> copyOfCells = copyOfCurrentBoard.getCells();

        int i = 0;
        while (i < 80){
            int value = cells.get(i).getValue();
            copyOfCells.get(i).setValue(value);
            i++;
        }

        return copyOfCurrentBoard;
    }

    private void createRows(){
        int i = 0;
        while (i < 9){
            Rows newRow = new Rows(i);
            rows.add(newRow);
            i++;
        }
    }

    private void createGroups(){
        int i =0;
        while (i < 9){
            Groups newGroup = new Groups(i);
            groups.add(newGroup);
            i++;
        }
    }

    private void createColumns(){
        int i =0;
        while(i <9){
            Columns newColumn = new Columns(i);
            columns.add(newColumn);
            i++;
        }
    }

	private void initializeBoard(){
        File file = new File("input.txt");

        try {
            BufferedReader br = new BufferedReader((new FileReader(file)));
            String str = br.readLine();
            StringTokenizer data = new StringTokenizer(str);
            while(data.hasMoreTokens()){
                String[] num = data.nextToken().split(",");
                if (num[1] != "0"){
                    int idx = Integer.valueOf(num[0]);
                    int value = Integer.valueOf(num[1]);

                    Cell cell = cells.get(idx);
                    cell.setValue(value);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            //TODO: throw error message if input file is malformed
        }


    }

}
