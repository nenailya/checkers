
import org.junit.Test;
import sample.Controller;

import static org.junit.Assert.assertEquals;
import static sample.smth.*;



public class test {

    @Test
    public void test1() {
        assertEquals(true, whiteCanKillCheck(1, 0));
    }

    @Test
    public void test2() {
        assertEquals(false, checkForPlus1(9));
    }

    @Test
    public void test3() {
        assertEquals(false, checkForMinus1(0));
    }

    @Test
    public void test4() {
        int[][] array2 = new int[8][8];
        array2[0][1] = 1;
        array2[0][3] = 1;
        array2[0][5] = 1;
        array2[0][7] = 1;
        array2[1][0] = 1;
        array2[1][2] = 1;
        array2[1][4] = 1;
        array2[1][6] = 1;
        array2[2][1] = 1;
        array2[2][3] = 1;
        array2[2][5] = 1;
        array2[2][7] = 1;

        array2[3][0] = 0;
        array2[3][2] = 0;
        array2[3][4] = 0;
        array2[3][6] = 0;
        array2[4][1] = 0;
        array2[4][3] = 0;
        array2[4][5] = 0;
        array2[4][7] = 0;

        array2[5][0] = 2;
        array2[5][2] = 2;
        array2[5][4] = 2;
        array2[5][6] = 2;
        array2[6][1] = 2;
        array2[6][3] = 2;
        array2[6][5] = 2;
        array2[6][7] = 2;
        array2[7][0] = 2;
        array2[7][2] = 2;
        array2[7][4] = 2;
        array2[7][6] = 2;
        assertEquals(array, array2);
    }




}