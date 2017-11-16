package SudokuBoard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by john_ on 2017-11-15.
 */
public class Units {

    private List<Cell> cells;
    private int rowPosition;
    private List<Integer> ints;

    public Units(int rowPosition) {
        this.rowPosition = rowPosition;
        cells = new ArrayList<>();
    }

    public void addCell(Cell cell) {
        cells.add(cell);
    }

    public boolean solved() {
        return false;
    }
}
