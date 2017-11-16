package SudokuBoard;

/**
 * Created by john_ on 2017-11-10.
 */
public class Cell {

    private boolean isFilled; //is cell filled or blank
    private Integer position; //integer from 0-80
    private Integer value; //an integer from 0 to 9, zero being blank
    private int row; //the row the cell is part of
    private int column; // the column the cell is part of
    private int group;// the group the cell is a part of


    public Cell(Integer position, Integer value) {

        this.position = position;
        this.value = value;
        isFilled = true;

        if (value == 0)
            isFilled = false;

        row = setRow(position);
        column = setColumn(position);
        group = setGroups();
    }

    public boolean isFilled() {

        return isFilled;
    }

    public Integer getPosition() {
        return position;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;

        if (value != 0)
            isFilled = true;
    }

    public boolean validMove(int value){
        return false; //TODO: stub
    }

    private int setRow (Integer position){

        if (0<= position && position <=8){
            return 0;
        } else if (9<= position && position <=17){
            return 1;
        } else if (18<= position && position <=26) {
            return 2;
        } else if (27<=position && position<=35){
            return 3;
        } else if (36<=position && position<=44){
            return 4;
        } else if (45 <= position && position <= 53){
            return 5;
        } else if (54 <= position && position <= 62){
            return 6;
        } else if (63 <= position && position <=71){
            return 7;
        } else return 8;
    }

    public int getRow() {
        return row;
    }

    private int setColumn (Integer position) {

        return (position % 9);
    }

    public int getColumn(){
        return column;
    }

    private int setGroups () {
//        if (getRow().equals(Rows.R0) || getRow().equals(Rows.R1) || getRow().equals(Rows.R2)) {
//            if (getColumn().equals(Columns.C0) || getColumn().equals(Columns.C1) || getColumn().equals(Columns.C2)) {
//                group = Groups.G0;
//            } else if (getColumn().equals(Columns.C3) || getColumn().equals(Columns.C4) || getColumn().equals(Columns.C5)) {
//                group = Groups.G1;
//            } else if (getColumn().equals(Columns.C6) || getColumn().equals(Columns.C7) || getColumn().equals(Columns.C8)) {
//                group = Groups.G2;
//            }
//
//        } else if (getRow().equals(Rows.R3) || getRow().equals(Rows.R4) || getRow().equals(Rows.R5)) {
//            if (getColumn().equals(Columns.C0) || getColumn().equals(Columns.C1) || getColumn().equals(Columns.C2)) {
//                group = Groups.G3;
//            } else if (getColumn().equals(Columns.C3) || getColumn().equals(Columns.C4) || getColumn().equals(Columns.C5)) {
//                group = Groups.G4;
//            } else if (getColumn().equals(Columns.C6) || getColumn().equals(Columns.C7) || getColumn().equals(Columns.C8)) {
//                group = Groups.G5;
//            }
//        } else if (getRow().equals(Rows.R6) || getRow().equals(Rows.R7) || getRow().equals(Rows.R8)) {
//            if (getColumn().equals(Columns.C0) || getColumn().equals(Columns.C1) || getColumn().equals(Columns.C2)) {
//                group = Groups.G6;
//            } else if (getColumn().equals(Columns.C3) || getColumn().equals(Columns.C4) || getColumn().equals(Columns.C5)) {
//                group = Groups.G7;
//            } else if (getColumn().equals(Columns.C6) || getColumn().equals(Columns.C7) || getColumn().equals(Columns.C8)) {
//                group = Groups.G8;
//            }
//        }

        if (getRow()>= 0 && getRow() <= 2) {
            if (getColumn() >=0 && getColumn() <=2) {
                group = 0;
            } else if (getColumn() >= 3 && getColumn() <=5) {
                group = 1;
            } else if (getColumn() >= 6 && getColumn() <=8) {
                group = 2;
            }

        } else if (getRow() >= 3 && getRow() <= 5) {
            if (getColumn() >=0 && getColumn() <=2) {
                group = 3;
            } else if (getColumn() >= 3 && getColumn() <=5) {
                group = 4;
            } else if (getColumn() >= 6 && getColumn() <=8) {
                group = 5;
            }
        } else if (getRow() >= 6 && getRow() <=8) {
            if (getColumn() >=0 && getColumn() <=2) {
                group = 6;
            } else if (getColumn() >= 3 && getColumn() <=5) {
                group = 7;
            } else if (getColumn() >= 6 && getColumn() <=8) {
                group = 8;
            }
        }

        return group;
    }

    public int getGroup(){
        return group;
    }
}
