
import org.junit.Test;

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




}