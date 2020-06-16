package sample;

public class smth {

public static int[][] array;

    static int player = 2;
    static int aa = -1;
    static int bb = -1;

    static void fooForEachCell(int x, int y) {


        int colorOfChecker = array[x][y];


        if (colorOfChecker == 0) { array[x][y] = 0; }


        if (colorOfChecker == 1 && player == 1  && whiteCanKillCheck(x, y)) { fooForWhiteYellowCellsDeleting(); fooForYellowCellsDeleting(); fooFor1(x, y);}
        if (colorOfChecker == 2 && player == 2  && blackCanKillCheck(x, y)) { fooForBlackYellowCellsDeleting(); fooForYellowCellsDeleting(); fooFor2(x, y);}
        if (colorOfChecker == 11 && player == 1 && whiteCanKillCheck(x, y)) { fooForWhiteYellowCellsDeleting(); fooForYellowCellsDeleting(); fooFor11(x, y);}
        if (colorOfChecker == 12 && player == 2 && blackCanKillCheck(x, y)) { fooForBlackYellowCellsDeleting(); fooForYellowCellsDeleting(); fooFor12(x, y);}
        if (colorOfChecker == 1 && player == 2) {}
        if (colorOfChecker == 2 && player == 1) {}
        if (colorOfChecker == 11 && player == 2) {}
        if (colorOfChecker == 12 && player == 1) {}
        if (colorOfChecker == 1 && player == 1  && !whiteCanKillCheck(x, y)) {}
        if (colorOfChecker == 2 && player == 2  && !blackCanKillCheck(x, y)) {}
        if (colorOfChecker == 11 && player == 1 && !whiteCanKillCheck(x, y)) {}
        if (colorOfChecker == 12 && player == 2 && !blackCanKillCheck(x, y)) {}

        if (colorOfChecker == 10) {
            if(checkForMinus1(x) && checkForMinus1(y) && array[x-1][y-1] == 81) { array[x][y] = 1; array[x-1][y-1] = 0; whiteKingCheck(x, y); fooForYellowCellsDeleting(); fooForWhiteYellowCellsDeleting(); player = 2;}
            if(checkForMinus1(x) && checkForPlus1(y)  && array[x-1][y+1] == 81) { array[x][y] = 1; array[x-1][y+1] = 0; whiteKingCheck(x, y); fooForYellowCellsDeleting(); fooForWhiteYellowCellsDeleting(); player = 2;}
            if(checkForPlus1(x) && checkForMinus1(y)  && array[x+1][y-1] == 82) { array[x][y] = 2; array[x+1][y-1] = 0; blackKingCheck(x, y); fooForYellowCellsDeleting(); fooForBlackYellowCellsDeleting(); player = 1;}
            if(checkForPlus1(x) && checkForPlus1(y)   && array[x+1][y+1] == 82) { array[x][y] = 2; array[x+1][y+1] = 0; blackKingCheck(x, y); fooForYellowCellsDeleting(); fooForBlackYellowCellsDeleting(); player = 1;}
            if(checkForMinus1(x) && checkForMinus1(y) && array[x-1][y-1] == 811){ array[x][y] = 11; array[x-1][y-1] = 0; fooForYellowCellsDeleting();fooForWhiteYellowCellsDeleting(); player = 2;}
            if(checkForMinus1(x) && checkForPlus1(y)  && array[x-1][y+1] == 811){ array[x][y] = 11; array[x-1][y+1] = 0; fooForYellowCellsDeleting();fooForWhiteYellowCellsDeleting(); player = 2;}
            if(checkForPlus1(x) && checkForMinus1(y)  && array[x+1][y-1] == 811){ array[x][y] = 11; array[x+1][y-1] = 0; fooForYellowCellsDeleting();fooForWhiteYellowCellsDeleting(); player = 2;}
            if(checkForPlus1(x) && checkForPlus1(y)   && array[x+1][y+1] == 811){ array[x][y] = 11; array[x+1][y+1] = 0; fooForYellowCellsDeleting();fooForWhiteYellowCellsDeleting(); player = 2;}
            if(checkForMinus1(x) && checkForMinus1(y) && array[x-1][y-1] == 812){ array[x][y] = 12; array[x-1][y-1] = 0; fooForYellowCellsDeleting();fooForBlackYellowCellsDeleting(); player = 1;}
            if(checkForMinus1(x) && checkForPlus1(y)  && array[x-1][y+1] == 812){ array[x][y] = 12; array[x-1][y+1] = 0; fooForYellowCellsDeleting();fooForBlackYellowCellsDeleting(); player = 1;}
            if(checkForPlus1(x) && checkForMinus1(y)  && array[x+1][y-1] == 812){ array[x][y] = 12; array[x+1][y-1] = 0; fooForYellowCellsDeleting();fooForBlackYellowCellsDeleting(); player = 1;}
            if(checkForPlus1(x) && checkForPlus1(y)   && array[x+1][y+1] == 812){ array[x][y] = 12; array[x+1][y+1] = 0; fooForYellowCellsDeleting();fooForBlackYellowCellsDeleting(); player = 1;}



            if(checkForMinus2(x) && checkForMinus2(y) && array[x-2][y-2] == 81){ array[x-2][y-2] = 0; array[x-1][y-1] = 0; array[x][y] = 1; whiteKingCheck(x, y); fooForYellowCellsDeleting();fooForWhiteYellowCellsDeleting();  if(whiteCanKillCheck2(x, y) )  {player = 1;aa = x; bb = y; } else {player = 2;}}
            if(checkForMinus2(x) && checkForPlus2(y)  && array[x-2][y+2] == 81){ array[x-2][y+2] = 0; array[x-1][y+1] = 0; array[x][y] = 1; whiteKingCheck(x, y); fooForYellowCellsDeleting();fooForWhiteYellowCellsDeleting();  if(whiteCanKillCheck2(x, y) )  {player = 1;aa = x; bb = y; } else {player = 2;}}
            if(checkForPlus2(x) && checkForMinus2(y)  && array[x+2][y-2] == 82){ array[x+2][y-2] = 0; array[x+1][y-1] = 0; array[x][y] = 2; blackKingCheck(x, y); fooForYellowCellsDeleting();fooForBlackYellowCellsDeleting();  if(blackCanKillCheck2(x, y) )  {player = 2;aa = x; bb = y; } else {player = 1;}}
            if(checkForPlus2(x) && checkForPlus2(y)   && array[x+2][y+2] == 82){ array[x+2][y+2] = 0; array[x+1][y+1] = 0; array[x][y] = 2; blackKingCheck(x, y); fooForYellowCellsDeleting();fooForBlackYellowCellsDeleting();  if(blackCanKillCheck2(x, y) )  {player = 2;aa = x; bb = y; } else {player = 1;}}

            if(checkForMinus2(x) && checkForMinus2(y) && array[x-2][y-2] == 811){ array[x-2][y-2] = 0; array[x-1][y-1] = 0; array[x][y] = 11; fooForYellowCellsDeleting();fooForWhiteYellowCellsDeleting();  if(whiteCanKillCheck2(x, y))           {player = 1;aa = x; bb = y; } else {player = 2;}}
            if(checkForMinus2(x) && checkForPlus2(y)  && array[x-2][y+2] == 811){ array[x-2][y+2] = 0; array[x-1][y+1] = 0; array[x][y] = 11; fooForYellowCellsDeleting();fooForWhiteYellowCellsDeleting();  if(whiteCanKillCheck2(x, y))           {player = 1;aa = x; bb = y; } else {player = 2;}}
            if(checkForPlus2(x) && checkForMinus2(y)  && array[x+2][y-2] == 811){ array[x+2][y-2] = 0; array[x+1][y-1] = 0; array[x][y] = 11; fooForYellowCellsDeleting();fooForWhiteYellowCellsDeleting();  if(whiteCanKillCheck2(x, y))           {player = 1;aa = x; bb = y; } else {player = 2;}}
            if(checkForPlus2(x) && checkForPlus2(y)   && array[x+2][y+2] == 811){ array[x+2][y+2] = 0; array[x+1][y+1] = 0; array[x][y] = 11; fooForYellowCellsDeleting();fooForWhiteYellowCellsDeleting();  if(whiteCanKillCheck2(x, y))           {player = 1;aa = x; bb = y; } else {player = 2;}}

            if(checkForMinus2(x) && checkForMinus2(y) && array[x-2][y-2] == 812){ array[x-2][y-2] = 0; array[x-1][y-1] = 0; array[x][y] = 12; fooForYellowCellsDeleting();fooForBlackYellowCellsDeleting();  if(blackCanKillCheck2(x, y))           {player = 2;aa = x; bb = y; } else {player = 1;}}
            if(checkForMinus2(x) && checkForPlus2(y)  && array[x-2][y+2] == 812){ array[x-2][y+2] = 0; array[x-1][y+1] = 0; array[x][y] = 12; fooForYellowCellsDeleting();fooForBlackYellowCellsDeleting();  if(blackCanKillCheck2(x, y))           {player = 2;aa = x; bb = y; } else {player = 1;}}
            if(checkForPlus2(x) && checkForMinus2(y)  && array[x+2][y-2] == 812){ array[x+2][y-2] = 0; array[x+1][y-1] = 0; array[x][y] = 12; fooForYellowCellsDeleting();fooForBlackYellowCellsDeleting();  if(blackCanKillCheck2(x, y))           {player = 2;aa = x; bb = y; } else {player = 1;}}
            if(checkForPlus2(x) && checkForPlus2(y)   && array[x+2][y+2] == 812){ array[x+2][y+2] = 0; array[x+1][y+1] = 0; array[x][y] = 12; fooForYellowCellsDeleting();fooForBlackYellowCellsDeleting();  if(blackCanKillCheck2(x, y))           {player = 2;aa = x; bb = y; } else {player = 1;}}
        }

        if(colorOfChecker == 81) { fooForYellowCellsDeleting(); fooForWhiteYellowCellsDeleting(); fooFor1(x, y);}
        if(colorOfChecker == 82) { fooForYellowCellsDeleting(); fooForBlackYellowCellsDeleting(); fooFor2(x, y);}
        if(colorOfChecker == 811) { fooForYellowCellsDeleting(); fooForWhiteYellowCellsDeleting(); fooFor11(x, y);}
        if(colorOfChecker == 812) { fooForYellowCellsDeleting(); fooForBlackYellowCellsDeleting(); fooFor12(x, y);}
    }

