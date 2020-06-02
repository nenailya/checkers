package sample;


import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    private int[][] array;
    private ImageView[][] image;
    public enum Cells {
        cell1(0,1),
        cell2(0,3),
        cell3(0,5),
        cell4(0,7),
        cell5(1,0),
        cell6(1,2),
        cell7(1,4),
        cell8(1,6),
        cell9(2,1),
        cell10(2,3),
        cell11(2,5),
        cell12(2,7),
        cell13(3,0),
        cell14(3,2),
        cell15(3,4),
        cell16(3,6),
        cell17(4,1),
        cell18(4,3),
        cell19(4,5),
        cell20(4,7),
        cell21(5,0),
        cell22(5,2),
        cell23(5,4),
        cell24(5,6),
        cell25(6,1),
        cell26(6,3),
        cell27(6,5),
        cell28(6,7),
        cell29(7,0),
        cell30(7,2),
        cell31(7,4),
        cell32(7,6);

        public final int x;
        public final int y;

        Cells(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }


    void clean() {
        array = new int[8][8];
        array[0][1] = 1;
        array[0][3] = 1;
        array[0][5] = 1;
        array[0][7] = 1;
        array[1][0] = 1;
        array[1][2] = 1;
        array[1][4] = 1;
        array[1][6] = 1;
        array[2][1] = 1;
        array[2][3] = 1;
        array[2][5] = 1;
        array[2][7] = 1;

        array[3][0] = 0;
        array[3][2] = 0;
        array[3][4] = 0;
        array[3][6] = 0;
        array[4][1] = 0;
        array[4][3] = 0;
        array[4][5] = 0;
        array[4][7] = 0;

        array[5][0] = 2;
        array[5][2] = 2;
        array[5][4] = 2;
        array[5][6] = 2;
        array[6][1] = 2;
        array[6][3] = 2;
        array[6][5] = 2;
        array[6][7] = 2;
        array[7][0] = 2;
        array[7][2] = 2;
        array[7][4] = 2;
        array[7][6] = 2;
    }

    public void cell1() { move(Cells.cell1); }
    public void cell2() { move(Cells.cell2); }
    public void cell3() { move(Cells.cell3); }
    public void cell4() { move(Cells.cell4); }
    public void cell5() { move(Cells.cell5); }
    public void cell6() { move(Cells.cell6); }
    public void cell7() { move(Cells.cell7); }
    public void cell8() { move(Cells.cell8); }
    public void cell9() { move(Cells.cell9); }
    public void cell10() { move(Cells.cell10); }
    public void cell11() { move(Cells.cell11); }
    public void cell12() { move(Cells.cell12); }
    public void cell13() { move(Cells.cell13); }
    public void cell14() { move(Cells.cell14); }
    public void cell15() { move(Cells.cell15); }
    public void cell16() { move(Cells.cell16); }
    public void cell17() { move(Cells.cell17); }
    public void cell18() { move(Cells.cell18); }
    public void cell19() { move(Cells.cell19); }
    public void cell20() { move(Cells.cell20); }
    public void cell21() { move(Cells.cell21); }
    public void cell22() { move(Cells.cell22); }
    public void cell23() { move(Cells.cell23); }
    public void cell24() { move(Cells.cell24); }
    public void cell25() { move(Cells.cell25); }
    public void cell26() { move(Cells.cell26); }
    public void cell27() { move(Cells.cell27); }
    public void cell28() { move(Cells.cell28); }
    public void cell29() { move(Cells.cell29); }
    public void cell30() { move(Cells.cell30); }
    public void cell31() { move(Cells.cell31); }
    public void cell32() { move(Cells.cell32); }



    private void move(Cells cells) {
        switch (cells) {
             case cell1: { int x = 0; int y = 1; fooForEachCell(x, y); updateUI();}
             case cell2: { int x = 0; int y = 3; fooForEachCell(x, y); updateUI();}
             case cell3: { int x = 0; int y = 5; fooForEachCell(x, y); updateUI();}
             case cell4: { int x = 0; int y = 7; fooForEachCell(x, y); updateUI();}
             case cell5: { int x = 1; int y = 0; fooForEachCell(x, y); updateUI();}
             case cell6: { int x = 1; int y = 2; fooForEachCell(x, y); updateUI();}
             case cell7: { int x = 1; int y = 4; fooForEachCell(x, y); updateUI();}
             case cell8: { int x = 1; int y = 6; fooForEachCell(x, y); updateUI();}
             case cell9: { int x = 2; int y = 1; fooForEachCell(x, y); updateUI();}
            case cell10: { int x = 2; int y = 3; fooForEachCell(x, y); updateUI();}
            case cell11: { int x = 2; int y = 5; fooForEachCell(x, y); updateUI();}
            case cell12: { int x = 2; int y = 7; fooForEachCell(x, y); updateUI();}
            case cell13: { int x = 3; int y = 0; fooForEachCell(x, y); updateUI();}
            case cell14: { int x = 3; int y = 2; fooForEachCell(x, y); updateUI();}
            case cell15: { int x = 3; int y = 4; fooForEachCell(x, y); updateUI();}
            case cell16: { int x = 3; int y = 6; fooForEachCell(x, y); updateUI();}
            case cell17: { int x = 4; int y = 1; fooForEachCell(x, y); updateUI();}
            case cell18: { int x = 4; int y = 3; fooForEachCell(x, y); updateUI();}
            case cell19: { int x = 4; int y = 5; fooForEachCell(x, y); updateUI();}
            case cell20: { int x = 4; int y = 7; fooForEachCell(x, y); updateUI();}
            case cell21: { int x = 5; int y = 0; fooForEachCell(x, y); updateUI();}
            case cell22: { int x = 5; int y = 2; fooForEachCell(x, y); updateUI();}
            case cell23: { int x = 5; int y = 4; fooForEachCell(x, y); updateUI();}
            case cell24: { int x = 5; int y = 6; fooForEachCell(x, y); updateUI();}
            case cell25: { int x = 6; int y = 1; fooForEachCell(x, y); updateUI();}
            case cell26: { int x = 6; int y = 3; fooForEachCell(x, y); updateUI();}
            case cell27: { int x = 6; int y = 5; fooForEachCell(x, y); updateUI();}
            case cell28: { int x = 6; int y = 7; fooForEachCell(x, y); updateUI();}
            case cell29: { int x = 7; int y = 0; fooForEachCell(x, y); updateUI();}
            case cell30: { int x = 7; int y = 2; fooForEachCell(x, y); updateUI();}
            case cell31: { int x = 7; int y = 4; fooForEachCell(x, y); updateUI();}
            case cell32: { int x = 7; int y = 6; fooForEachCell(x, y); updateUI();}
        }

    }



    private void fooForEachCell(int x, int y) {
        int colorOfChecker = array[x][y];

        if (colorOfChecker == 0) {
            array[x][y] = 0;
        }

        if (colorOfChecker == 1) {
            if (array[x+1][y-1] == 0){ array[x+1][y-1] = 10; }
            if (array[x+1][y+1] == 0){ array[x+1][y+1] = 10; }
            if (array[x+1][y-1] == 1){ array[x+1][y-1] = 1; }
            if (array[x+1][y+1] == 1){ array[x+1][y+1] = 1; }
            if (array[x + 1][y - 1] == 2 && array[x + 2][y - 2] == 0) { array[x + 2][y - 2] = 10; }
            if (array[x + 1][y + 1] == 2 && array[x + 2][y + 2] == 0) { array[x + 2][y + 2] = 10; }
        }

        if (colorOfChecker == 2) {
            if (array[x-1][y-1] == 0){ array[x-1][y-1] = 10; }
            if (array[x-1][y+1] == 0){ array[x-1][y+1] = 10; }
            if (array[x-1][y-1] == 2){ array[x-1][y-1] = 2; }
            if (array[x-1][y+1] == 2){ array[x-1][y+1] = 2; }
            if (array[x - 1][y - 1] == 1 && array[x - 2][y - 2] == 0) { array[x - 2][y - 2] = 10; }
            if (array[x - 1][y + 1] == 1 && array[x - 2][y + 2] == 0) { array[x - 2][y + 2] = 10; }
        }

        if (colorOfChecker == 11) {
            if (array[x+1][y-1] == 0){ array[x+1][y-1] = 10; }
            if (array[x+1][y+1] == 0){ array[x+1][y+1] = 10; }
            if (array[x-1][y-1] == 0){ array[x-1][y-1] = 10; }
            if (array[x-1][y+1] == 0){ array[x-1][y+1] = 10; }
            if (array[x+1][y-1] == 1){ array[x+1][y-1] = 1; }
            if (array[x+1][y+1] == 1){ array[x+1][y+1] = 1; }
            if (array[x-1][y-1] == 1){ array[x-1][y-1] = 1; }
            if (array[x-1][y+1] == 1){ array[x-1][y+1] = 1; }
            if (array[x + 1][y - 1] == 2 && array[x + 2][y - 2] == 0) { array[x + 2][y - 2] = 10; }
            if (array[x + 1][y + 1] == 2 && array[x + 2][y + 2] == 0) { array[x + 2][y + 2] = 10; }
            if (array[x - 1][y - 1] == 2 && array[x - 2][y - 2] == 0) { array[x - 2][y - 2] = 10; }
            if (array[x - 1][y + 1] == 2 && array[x - 2][y + 2] == 0) { array[x - 2][y + 2] = 10; }
        }

        if (colorOfChecker == 12) {
            if (array[x + 1][y - 1] == 0) { array[x + 1][y - 1] = 10; }
            if (array[x + 1][y + 1] == 0) { array[x + 1][y + 1] = 10; }
            if (array[x - 1][y - 1] == 0) { array[x - 1][y - 1] = 10; }
            if (array[x - 1][y + 1] == 0) { array[x - 1][y + 1] = 10; }
            if (array[x + 1][y - 1] == 2) { array[x + 1][y - 1] = 2; }
            if (array[x + 1][y + 1] == 2) { array[x + 1][y + 1] = 2; }
            if (array[x - 1][y - 1] == 2) { array[x - 1][y - 1] = 2; }
            if (array[x - 1][y + 1] == 2) { array[x - 1][y + 1] = 2; }
            if (array[x + 1][y - 1] == 1 && array[x + 2][y - 2] == 0) { array[x + 2][y - 2] = 10; }
            if (array[x + 1][y + 1] == 1 && array[x + 2][y + 2] == 0) { array[x + 2][y + 2] = 10; }
            if (array[x - 1][y - 1] == 1 && array[x - 2][y - 2] == 0) { array[x - 2][y - 2] = 10; }
            if (array[x - 1][y + 1] == 1 && array[x - 2][y + 2] == 0) { array[x - 2][y + 2] = 10; }
        }

        if (colorOfChecker == 10) {
            if(array[x-1][y-1] == 81 || array[x-1][y+1] == 81){ array[x][y] = 1; }
            if(array[x+1][y-1] == 82 || array[x+1][y+1] == 82){ array[x][y] = 2; }
            if(array[x-1][y-1] == 811 || array[x-1][y+1] == 811 || array[x+1][y-1] == 811 || array[x+1][y+1] == 811){ array[x][y] = 11; }
            if(array[x-1][y-1] == 812 || array[x-1][y+1] == 812 || array[x+1][y-1] == 812 || array[x+1][y+1] == 812){ array[x][y] = 12; }

            if(array[x-2][y+2] == 81){
                array[x-2][y+2] = 0;
                array[x-1][y+1] = 0;
                array[x][y] = 1;
            }
            if(array[x-2][y-2] == 81){
                array[x-2][y-2] = 0;
                array[x-1][y-1] = 0;
                array[x][y] = 1;
            }
            if(array[x+2][y+2] == 82){
                array[x+2][y+2] = 0;
                array[x+1][y+1] = 0;
                array[x][y] = 2;
            }
            if(array[x+2][y-2] == 82){
                array[x+2][y-2] = 0;
                array[x+1][y-1] = 0;
                array[x][y] = 2;
            }

            if(array[x-2][y+2] == 811){
                array[x-2][y+2] = 0;
                array[x-1][y+1] = 0;
                array[x][y] = 11;
            }
            if(array[x-2][y-2] == 811){
                array[x-2][y-2] = 0;
                array[x-1][y-1] = 0;
                array[x][y] = 11;
            }
            if(array[x+2][y+2] == 811){
                array[x+2][y+2] = 0;
                array[x+1][y+1] = 0;
                array[x][y] = 11;
            }
            if(array[x+2][y-2] == 811){
                array[x+2][y-2] = 0;
                array[x+1][y-1] = 0;
                array[x][y] = 11;
            }

            if(array[x-2][y+2] == 812){
                array[x-2][y+2] = 0;
                array[x-1][y+1] = 0;
                array[x][y] = 12;
            }
            if(array[x-2][y-2] == 812){
                array[x-2][y-2] = 0;
                array[x-1][y-1] = 0;
                array[x][y] = 12;
            }
            if(array[x+2][y+2] == 812){
                array[x+2][y+2] = 0;
                array[x+1][y+1] = 0;
                array[x][y] = 12;
            }
            if(array[x+2][y-2] == 812){
                array[x+2][y-2] = 0;
                array[x+1][y-1] = 0;
                array[x][y] = 12;
            }
        }

        if(colorOfChecker == 81 || colorOfChecker == 82 || colorOfChecker == 811 || colorOfChecker == 812){
            array[x][y] = array[x][y];
        }
    }

    public void updateUI() {
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                Image img = new Image("@images/" + array[x][y] + ".png");
                image[x][y].setImage(img);
            }
        }
    }

     @FXML public void Cell1() { fooForEachCell(0, 1);updateUI(); }
     @FXML public void Cell2() { fooForEachCell(0, 3);updateUI(); }
     @FXML public void Cell3() { fooForEachCell(0, 5);updateUI(); }
     @FXML public void Cell4() { fooForEachCell(0, 7);updateUI(); }
     @FXML public void Cell5() { fooForEachCell(1, 0);updateUI(); }
     @FXML public void Cell6() { fooForEachCell(1, 2);updateUI(); }
     @FXML public void Cell7() { fooForEachCell(1, 4);updateUI(); }
     @FXML public void Cell8() { fooForEachCell(1, 6);updateUI(); }
     @FXML public void Cell9() { fooForEachCell(2, 1);updateUI(); }
    @FXML public void Cell10() { fooForEachCell(2, 3);updateUI(); }
    @FXML public void Cell11() { fooForEachCell(2, 5);updateUI(); }
    @FXML public void Cell12() { fooForEachCell(2, 7);updateUI(); }
    @FXML public void Cell13() { fooForEachCell(3, 0);updateUI(); }
    @FXML public void Cell14() { fooForEachCell(3, 2);updateUI(); }
    @FXML public void Cell15() { fooForEachCell(3, 4);updateUI(); }
    @FXML public void Cell16() { fooForEachCell(3, 6);updateUI(); }
    @FXML public void Cell17() { fooForEachCell(4, 1);updateUI(); }
    @FXML public void Cell18() { fooForEachCell(4, 3);updateUI(); }
    @FXML public void Cell19() { fooForEachCell(4, 5);updateUI(); }
    @FXML public void Cell20() { fooForEachCell(4, 7);updateUI(); }
    @FXML public void Cell21() { fooForEachCell(5, 0);updateUI(); }
    @FXML public void Cell22() { fooForEachCell(5, 2);updateUI(); }
    @FXML public void Cell23() { fooForEachCell(5, 4);updateUI(); }
    @FXML public void Cell24() { fooForEachCell(5, 6);updateUI(); }
    @FXML public void Cell25() { fooForEachCell(6, 1);updateUI(); }
    @FXML public void Cell26() { fooForEachCell(6, 3);updateUI(); }
    @FXML public void Cell27() { fooForEachCell(6, 5);updateUI(); }
    @FXML public void Cell28() { fooForEachCell(6, 7);updateUI(); }
    @FXML public void Cell29() { fooForEachCell(7, 0);updateUI(); }
    @FXML public void Cell30() { fooForEachCell(7, 2);updateUI(); }
    @FXML public void Cell31() { fooForEachCell(7, 4);updateUI(); }
    @FXML public void Cell32() { fooForEachCell(7, 6);updateUI(); }

}


