package fizz_buzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Fizz_BuzzTest {

    @Test
    void fizzBuzzCheck() {
        String checkFizzBuzz = Fizz_Buzz.FizzBuzzCheck(6);
        String expected = "Fizz";
        assertEquals(expected,checkFizzBuzz);
    }

    @Test
    void traslate() {
        String traslate = Fizz_Buzz.traslate(0);
        String expected = "không";
        assertEquals(expected,traslate);
    }
    @Test
    void fizzBuzzCheck1() {
        String checkFizzBuzz = Fizz_Buzz.FizzBuzzCheck(10);
        String expected = "Buzz";
        assertEquals(expected,checkFizzBuzz);
    }
    @Test
    void traslate1() {
        String traslate = Fizz_Buzz.traslate(3);
        String expected = 3 +"Ba";
        assertEquals(expected,traslate);
    }
    @Test
    void fizzBuzzCheck2() {
        String checkFizzBuzz = Fizz_Buzz.FizzBuzzCheck(15);
        String expected = "FizzBuzz";
        assertEquals(expected,checkFizzBuzz);
    }
    @Test
    void traslate2() {
        String traslate = Fizz_Buzz.traslate(34);
        String expected = 34 +" Fizz ";
        assertEquals(expected,traslate);
    }
    @Test
    void fizzBuzzCheck3() {
        String checkFizzBuzz = Fizz_Buzz.FizzBuzzCheck(7);
        String expected = 7 + " ";
        assertEquals(expected,checkFizzBuzz);
    }
    @Test
    void traslate3() {
        String traslate = Fizz_Buzz.traslate(22);
        String expected = 22 +"Hai mươi Hai";
        assertEquals(expected,traslate);
    }
    @Test
    void traslate4() {
        String traslate = Fizz_Buzz.traslate(52);
        String expected = 52 +" Buzz ";
        assertEquals(expected,traslate);
    }
    @Test
    void traslate5() {
        String traslate = Fizz_Buzz.traslate(100);
        String expected = 100 +" ";
        assertEquals(expected,traslate);
    }

}