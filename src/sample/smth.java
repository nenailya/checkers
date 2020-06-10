package sample;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class smth {

public static int[][] array;


     static {
         clean();
     }

    static void clean() {
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

    static int player = 2;

    static void fooForEachCell(int x, int y) {

        int colorOfChecker = array[x][y];

        if (colorOfChecker == 0) { array[x][y] = 0; }

        if (colorOfChecker == 1 && player == 1) { fooForWhiteYellowCellsDeleting(); fooForYellowCellsDeleting(); fooFor1(x, y);}
        if (colorOfChecker == 2 && player == 2) { fooForBlackYellowCellsDeleting(); fooForYellowCellsDeleting(); fooFor2(x, y);}
        if (colorOfChecker == 11 && player == 1) { fooForWhiteKingYellowCellsDeleting(); fooForYellowCellsDeleting(); fooFor11(x, y);}
        if (colorOfChecker == 12 && player == 2) { fooForBlackKingYellowCellsDeleting(); fooForYellowCellsDeleting(); fooFor12(x, y);}
        if (colorOfChecker == 1 && player == 2) {}
        if (colorOfChecker == 2 && player == 1) {}
        if (colorOfChecker == 11 && player == 2) {}
        if (colorOfChecker == 12 && player == 1) {}

        if (colorOfChecker == 10) {
            if(checkForMinus1(x) && checkForMinus1(y) && array[x-1][y-1] == 81) { array[x][y] = 1; array[x-1][y-1] = 0; whiteKingCheck(x, y); fooForYellowCellsDeleting();fooForWhiteYellowCellsDeleting(); player = 2;}
            if(checkForMinus1(x) && checkForPlus1(y)  && array[x-1][y+1] == 81) { array[x][y] = 1; array[x-1][y+1] = 0; whiteKingCheck(x, y); fooForYellowCellsDeleting();fooForWhiteYellowCellsDeleting(); player = 2;}
            if(checkForPlus1(x) && checkForMinus1(y)  && array[x+1][y-1] == 82) { array[x][y] = 2; array[x+1][y-1] = 0; blackKingCheck(x, y); fooForYellowCellsDeleting();fooForBlackYellowCellsDeleting(); player = 1;}
            if(checkForPlus1(x) && checkForPlus1(y)   && array[x+1][y+1] == 82) { array[x][y] = 2; array[x+1][y+1] = 0; blackKingCheck(x, y); fooForYellowCellsDeleting();fooForBlackYellowCellsDeleting(); player = 1;}
            if(checkForMinus1(x) && checkForMinus1(y) && array[x-1][y-1] == 811){ array[x][y] = 11; array[x-1][y-1] = 0; fooForYellowCellsDeleting();fooForWhiteKingYellowCellsDeleting(); player = 2;}
            if(checkForMinus1(x) && checkForPlus1(y)  && array[x-1][y+1] == 811){ array[x][y] = 11; array[x-1][y+1] = 0; fooForYellowCellsDeleting();fooForWhiteKingYellowCellsDeleting(); player = 2;}
            if(checkForPlus1(x) && checkForMinus1(y)  && array[x+1][y-1] == 811){ array[x][y] = 11; array[x+1][y-1] = 0; fooForYellowCellsDeleting();fooForWhiteKingYellowCellsDeleting(); player = 2;}
            if(checkForPlus1(x) && checkForPlus1(y)   && array[x+1][y+1] == 811){ array[x][y] = 11; array[x+1][y+1] = 0; fooForYellowCellsDeleting();fooForWhiteKingYellowCellsDeleting(); player = 2;}
            if(checkForMinus1(x) && checkForMinus1(y) && array[x-1][y-1] == 812){ array[x][y] = 12; array[x-1][y-1] = 0; fooForYellowCellsDeleting();fooForBlackKingYellowCellsDeleting(); player = 1;}
            if(checkForMinus1(x) && checkForPlus1(y)  && array[x-1][y+1] == 812){ array[x][y] = 12; array[x-1][y+1] = 0; fooForYellowCellsDeleting();fooForBlackKingYellowCellsDeleting(); player = 1;}
            if(checkForPlus1(x) && checkForMinus1(y)  && array[x+1][y-1] == 812){ array[x][y] = 12; array[x+1][y-1] = 0; fooForYellowCellsDeleting();fooForBlackKingYellowCellsDeleting(); player = 1;}
            if(checkForPlus1(x) && checkForPlus1(y)   && array[x+1][y+1] == 812){ array[x][y] = 12; array[x+1][y+1] = 0; fooForYellowCellsDeleting();fooForBlackKingYellowCellsDeleting(); player = 1;}

            if(checkForMinus2(x) && checkForMinus2(y) && array[x-2][y-2] == 81){ array[x-2][y-2] = 0; array[x-1][y-1] = 0; array[x][y] = 1; whiteKingCheck(x, y); fooForYellowCellsDeleting();fooForWhiteYellowCellsDeleting(); player = 2;}////исправь////////
            if(checkForMinus2(x) && checkForPlus2(y)  && array[x-2][y+2] == 81){ array[x-2][y+2] = 0; array[x-1][y+1] = 0; array[x][y] = 1; whiteKingCheck(x, y); fooForYellowCellsDeleting();fooForWhiteYellowCellsDeleting(); player = 2;}////исправь////////
            if(checkForPlus2(x) && checkForMinus2(y)  && array[x+2][y-2] == 82){ array[x+2][y-2] = 0; array[x+1][y-1] = 0; array[x][y] = 2; blackKingCheck(x, y); fooForYellowCellsDeleting();fooForBlackYellowCellsDeleting(); player = 1;}////исправь////////
            if(checkForPlus2(x) && checkForPlus2(y)   && array[x+2][y+2] == 82){ array[x+2][y+2] = 0; array[x+1][y+1] = 0; array[x][y] = 2; blackKingCheck(x, y); fooForYellowCellsDeleting();fooForBlackYellowCellsDeleting(); player = 1;}////исправь////////

            if(checkForMinus2(x) && checkForMinus2(y) && array[x-2][y-2] == 811){ array[x-2][y-2] = 0; array[x-1][y-1] = 0; array[x][y] = 11; fooForYellowCellsDeleting();fooForWhiteKingYellowCellsDeleting(); player = 2;}////исправь////////
            if(checkForMinus2(x) && checkForPlus2(y)  && array[x-2][y+2] == 811){ array[x-2][y+2] = 0; array[x-1][y+1] = 0; array[x][y] = 11; fooForYellowCellsDeleting();fooForWhiteKingYellowCellsDeleting(); player = 2;}////исправь////////
            if(checkForPlus2(x) && checkForMinus2(y)  && array[x+2][y-2] == 811){ array[x+2][y-2] = 0; array[x+1][y-1] = 0; array[x][y] = 11; fooForYellowCellsDeleting();fooForWhiteKingYellowCellsDeleting(); player = 2;}////исправь////////
            if(checkForPlus2(x) && checkForPlus2(y)   && array[x+2][y+2] == 811){ array[x+2][y+2] = 0; array[x+1][y+1] = 0; array[x][y] = 11; fooForYellowCellsDeleting();fooForWhiteKingYellowCellsDeleting(); player = 2;}////исправь////////

            if(checkForMinus2(x) && checkForPlus2(y)  && array[x-2][y+2] == 812){ array[x-2][y+2] = 0; array[x-1][y+1] = 0; array[x][y] = 12; fooForYellowCellsDeleting();fooForBlackKingYellowCellsDeleting(); player = 1;}////исправь////////
            if(checkForMinus2(x) && checkForMinus2(y) && array[x-2][y-2] == 812){ array[x-2][y-2] = 0; array[x-1][y-1] = 0; array[x][y] = 12; fooForYellowCellsDeleting();fooForBlackKingYellowCellsDeleting(); player = 1;}////исправь////////
            if(checkForPlus2(x) && checkForPlus2(y)   && array[x+2][y+2] == 812){ array[x+2][y+2] = 0; array[x+1][y+1] = 0; array[x][y] = 12; fooForYellowCellsDeleting();fooForBlackKingYellowCellsDeleting(); player = 1;}////исправь////////
            if(checkForPlus2(x) && checkForMinus2(y)  && array[x+2][y-2] == 812){ array[x+2][y-2] = 0; array[x+1][y-1] = 0; array[x][y] = 12; fooForYellowCellsDeleting();fooForBlackKingYellowCellsDeleting(); player = 1;}////исправь////////
        }

        if(colorOfChecker == 81) { fooForYellowCellsDeleting(); fooFor1(x, y);}
        if(colorOfChecker == 82) { fooForYellowCellsDeleting(); fooFor2(x, y);}
        if(colorOfChecker == 811) { fooForYellowCellsDeleting(); fooFor11(x, y);}
        if(colorOfChecker == 812) { fooForYellowCellsDeleting(); fooFor12(x, y);}
    }

    static void fooForYellowCellsDeleting() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) if (array[i][j] == 10) array[i][j] = 0;
        }
    }

    static void fooForWhiteYellowCellsDeleting() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) if (array[i][j] == 81) array[i][j] = 1;
        }
    }

    static void fooForBlackYellowCellsDeleting() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) if (array[i][j] == 82) array[i][j] = 2;
        }
    }

    static void fooForWhiteKingYellowCellsDeleting() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) if (array[i][j] == 811) array[i][j] = 11;
        }
    }

    static void fooForBlackKingYellowCellsDeleting() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) if (array[i][j] == 812) array[i][j] = 12;
        }
    }

    static void fooFor1(int x,int y) {
        if (checkForPlus1(x) && checkForMinus1(y) && array[x+1][y-1] == 0){ array[x+1][y-1] = 10; array[x][y] = 81;}
        if (checkForPlus1(x) && checkForPlus1(y) && array[x+1][y+1] == 0){ array[x+1][y+1] = 10; array[x][y] = 81;}
        if (checkForPlus1(x) && checkForMinus1(y) && array[x+1][y-1] == 1){ array[x+1][y-1] = 1; array[x][y] = 81;}
        if (checkForPlus1(x) && checkForPlus1(y) && array[x+1][y+1] == 1){ array[x+1][y+1] = 1; array[x][y] = 81;}
        if (checkForPlus2(x) && checkForMinus2(y) && (array[x + 1][y - 1] == 2 || array[x + 1][y - 1] == 12) && array[x + 2][y - 2] == 0) { array[x + 2][y - 2] = 10; array[x][y] = 81; if(checkForPlus1(y) && array[x+1][y+1] == 10) array[x+1][y+1] = 0;}
        if (checkForPlus2(x) && checkForPlus2(y) && (array[x + 1][y + 1] == 2 || array[x + 1][y + 1] == 12) && array[x + 2][y + 2] == 0) { array[x + 2][y + 2] = 10; array[x][y] = 81; if(checkForMinus1(y) && array[x+1][y-1] == 10) array[x+1][y-1] = 0;}
    }

    static void fooFor2(int x,int y) {
        if (checkForMinus1(x) && checkForMinus1(y) && array[x-1][y-1] == 0){ array[x-1][y-1] = 10; array[x][y] = 82;}
        if (checkForMinus1(x) && checkForPlus1(y) && array[x-1][y+1] == 0){ array[x-1][y+1] = 10; array[x][y] = 82;}
        if (checkForMinus1(x) && checkForMinus1(y) && array[x-1][y-1] == 2){ array[x-1][y-1] = 2; array[x][y] = 82;}
        if (checkForMinus1(x) && checkForPlus1(y) && array[x-1][y+1] == 2){ array[x-1][y+1] = 2; array[x][y] = 82;}
        if (checkForMinus2(x) && checkForMinus2(y) && (array[x - 1][y - 1] == 1 || array[x - 1][y - 1] == 11) && array[x - 2][y - 2] == 0) { array[x - 2][y - 2] = 10; array[x][y] = 82; if(checkForPlus1(y) && array[x-1][y+1] == 10) array[x-1][y+1] = 0;}
        if (checkForMinus2(x) && checkForPlus2(y) && (array[x - 1][y + 1] == 1 || array[x - 1][y + 1] == 11) && array[x - 2][y + 2] == 0) { array[x - 2][y + 2] = 10; array[x][y] = 82; if(checkForMinus1(y) && array[x-1][y-1] == 10) array[x-1][y-1] = 0;}
    }

    static void fooFor11(int x,int y) {
        if (checkForPlus1(x) && checkForMinus1(y) && array[x+1][y-1] == 0){ array[x+1][y-1] = 10; array[x][y] = 811;}
        if (checkForPlus1(x) && checkForPlus1(y) && array[x+1][y+1] == 0){ array[x+1][y+1] = 10; array[x][y] = 811;}
        if (checkForMinus1(x) && checkForMinus1(y) && array[x-1][y-1] == 0){ array[x-1][y-1] = 10; array[x][y] = 811;}
        if (checkForMinus1(x) && checkForPlus1(y) && array[x-1][y+1] == 0){ array[x-1][y+1] = 10; array[x][y] = 811;}
        if (checkForPlus1(x) && checkForMinus1(y) && array[x+1][y-1] == 1){ array[x+1][y-1] = 1; array[x][y] = 811;}
        if (checkForPlus1(x) && checkForPlus1(y) && array[x+1][y+1] == 1){ array[x+1][y+1] = 1; array[x][y] = 811;}
        if (checkForMinus1(x) && checkForMinus1(y) && array[x-1][y-1] == 1){ array[x-1][y-1] = 1; array[x][y] = 811;}
        if (checkForMinus1(x) && checkForPlus1(y) && array[x-1][y+1] == 1){ array[x-1][y+1] = 1; array[x][y] = 811;}
        if (checkForPlus2(x) && checkForMinus2(y) && (array[x + 1][y - 1] == 2 || array[x + 1][y - 1] == 12) && array[x + 2][y - 2] == 0) { array[x + 2][y - 2] = 10; array[x][y] = 811; if(checkForPlus1(y) && array[x+1][y+1] == 10) array[x+1][y+1] = 0;}
        if (checkForPlus2(x) && checkForPlus2(y) && (array[x + 1][y + 1] == 2 || array[x + 1][y + 1] == 12) && array[x + 2][y + 2] == 0) { array[x + 2][y + 2] = 10; array[x][y] = 811; if(checkForMinus1(y) && array[x+1][y-1] == 10) array[x+1][y-1] = 0;}
        if (checkForMinus2(x) && checkForMinus2(y) && (array[x - 1][y - 1] == 2 || array[x - 1][y - 1] == 12) && array[x - 2][y - 2] == 0) { array[x - 2][y - 2] = 10; array[x][y] = 811; if(checkForPlus1(y) && array[x-1][y+1] == 10) array[x-1][y+1] = 0;}
        if (checkForMinus2(x) && checkForPlus2(y) && (array[x - 1][y + 1] == 2 || array[x - 1][y + 1] == 12) && array[x - 2][y + 2] == 0) { array[x - 2][y + 2] = 10; array[x][y] = 811; if(checkForMinus1(y) && array[x-1][y-1] == 10) array[x-1][y-1] = 0;}
    }

    static void fooFor12(int x,int y) {
        if (checkForPlus1(x) && checkForMinus1(y) && array[x + 1][y - 1] == 0) { array[x + 1][y - 1] = 10; array[x][y] = 812;}
        if (checkForPlus1(x) && checkForPlus1(y) && array[x + 1][y + 1] == 0) { array[x + 1][y + 1] = 10; array[x][y] = 812;}
        if (checkForMinus1(x) && checkForMinus1(y) && array[x - 1][y - 1] == 0) { array[x - 1][y - 1] = 10; array[x][y] = 812;}
        if (checkForMinus1(x) && checkForPlus1(y) && array[x - 1][y + 1] == 0) { array[x - 1][y + 1] = 10; array[x][y] = 812;}
        if (checkForPlus1(x) && checkForMinus1(y) && array[x + 1][y - 1] == 2) { array[x + 1][y - 1] = 2; array[x][y] = 812;}
        if (checkForPlus1(x) && checkForPlus1(y) && array[x + 1][y + 1] == 2) { array[x + 1][y + 1] = 2; array[x][y] = 812;}
        if (checkForMinus1(x) && checkForMinus1(y) && array[x - 1][y - 1] == 2) { array[x - 1][y - 1] = 2; array[x][y] = 812;}
        if (checkForMinus1(x) && checkForPlus1(y) && array[x - 1][y + 1] == 2) { array[x - 1][y + 1] = 2; array[x][y] = 812;}
        if (checkForPlus2(x) && checkForMinus2(y) && (array[x + 1][y - 1] == 1 || array[x + 1][y - 1] == 11) && array[x + 2][y - 2] == 0) { array[x + 2][y - 2] = 10; array[x][y] = 812; if(checkForPlus1(y) && array[x+1][y+1] == 10) array[x+1][y+1] = 0;}
        if (checkForPlus2(x) && checkForPlus2(y) && (array[x + 1][y + 1] == 1 || array[x + 1][y + 1] == 11) && array[x + 2][y + 2] == 0) { array[x + 2][y + 2] = 10; array[x][y] = 812; if(checkForMinus1(y) && array[x+1][y-1] == 10) array[x+1][y-1] = 0;}
        if (checkForMinus2(x) && checkForMinus2(y) && (array[x - 1][y - 1] == 1 || array[x - 1][y - 1] == 11) && array[x - 2][y - 2] == 0) { array[x - 2][y - 2] = 10; array[x][y] = 812; if(checkForPlus1(y) && array[x-1][y+1] == 10) array[x-1][y+1] = 0;}
        if (checkForMinus2(x) && checkForPlus2(y) && (array[x - 1][y + 1] == 1 || array[x - 1][y + 1] == 11) && array[x - 2][y + 2] == 0) { array[x - 2][y + 2] = 10; array[x][y] = 812; if(checkForMinus1(y) && array[x-1][y-1] == 10) array[x-1][y-1] = 0;}
    }


    static Boolean checkForPlus1(int xory) {
        return xory + 1 < 8;
    }

    static Boolean checkForPlus2(int xory) {
        return xory + 2 < 8;
    }

    static Boolean checkForMinus1(int xory) {
        return xory - 1 >= 0;
    }

    static Boolean checkForMinus2(int xory) {
        return xory - 2 >= 0;
    }

    static void whiteKingCheck(int x, int y) {
        if (x == 7) array[x][y] = 11;
    }

    static void blackKingCheck(int x, int y) {
        if (x == 0) array[x][y] = 12;
    }
}
