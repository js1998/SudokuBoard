package SudokuBoard;

import java.util.ArrayList;
import java.util.List;

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



//    private List<Board> getAllPossibleBoards(){
//
//        List<Board> possibleBoards = new LinkedList<>();
//
//        int i = 1;
//        while (i < 10){
//            Board copyOfCurrentBoard = getCopyOfCurrentBoard();
//            Cell emptyCell = copyOfCurrentBoard.getFirstEmptyCellPosition();
//            emptyCell.setValue(i);
//
//            if(copyOfCurrentBoard.isAllowed()){
//                possibleBoards.add(copyOfCurrentBoard);
//            }
//
//            i++;
//        }
//
//        return possibleBoards;
//    }

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

//    public boolean isAllowed(){
//
//        for(Rows row: rows){
//            if(!row.isValid())
//                return false;
//        }
//
//        for(Columns column: columns){
//            if(!column.isValid())
//                return false;
//        }
//
//        for(Groups group: groups){
//            if(!group.isValid())
//                return false;
//        }
//
//        return true;
//    }

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

//    private class SudokuSolver {
//
//        private Board currentBoard;
//        private List<Board> boardsToSolve;
//
//        public Board solver (Board board) {
//
//            currentBoard = board;
//            boardsToSolve = new LinkedList<>();
//            boardsToSolve.add(board);
//
//            while (!boardsToSolve.isEmpty()){
//                currentBoard = boardsToSolve.get(0);
//                boardsToSolve.remove(0);
//
//                if (currentBoard.isSolved()){
//                    return currentBoard;
//                }
//                List<Board> possibleBoards = currentBoard.getAllPossibleBoards();
//                boardsToSolve.addAll(0,possibleBoards);
//            }
//
//            return null; //TODO: make robust
//        }
//
//    }

}
