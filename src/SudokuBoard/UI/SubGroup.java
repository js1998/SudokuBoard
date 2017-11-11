package SudokuBoard.UI;

import SudokuBoard.Board;

import javax.swing.*;
import java.awt.*;

/**
 * Created by john_ on 2017-11-10.
 */
public class SubGroup extends JPanel {

    private Board board;
    private CellButton cellButton;
    Action toggleAction = new CellButtonActionListener();

    public SubGroup(int index, Board board){
        setLayout(new GridLayout(3,3));
        this.board = board;

        if (index == 0){
            createG0();
        } else if (index == 1){
            createG1();
        } else if (index == 2){
            createG2();
        } else if (index == 3){
            createG3();
        } else if (index == 4){
            createG4();
        } else if (index == 5){
            createG5();
        } else if (index == 6){
            createG6();
        } else if (index == 7){
            createG7();
        } else if (index == 8){
            createG8();
        }
    }

    private void createG0(){
        for (int i = 0; i < 3; i++){
            cellButton = new CellButton(i, board);
            add(cellButton);
            cellButton.addActionListener(new CellButtonActionListener());
        }
        for (int i = 9; i < 12; i++){
            cellButton = new CellButton(i, board);
            add(cellButton);
            cellButton.addActionListener(new CellButtonActionListener());
        }
        for (int i = 18; i < 21; i++){
            cellButton = new CellButton(i, board);
            add(cellButton);
            cellButton.addActionListener(new CellButtonActionListener());
        }
    }

    private void createG1(){
        for (int i = 3; i < 6; i++){
            cellButton = new CellButton(i, board);
            add(cellButton);
            cellButton.addActionListener(new CellButtonActionListener());
        }
        for (int i = 12; i < 15; i++){
            cellButton = new CellButton(i, board);
            add(cellButton);
            cellButton.addActionListener(new CellButtonActionListener());
        }
        for (int i = 21; i < 24; i++){
            cellButton = new CellButton(i, board);
            add(cellButton);
            cellButton.addActionListener(new CellButtonActionListener());
        }
    }

    private void createG2(){
        for (int i = 6; i < 9; i++){
            cellButton = new CellButton(i, board);
            add(cellButton);
            cellButton.addActionListener(new CellButtonActionListener());
        }
        for (int i = 15; i < 18; i++){
            cellButton = new CellButton(i, board);
            add(cellButton);
            cellButton.addActionListener(new CellButtonActionListener());
        }
        for (int i = 24; i < 27; i++){
            cellButton = new CellButton(i, board);
            add(cellButton);
            cellButton.addActionListener(new CellButtonActionListener());
        }

    }
    private void createG3(){
        for (int i = 27; i < 30; i++){
            cellButton = new CellButton(i, board);
            add(cellButton);
            cellButton.addActionListener(new CellButtonActionListener());
        }
        for (int i = 36; i < 39; i++){
            cellButton = new CellButton(i, board);
            add(cellButton);
            cellButton.addActionListener(new CellButtonActionListener());
        }
        for (int i = 45; i < 48; i++){
            cellButton = new CellButton(i, board);
            add(cellButton);
            cellButton.addActionListener(new CellButtonActionListener());
        }
    }

    private void createG4(){
        for (int i = 30; i < 33; i++){
            cellButton = new CellButton(i, board);
            add(cellButton);
            cellButton.addActionListener(new CellButtonActionListener());
        }
        for (int i = 39; i < 42; i++){
            cellButton = new CellButton(i, board);
            add(cellButton);
            cellButton.addActionListener(new CellButtonActionListener());
        }
        for (int i = 48; i < 51; i++){
            cellButton = new CellButton(i, board);
            add(cellButton);
            cellButton.addActionListener(new CellButtonActionListener());
        }
    }

    private void createG5(){
        for (int i = 33; i < 36; i++){
            cellButton = new CellButton(i, board);
            add(cellButton);
            cellButton.addActionListener(new CellButtonActionListener());
        }
        for (int i = 42; i < 45; i++){
            cellButton = new CellButton(i, board);
            add(cellButton);
            cellButton.addActionListener(new CellButtonActionListener());
        }
        for (int i = 51; i < 54; i++){
            cellButton = new CellButton(i, board);
            add(cellButton);
            cellButton.addActionListener(new CellButtonActionListener());
        }
    }

    private void createG6(){
        for (int i = 54; i < 57; i++){
            cellButton = new CellButton(i, board);
            add(cellButton);
            cellButton.addActionListener(new CellButtonActionListener());

        }
        for (int i = 63; i < 66; i++){
            cellButton = new CellButton(i, board);
            add(cellButton);
            cellButton.addActionListener(new CellButtonActionListener());
        }
        for (int i = 72; i < 75; i++){
            cellButton = new CellButton(i, board);
            add(cellButton);
            cellButton.addActionListener(new CellButtonActionListener());
        }
    }

    private void createG7(){
        for (int i = 57; i < 60; i++){
            cellButton = new CellButton(i, board);
            add(cellButton);
            cellButton.addActionListener(new CellButtonActionListener());
        }
        for (int i = 66; i < 69; i++){
            cellButton = new CellButton(i, board);
            add(cellButton);
            cellButton.addActionListener(new CellButtonActionListener());
        }
        for (int i = 75; i < 78; i++){
            cellButton = new CellButton(i, board);
            add(cellButton);
            cellButton.addActionListener(new CellButtonActionListener());
        }
    }

    private void createG8(){
        for (int i = 60; i < 63; i++){
            cellButton = new CellButton(i, board);
            add(cellButton);
            cellButton.addActionListener(new CellButtonActionListener());
        }
        for (int i = 69; i < 72; i++){
            cellButton = new CellButton(i, board);
            add(cellButton);
            cellButton.addActionListener(new CellButtonActionListener());
        }
        for (int i = 78; i < 81; i++){
            cellButton = new CellButton(i, board);
            add(cellButton);
            cellButton.addActionListener(new CellButtonActionListener());
        }
    }
}
