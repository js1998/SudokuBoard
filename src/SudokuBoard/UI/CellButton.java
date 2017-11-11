package SudokuBoard.UI;

import SudokuBoard.Board;
import SudokuBoard.Cell;

import javax.swing.*;

/**
 * Created by john_ on 2017-11-10.
 */
public class CellButton extends JButton{
    private Board board;
    private int index;
    private Cell cell;

    public CellButton(int index, Board board){
        this.index = index;
        this.board = board;

        cell = board.getCell(index);
    }

    public Cell getCell(){

        return cell;
    }
}
