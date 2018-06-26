package SudokuBoard.UI;

import SudokuBoard.Board;

import javax.swing.*;
import java.awt.*;

/**
 * Created by john_ on 2017-11-10.
 */
public class SudokuBoardUI {
    private SudokuBoardApp sudokuBoardApp;

    public SudokuBoardUI() {

        sudokuBoardApp = new SudokuBoardApp(new Board());
        JFrame sudokuWindow = new JFrame("SudokuSolver");
        sudokuWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sudokuWindow.setLayout(new BorderLayout());
        sudokuWindow.add(sudokuBoardApp);
        sudokuWindow.pack();
        sudokuWindow.setSize(750, 750);
        sudokuWindow.setVisible(true);
    }

    public static void main(String[] args) {new SudokuBoardUI();}

}
