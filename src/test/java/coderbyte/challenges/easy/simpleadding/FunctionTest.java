package coderbyte.challenges.easy.simpleadding;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Testing simpleadding.Function. 
 * 
 * The question assumed values were between 1 and 1000 so they are the only values tested,
 * with the addition of 0.
 * 
 * @author Carmen Grantham
 *
 */
public class FunctionTest {

    @Test
    public void SimpleAdding_zero_returnsZero() {
        Function function = new Function();
        int result = function.SimpleAdding(0);
        assertEquals("0 should return 0", 0, result);
    }
    
    @Test
    public void SimpleAdding_one_returnsOne() {
        Function function = new Function();
        int result = function.SimpleAdding(1);
        assertEquals("1 should return 1", 1, result);
    }
    
    @Test
    public void SimpleAdding_two_returnsThree() {
        Function function = new Function();
        int result = function.SimpleAdding(2);
        assertEquals("2 should return 3", 3, result);
    }
    
    @Test
    public void SimpleAdding_ninetySix_returnsZero() {
        Function function = new Function();
        int result = function.SimpleAdding(96);
        assertEquals("96 should return 4656", 4656, result);
    }
}
