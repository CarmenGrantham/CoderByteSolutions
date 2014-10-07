package coderbyte.challenges.easy.lettercapitalize;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test easy.lettercapitalize.Function.
 * 
 * The question assumes text is separated by a single space so
 * that is what is tested here.
 * 
 * @author Carmen Grantham
 *
 */
public class FunctionTest {

    @Test
    public void LetterCapitalize_empty_returnsEmpty() {
        Function function = new Function();
        String result = function.LetterCapitalize("");
        assertEquals("empty text should return empty text", "", result);
    }

    @Test
    public void LetterCapitalize_allLower_returnsCorrectText() {
        Function function = new Function();
        String result = function.LetterCapitalize("hello world");
        assertEquals("'hello world' should return 'Hello World'", "Hello World", result);
    }

    @Test
    public void LetterCapitalize_allUpper_returnsCorrectText() {
        Function function = new Function();
        String result = function.LetterCapitalize("HELLO WORLD");
        assertEquals("'HELLO WORLD' should return 'HELLO WORLD'", "HELLO WORLD", result);
    }
}
