package SudokuBoard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by john_ on 2017-11-15.
 */
public class Units {

    private List<Cell> cells;
    private int position;
    private List<Integer> ints;

    public Units(int position) {
        this.position = position;
        cells = new ArrayList<>();
    }

    public void addCell(Cell cell) {
        cells.add(cell);
    }

    public boolean solved() {

        for (Cell cell: cells) {
            if(!cell.isFilled()){
                return false;
            }
        }
        return isValid();
    }

    public boolean isValid(){
        List<Integer> previousEntries = new ArrayList<>();
        for (Cell cell: cells) {
            Integer cellValue = cell.getValue();
            if (previousEntries.contains(cellValue)) {
                return false;
            }
             if(cellValue !=0){
                previousEntries.add(cellValue);
             }
        }
        return true;

    }
}
