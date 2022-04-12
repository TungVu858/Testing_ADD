package baitap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void tomorrow() {
        String tomorrow = NextDayCalculator.tomorrow(1,1,2018);
        String expected = "2/1/2018";
        assertEquals(expected,tomorrow);
    }
    @Test
    void tomorrow2(){
        String tomorrow = NextDayCalculator.tomorrow(31,1,2018);
        String expected = "1/2/2018";
        assertEquals(expected,tomorrow);
    }
    @Test
    void tomorrow3(){
        String tomorrow = NextDayCalculator.tomorrow(30,4,2018);
        String expected = "1/5/2018";
        assertEquals(expected,tomorrow);
    }
    @Test
    void tomorrow4(){
        String tomorrow = NextDayCalculator.tomorrow(28,2,2018);
        String expected = "1/3/2018";
        assertEquals(expected,tomorrow);
    }
    @Test
    void tomorrow5(){
        String tomorrow = NextDayCalculator.tomorrow(28,2,2020);
        String expected = "29/2/2020";
        assertEquals(expected,tomorrow);
    }
    @Test
    void tomorrow6(){
        String tomorrow = NextDayCalculator.tomorrow(31,12,2018);
        String expected = "1/1/2019";
        assertEquals(expected,tomorrow);
    }
}