    static void fooForYellowCellsDeleting() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) if (array[i][j] == 10) array[i][j] = 0;
        }
    }

    static void fooForWhiteYellowCellsDeleting() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {if (array[i][j] == 81) array[i][j] = 1;
            if (array[i][j] == 811) array[i][j] = 11;}
        }

    }

    static void fooForBlackYellowCellsDeleting() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {if (array[i][j] == 82) array[i][j] = 2;
            if (array[i][j] == 812) array[i][j] = 12;}
        }
    }


    static void fooFor1(int x, int y) {
        if (checkForPlus1(x) && checkForMinus1(y) && array[x+1][y-1] == 0) { array[x+1][y-1] = 10; array[x][y] = 81;}
        if (checkForPlus1(x) && checkForPlus1(y)  && array[x+1][y+1] == 0) { array[x+1][y+1] = 10; array[x][y] = 81;}
        if (checkForPlus1(x) && checkForMinus1(y) && array[x+1][y-1] == 1) { array[x+1][y-1] = 1; array[x][y] = 81;}
        if (checkForPlus1(x) && checkForPlus1(y)  && array[x+1][y+1] == 1) { array[x+1][y+1] = 1; array[x][y] = 81;}
        if (checkForPlus2(x) && checkForMinus2(y) && (array[x+1][y-1] == 2 || array[x+1][y-1] == 12) && array[x+2][y-2] == 0) { fooForYellowCellsDeleting(); array[x+2][y-2] = 10; array[x][y] = 81; }
        if (checkForPlus2(x) && checkForPlus2(y)  && (array[x+1][y+1] == 2 || array[x+1][y+1] == 12) && array[x+2][y+2] == 0) { fooForYellowCellsDeleting(); array[x+2][y+2] = 10; array[x][y] = 81; }
    }

    public static void fooFor2(int x, int y) {
        if (checkForMinus1(x) && checkForMinus1(y) && array[x-1][y-1] == 0) { array[x-1][y-1] = 10; array[x][y] = 82;}
        if (checkForMinus1(x) && checkForPlus1(y)  && array[x-1][y+1] == 0) { array[x-1][y+1] = 10; array[x][y] = 82;}
        if (checkForMinus1(x) && checkForMinus1(y) && array[x-1][y-1] == 2) { array[x-1][y-1] = 2; array[x][y] = 82;}
        if (checkForMinus1(x) && checkForPlus1(y)  && array[x-1][y+1] == 2) { array[x-1][y+1] = 2; array[x][y] = 82;}
        if (checkForMinus2(x) && checkForMinus2(y) && (array[x-1][y-1] == 1 || array[x-1][y-1] == 11) && array[x-2][y-2] == 0) {fooForYellowCellsDeleting(); array[x-2][y-2] = 10; array[x][y] = 82;}
        if (checkForMinus2(x) && checkForPlus2(y)  && (array[x-1][y+1] == 1 || array[x-1][y+1] == 11) && array[x-2][y+2] == 0) {fooForYellowCellsDeleting(); array[x-2][y+2] = 10; array[x][y] = 82;}
    }

    static void fooFor11(int x, int y) {
        if (checkForPlus1(x)  && checkForMinus1(y) && array[x+1][y-1] == 0) { array[x+1][y-1] = 10; array[x][y] = 811;}
        if (checkForPlus1(x)  && checkForPlus1(y)  && array[x+1][y+1] == 0) { array[x+1][y+1] = 10; array[x][y] = 811;}
        if (checkForMinus1(x) && checkForMinus1(y) && array[x-1][y-1] == 0) { array[x-1][y-1] = 10; array[x][y] = 811;}
        if (checkForMinus1(x) && checkForPlus1(y)  && array[x-1][y+1] == 0) { array[x-1][y+1] = 10; array[x][y] = 811;}
        if (checkForPlus1(x)  && checkForMinus1(y) && array[x+1][y-1] == 1) { array[x+1][y-1] = 1; array[x][y] = 811;}
        if (checkForPlus1(x)  && checkForPlus1(y)  && array[x+1][y+1] == 1) { array[x+1][y+1] = 1; array[x][y] = 811;}
        if (checkForMinus1(x) && checkForMinus1(y) && array[x-1][y-1] == 1) { array[x-1][y-1] = 1; array[x][y] = 811;}
        if (checkForMinus1(x) && checkForPlus1(y)  && array[x-1][y+1] == 1) { array[x-1][y+1] = 1; array[x][y] = 811;}
        if (checkForPlus2(x)  && checkForMinus2(y) && (array[x+1][y-1] == 2 || array[x+1][y-1] == 12) && array[x+2][y-2] == 0) {fooForYellowCellsDeleting(); array[x+2][y-2] = 10; array[x][y] = 811;  }
        if (checkForPlus2(x)  && checkForPlus2(y)  && (array[x+1][y+1] == 2 || array[x+1][y+1] == 12) && array[x+2][y+2] == 0) {fooForYellowCellsDeleting(); array[x+2][y+2] = 10; array[x][y] = 811;  }
        if (checkForMinus2(x) && checkForMinus2(y) && (array[x-1][y-1] == 2 || array[x-1][y-1] == 12) && array[x-2][y-2] == 0) {fooForYellowCellsDeleting(); array[x-2][y-2] = 10; array[x][y] = 811;  }
        if (checkForMinus2(x) && checkForPlus2(y)  && (array[x-1][y+1] == 2 || array[x-1][y+1] == 12) && array[x-2][y+2] == 0) {fooForYellowCellsDeleting(); array[x-2][y+2] = 10; array[x][y] = 811;  }
    }

    static void fooFor12(int x, int y) {
        if (checkForPlus1(x)  && checkForMinus1(y) && array[x+1][y-1] == 0) { array[x+1][y-1] = 10; array[x][y] = 812;}
        if (checkForPlus1(x)  && checkForPlus1(y)  && array[x+1][y+1] == 0) { array[x+1][y+1] = 10; array[x][y] = 812;}
        if (checkForMinus1(x) && checkForMinus1(y) && array[x-1][y-1] == 0) { array[x-1][y-1] = 10; array[x][y] = 812;}
        if (checkForMinus1(x) && checkForPlus1(y)  && array[x-1][y+1] == 0) { array[x-1][y+1] = 10; array[x][y] = 812;}
        if (checkForPlus1(x)  && checkForMinus1(y) && array[x+1][y-1] == 2) { array[x+1][y-1] = 2; array[x][y] = 812;}
        if (checkForPlus1(x)  && checkForPlus1(y)  && array[x+1][y+1] == 2) { array[x+1][y+1] = 2; array[x][y] = 812;}
        if (checkForMinus1(x) && checkForMinus1(y) && array[x-1][y-1] == 2) { array[x-1][y-1] = 2; array[x][y] = 812;}
        if (checkForMinus1(x) && checkForPlus1(y)  && array[x-1][y+1] == 2) { array[x-1][y+1] = 2; array[x][y] = 812;}
        if (checkForPlus2(x)  && checkForMinus2(y) && (array[x+1][y-1] == 1 || array[x+1][y-1] == 11) && array[x+2][y-2] == 0) {fooForYellowCellsDeleting(); array[x+2][y-2] = 10; array[x][y] = 812;  }
        if (checkForPlus2(x)  && checkForPlus2(y)  && (array[x+1][y+1] == 1 || array[x+1][y+1] == 11) && array[x+2][y+2] == 0) {fooForYellowCellsDeleting(); array[x+2][y+2] = 10; array[x][y] = 812;  }
        if (checkForMinus2(x) && checkForMinus2(y) && (array[x-1][y-1] == 1 || array[x-1][y-1] == 11) && array[x-2][y-2] == 0) {fooForYellowCellsDeleting(); array[x-2][y-2] = 10; array[x][y] = 812;  }
        if (checkForMinus2(x) && checkForPlus2(y)  && (array[x-1][y+1] == 1 || array[x-1][y+1] == 11) && array[x-2][y+2] == 0) {fooForYellowCellsDeleting(); array[x-2][y+2] = 10; array[x][y] = 812;  }
    }


    public static Boolean checkForPlus1(int xory) {
        return xory + 1 < 8;
    }

    public static Boolean checkForPlus2(int xory) {
        return xory + 2 < 8;
    }

    public static Boolean checkForMinus1(int xory) {
        return xory - 1 >= 0;
    }

    public static Boolean checkForMinus2(int xory) {
        return xory - 2 >= 0;
    }

    public static void whiteKingCheck(int x, int y) {
        if (x == 7) array[x][y] = 11;
    }

    public static void blackKingCheck(int x, int y) {
        if (x == 0) array[x][y] = 12;
    }

    public static boolean whiteCanKillCheck(int i, int j) {
        int k = 0;
        int m = 0;
        if (player == 1)
            for (int x = 0; x < 8; x++) {
                for (int y = 0; y < 8; y++)
                {
                    if (((array[x][y] == 1 || array[x][y] == 81) && ((checkForPlus2(x) && checkForMinus2(y) && (array[x+1][y-1] == 2 || array[x+1][y-1] == 12) && (array[x+2][y-2] == 0 || array[x+2][y-2] == 10))||
                            (checkForPlus2(x) && checkForPlus2(y)  && (array[x+1][y+1] == 2 || array[x+1][y+1] == 12) && (array[x+2][y+2] == 0 || array[x+2][y+2] == 10))))
                            || ((array[x][y] == 11|| array[x][y] == 811) &&
                            ((checkForPlus2(x)  && checkForMinus2(y) && (array[x+1][y-1] == 2 || array[x+1][y-1] == 12) && (array[x+2][y-2] == 0 || array[x+2][y-2] == 10))||
                            (checkForPlus2(x)  && checkForPlus2(y)  && (array[x+1][y+1] == 2 || array[x+1][y+1] == 12) && (array[x+2][y+2] == 0 || array[x+2][y+2] == 10))||
                            (checkForMinus2(x) && checkForMinus2(y) && (array[x-1][y-1] == 2 || array[x-1][y-1] == 12) && (array[x-2][y-2] == 0 || array[x-2][y-2] == 10))||
                            (checkForMinus2(x) && checkForPlus2(y)  && (array[x-1][y+1] == 2 || array[x-1][y+1] == 12) && (array[x-2][y+2] == 0 || array[x-2][y+2] == 10)))))
                    {
                        m = m + 1;
                        if(i == x && j == y) k = k + 1;
                    }
                }
            }
        if (m > 0)
            return k > 0;
        else return true;
    }

    public static boolean whiteCanKillCheck2(int i, int j) {
        int k = 0;
        if (player == 1)
            for (int x = 0; x < 8; x++) {
                for (int y = 0; y < 8; y++)
                {
                    if (((array[x][y] == 1 || array[x][y] == 81) && ((checkForPlus2(x) && checkForMinus2(y) && (array[x+1][y-1] == 2 || array[x+1][y-1] == 12) && (array[x+2][y-2] == 0 || array[x+2][y-2] == 10))||
                            (checkForPlus2(x) && checkForPlus2(y)  && (array[x+1][y+1] == 2 || array[x+1][y+1] == 12) && (array[x+2][y+2] == 0 || array[x+2][y+2] == 10))))
                            || ((array[x][y] == 11|| array[x][y] == 811) &&
                            ((checkForPlus2(x)  && checkForMinus2(y) && (array[x+1][y-1] == 2 || array[x+1][y-1] == 12) && (array[x+2][y-2] == 0 || array[x+2][y-2] == 10))||
                                    (checkForPlus2(x)  && checkForPlus2(y)  && (array[x+1][y+1] == 2 || array[x+1][y+1] == 12) && (array[x+2][y+2] == 0 || array[x+2][y+2] == 10))||
                                    (checkForMinus2(x) && checkForMinus2(y) && (array[x-1][y-1] == 2 || array[x-1][y-1] == 12) && (array[x-2][y-2] == 0 || array[x-2][y-2] == 10))||
                                    (checkForMinus2(x) && checkForPlus2(y)  && (array[x-1][y+1] == 2 || array[x-1][y+1] == 12) && (array[x-2][y+2] == 0 || array[x-2][y+2] == 10)))))
                    {

                        if(i == x && j == y) k = k + 1;
                    }
                }
            }
            return k > 0;
    }



    public static boolean blackCanKillCheck(int i, int j) {
        int k = 0;
        int m = 0;
        if (player == 2)
            for (int x = 0; x < 8; x++) {
                for (int y = 0; y < 8; y++)
                    if (((array[x][y] == 2 || array[x][y] == 82) && ((checkForMinus2(x) && checkForMinus2(y) && (array[x-1][y-1] == 1 || array[x-1][y-1] == 11) && (array[x-2][y-2] == 0|| array[x-2][y-2] == 10))||
                            (checkForMinus2(x) && checkForPlus2(y)  && (array[x-1][y+1] == 1 || array[x-1][y+1] == 11) && (array[x-2][y+2] == 0|| array[x-2][y+2] == 10))))
                            || ((array[x][y] == 12|| array[x][y] == 812) &&
                            ((checkForPlus2(x)  && checkForMinus2(y) && (array[x+1][y-1] == 1 || array[x+1][y-1] == 11) && (array[x+2][y-2] == 0 || array[x+2][y-2] == 10))||
                             (checkForPlus2(x)  && checkForPlus2(y)  && (array[x+1][y+1] == 1 || array[x+1][y+1] == 11) && (array[x+2][y+2] == 0 || array[x+2][y+2] == 10))||
                             (checkForMinus2(x) && checkForMinus2(y) && (array[x-1][y-1] == 1 || array[x-1][y-1] == 11) && (array[x-2][y-2] == 0 || array[x-2][y-2] == 10))||
                             (checkForMinus2(x) && checkForPlus2(y)  && (array[x-1][y+1] == 1 || array[x-1][y+1] == 11) && (array[x-2][y+2] == 0 || array[x-2][y+2] == 10)))))
                    {
                        m = m + 1;
                        if(i == x && j == y) k = k + 1;
                    }
            }
        if (m > 0)
            return k > 0;
        else return true;
    }

    public static boolean blackCanKillCheck2(int i, int j) {
        int k = 0;
        if (player == 2)
            for (int x = 0; x < 8; x++) {
                for (int y = 0; y < 8; y++)
                    if (((array[x][y] == 2 || array[x][y] == 82) && ((checkForMinus2(x) && checkForMinus2(y) && (array[x-1][y-1] == 1 || array[x-1][y-1] == 11) && array[x-2][y-2] == 0)||
                            (checkForMinus2(x) && checkForPlus2(y)  && (array[x-1][y+1] == 1 || array[x-1][y+1] == 11) && array[x-2][y+2] == 0)))
                            || ((array[x][y] == 12|| array[x][y] == 812) &&
                            ((checkForPlus2(x)  && checkForMinus2(y) && (array[x+1][y-1] == 1 || array[x+1][y-1] == 11) && (array[x+2][y-2] == 0 || array[x+2][y-2] == 10))||
                                    (checkForPlus2(x)  && checkForPlus2(y)  && (array[x+1][y+1] == 1 || array[x+1][y+1] == 11) && (array[x+2][y+2] == 0 || array[x+2][y+2] == 10))||
                                    (checkForMinus2(x) && checkForMinus2(y) && (array[x-1][y-1] == 1 || array[x-1][y-1] == 11) && (array[x-2][y-2] == 0 || array[x-2][y-2] == 10))||
                                    (checkForMinus2(x) && checkForPlus2(y)  && (array[x-1][y+1] == 1 || array[x-1][y+1] == 11) && (array[x-2][y+2] == 0 || array[x-2][y+2] == 10)))))
                    {

                        if(i == x && j == y) k = k + 1;
                    }
            }
        return k > 0;
    }

    static {
        clean();
    }

    public static void clean() {
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

}
