package SudokuBoard.Tests;

import SudokuBoard.Board;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by john_ on 2017-11-19.
 */
public class BoardTests {

        private Board board = new Board();
        private Board newBoard = new Board();

        @Before
        public void setBoard(){
            int i = 0;
            while (i < 80){
                board.getCell(i).setValue(1);
                i++;
            }
        }

        @Test
        public void testCell(){
            assertEquals(board.getNumberOfCells(), 81);
        }

        @Test
        public void testRowsNoDuplicates(){
            int i = 0;
            while(i < 9){
                newBoard.getCell(i).setValue(i);
                i++;
            }
            assertTrue(newBoard.rowSolved());
        }

        @Test
        public void testRowWithDuplicates(){
            newBoard.getCell(1).setValue(2);
            newBoard.getCell(4).setValue(2);
            assertFalse(newBoard.rowSolved());
        }

        @Test
        public void testGroupsWithDuplicates(){
            newBoard.getCell(1).setValue(2);
            newBoard.getCell(9).setValue(2);
            assertFalse(newBoard.groupSolved());
        }

        @Test
        public void testGroupWithOutDuplicates(){
            newBoard.getCell(0).setValue(1);
            newBoard.getCell(1).setValue(2);
            newBoard.getCell(2).setValue(3);
            newBoard.getCell(9).setValue(4);
            newBoard.getCell(10).setValue(5);
            newBoard.getCell(11).setValue(6);
            newBoard.getCell(18).setValue(7);
            newBoard.getCell(19).setValue(8);
            newBoard.getCell(20).setValue(9);
            assertTrue(newBoard.groupSolved());
        }

        @Test
        public void testColumnsWithDuplicates(){
            newBoard.getCell(1).setValue(2);
            newBoard.getCell(28).setValue(2);
            assertFalse(newBoard.columnSolved());
        }

        @Test
        public void testColumnsNoDuplicates(){
            int i=1;
            int value = 1;
            while (i < 74){
                newBoard.getCell(i).setValue(value);
                i = i+9;
                value++;
            }
            assertTrue(newBoard.columnSolved());
        }

        @Test
        public void testBoardSolution(){
            assertFalse(board.isSolved());
            board.getCell(80).setValue(9);
            assertTrue(board.isSolved());
        }
}

