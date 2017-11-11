package SudokuBoard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by john_ on 2017-11-10.
 */
public class Rows {

    private List<Cell> cells;
    private int rowPosition;
    private List<Integer> ints;

    public Rows(int rowPosition){
        cells = new ArrayList<>();
        this.rowPosition = rowPosition;
    }

    public void addCell(Cell cell){
        cells.add(cell);
    }

    public boolean isValid(){

        int i=1;
        while (i<10) {
            ints.add(i);
            i++;
        }

        for (Cell cell: cells){
            if(cell.isFilled()){
                int value = cell.getValue();
                if (ints.contains(value)) {
                    ints.remove(value);
                }
                return false;
            }
        }
        return true;
    }
}
