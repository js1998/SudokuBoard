package SudokuBoard.UI;

import SudokuBoard.Board;
import SudokuBoard.Cell;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by john_ on 2017-11-10.
 */
public class CellButtonActionListener extends AbstractAction {

    CellButton source;
    Cell cellSource;
    int cellPosition;
    Board board;
    JOptionPane optionPane;
    JOptionPane errorPane;
    int value;
    int errorValue;


    @Override
    public void actionPerformed(ActionEvent e) {

        String[] options = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };

        UIManager.put("OptionPane.minimumSize", new Dimension(500,200));
        UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("ARIAL", Font.PLAIN, 50)));
        value = JOptionPane.showOptionDialog(optionPane,
                "Choose Value for Cell",
                "Input Values",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                null
        );
        source = (CellButton) e.getSource();
        board = source.getBoard();
        cellSource = source.getCell();
        cellPosition = cellSource.getPosition();

        if (value != -1) {
            int previousValue = cellSource.getValue();
            cellSource.setValue(value + 1);
            if (board.isValidMove(value + 1, cellPosition)){
                source.setFont(new Font("Arial", Font.PLAIN, 50));
                source.setForeground(Color.RED);
                source.setText("" + (value + 1) + "");
            } else{
                cellSource.setValue(previousValue);

                UIManager.put("OptionPane.minimumSize", new Dimension(500,150));
                JOptionPane.showMessageDialog(optionPane,
                        "Invalid Value",
                        "Error",
                        JOptionPane.OK_OPTION,
                        null);


                }
            }
        }

        //value = 0;
    }
