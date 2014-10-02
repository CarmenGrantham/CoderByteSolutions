package coderbyte.challenges.easy.longestword;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test out coderbyte.challenges.easy.longestword.Function
 * 
 * There is an assumption that the argument for LongestWord is not empty
 * so there will be no null tests.
 * 
 * @author carmen
 *
 */
public class FunctionTest {

	@Test
	public void LongestWord_blankString_returnsEmptyString() {
		Function function = new Function();
		String longestWord = function.LongestWord("  ");
		assertEquals("Blank String should return Empty String", "", longestWord);
	}

	@Test
	public void LongestWord_emptyString_returnsEmptyString() {
		Function function = new Function();
		String longestWord = function.LongestWord("");
		assertEquals("Empty String should return Empty String", "", longestWord);
	}
	
	@Test
	public void LongestWord_oneWord_returnsCorrectWord() {
		Function function = new Function();
		String longestWord = function.LongestWord("Hello");
		assertEquals("Longest word in 'Hello' is 'Hello'", "Hello", longestWord);
	}
		
	@Test
	public void LongestWord_twoWord_returnsCorrectWord() {
		Function function = new Function();
		String longestWord = function.LongestWord("Hello Earthlings!");
		assertEquals("Longest word in 'Hello Earthlings!' is 'Earthlings'", "Earthlings", longestWord);
	}	
	
	@Test
	public void LongestWord_sentence_returnsCorrectWord() {
		Function function = new Function();
		String longestWord = function.LongestWord("In this world we are not alone.");
		assertEquals("Longest word in 'In this world we are not alone.' is 'world'", "world", longestWord);
	}		

	@Test
	public void LongestWord_twoWordsSameLength_returnsCorrectWord() {
		Function function = new Function();
		String longestWord = function.LongestWord("Great Scott");
		assertEquals("Longest word in 'Great Scott' is 'Great'", "Great", longestWord);
	}		

}
