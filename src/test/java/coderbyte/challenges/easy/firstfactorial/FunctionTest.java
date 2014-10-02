package coderbyte.challenges.easy.firstfactorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class FunctionTest {

    @Test
    public void FirstFactorial_zero_returnsZero() {
        Function function = new Function();
        int result = function.FirstFactorial(0);
        assertEquals("0 returns 0", 0, result);
    }

    @Test
    public void FirstFactorial_minusThree_returnsMinusThree() {
        Function function = new Function();
        int result = function.FirstFactorial(-3);
        assertEquals("-3 returns -3", -3, result);
    }

    @Test
    public void FirstFactorial_one_returnsOne() {
        Function function = new Function();
        int result = function.FirstFactorial(1);
        assertEquals("1 returns 1", 1, result);
    }

    @Test
    public void FirstFactorial_two_returnsTwo() {
        Function function = new Function();
        int result = function.FirstFactorial(2);
        assertEquals("2 returns 2", 2, result);
    }

    @Test
    public void FirstFactorial_three_returnsSix() {
        Function function = new Function();
        int result = function.FirstFactorial(3);
        assertEquals("3 returns 6", 6, result);
    }

    @Test
    public void FirstFactorial_four_returnsTwentyFour() {
        Function function = new Function();
        int result = function.FirstFactorial(4);
        assertEquals("4 returns 24", 24, result);
    }

    @Test
    public void FirstFactorial_seven_returnsFiveThousandAndForty() {
        Function function = new Function();
        int result = function.FirstFactorial(7);
        assertEquals("7 returns 5040", 5040, result);
    }
}
