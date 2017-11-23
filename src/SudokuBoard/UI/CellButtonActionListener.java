package SudokuBoard.UI;

import SudokuBoard.Board;
import SudokuBoard.Cell;

import javax.swing.*;
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
    Frame frame;
    int value;
    int error;


    @Override
    public void actionPerformed(ActionEvent e) {

        String[] options = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };

        UIManager.put("OptionPane.minimumSize", new Dimension(500,150));
        value = JOptionPane.showOptionDialog(optionPane,
                "Choose Value for Cell",
                "Input Values",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                null
        );

        if (value != -1) {
            source = (CellButton) e.getSource();
            board = source.getBoard();
            cellSource = source.getCell();
            cellPosition = cellSource.getPosition();
            int previousValue = cellSource.getValue();
            cellSource.setValue(value + 1);
            if (board.isValidMove(value + 1, cellPosition)){
                source.setFont(new Font("Arial", Font.PLAIN, 50));
                source.setText("" + (value + 1) + "");
            } else{
                cellSource.setValue(previousValue);
                JOptionPane.showInternalMessageDialog(optionPane, "Invalid Move", "Invalid Move", JOptionPane.ERROR_MESSAGE);
                //TODO: fix error message
            }
        }

        value = 0;
    }
}
