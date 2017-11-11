package SudokuBoard.UI;

import SudokuBoard.Board;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Created by john_ on 2017-11-10.
 */
public class SudokuBoardApp extends JPanel{

    private static final int ROWS = 3;
    private static final int COLS = 3;
    private Board board;

    public SudokuBoardApp(Board board){
        this.board = board;
        setBorder(new EmptyBorder(4,4,4,4));
        setLayout(new GridLayout(ROWS,COLS));
        for (int row = 0; row < ROWS; row++){
            for (int col = 0; col < COLS; col++){
                int index = (row * ROWS) + col;
                SubGroup group = new SubGroup(index, board);
                group.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
                add(group);
            }
        }



    }
}
