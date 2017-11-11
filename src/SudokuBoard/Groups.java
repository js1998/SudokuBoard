package SudokuBoard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by john_ on 2017-11-10.
 */
public class Groups {

    private List<Cell> cells;
    private int groupPosition;

    public Groups(int groupPosition){
        this.groupPosition = groupPosition;
        cells = new ArrayList<>();
    }

    public void addCell(Cell cell){
        cells.add(cell);
    }
}
