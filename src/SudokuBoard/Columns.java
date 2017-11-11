package SudokuBoard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by john_ on 2017-11-10.
 */
public class Columns {

    private List<Cell> cells;
    private int columnPosition;

    public Columns(int columnPosition){
        this.columnPosition = columnPosition;
        cells = new ArrayList<>();
    }

    public void addCell(Cell cell){
        cells.add(cell);

    }

}
