package SudokuBoard.UI;

import SudokuBoard.Board;

import javax.swing.*;
import java.awt.*;

/**
 * Created by john_ on 2017-11-10.
 */
public class SudokuBoardUI {
    private Board board;

    public SudokuBoardUI() {

        board = new Board();
        JFrame sudokuWindow = new JFrame("SudokuSolver");
        sudokuWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sudokuWindow.setLayout(new BorderLayout());
        sudokuWindow.add(new SudokuBoardApp(board));
        sudokuWindow.pack();
        sudokuWindow.setSize(1400, 1400);
        sudokuWindow.setVisible(true);
    }

    public static void main(String[] args) {new SudokuBoardUI();}

}
