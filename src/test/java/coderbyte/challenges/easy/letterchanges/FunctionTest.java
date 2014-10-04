package coderbyte.challenges.easy.letterchanges;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test class for letterchanges.Function
 * 
 * @author Carmen Grantham
 *
 */
public class FunctionTest {

    @Test
    public void LetterChanges_null_returnsNull() throws Exception {
        Function function = new Function();
        String result = function.LetterChanges(null);
        assertNull("null input must return null", result);
    }

    @Test
    public void FirstReverse_emptyString_ReturnsEmptyString() {
        Function function = new Function();
        String result = function.LetterChanges("");
        assertEquals("empty string must return empty string", "", result);
    }

    @Test
    public void FirstReverse_blankString_ReturnsBlankString() {
        Function function = new Function();
        String result = function.LetterChanges("    ");
        assertEquals("blank string must return empty string", "", result);
    }
    

    @Test
    public void FirstReverse_vowels_ReturnsCorrectText() {
        Function function = new Function();
        String result = function.LetterChanges("zdhnt");
        assertEquals("'zdhnt' must return 'AEIOU'", "AEIOU", result);
    }
    
    @Test
    public void FirstReverse_plainSentence_ReturnsCorrectText() {
        Function function = new Function();
        String result = function.LetterChanges("A fox is an animal");
        assertEquals("'A fox is an animal' must return 'B gpy jt bO bOjnbm'", "B gpy jt bO bOjnbm", result);
    }    
    
    @Test
    public void FirstReverse_sentenceWithPuncutation_ReturnsCorrectText() {
        Function function = new Function();
        String result = function.LetterChanges("I couldn't believe my eyes!");
        assertEquals("'I couldn't believe my eyes!' must return 'J dpvmEO'U cfmjfwf nz fzft!'", "J dpvmEO'U cfmjfwf nz fzft!", result);
    }
    
    @Test
    public void FirstReverse_lowerAlphabet_ReturnsCorrectText() {
        Function function = new Function();
        String result = function.LetterChanges("abcdefghijklmnopqrstuvwxyz");
        assertEquals("'abcdefghijklmnopqrstuvwxyz' must return 'bcdEfghIjklmnOpqrstUvwxyzA'", "bcdEfghIjklmnOpqrstUvwxyzA", result);
    }      
    
    @Test
    public void FirstReverse_upperAlphabet_ReturnsCorrectText() {
        Function function = new Function();
        String result = function.LetterChanges("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        assertEquals("'ABCDEFGHIJKLMNOPQRSTUVWXYZ' must return 'BCDEFGHIJKLMNOPQRSTUVWXYZA'", "BCDEFGHIJKLMNOPQRSTUVWXYZA", result);
    }      
}
