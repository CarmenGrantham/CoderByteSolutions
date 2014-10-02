package coderbyte.challenges.easy.firstreverse;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test class for firstreverse.Function
 * 
 * @author Carmen Grantham
 *
 */
public class FunctionTest {

	@Test
	public void FirstReverse_nullInput_ReturnsNull() {
		Function function = new Function();
		String result = function.FirstReverse(null);
		assertNull("null input must return null", result);
	}

	@Test
	public void FirstReverse_emptyString_ReturnsEmptyString() {
		Function function = new Function();
		String result = function.FirstReverse("");
		assertEquals("empty string must return empty string", "", result);
	}	

	@Test
	public void FirstReverse_basic_Returnscisab() {
		Function function = new Function();
		String result = function.FirstReverse("basic");
		assertEquals("basic in reverse = cisab", "cisab", result);
	}	

	@Test
	public void FirstReverse_TextWithSpaces_ReturnsCorrectText() {
		Function function = new Function();
		String result = function.FirstReverse("i am a cat");
		assertEquals("'i am a cat' in reverse = 'tac a ma i'", "tac a ma i", result);
	}	

	@Test
	public void FirstReverse_TextWithMixedCase_ReturnsCorrectText() {
		Function function = new Function();
		String result = function.FirstReverse("YellOw");
		assertEquals("'YellOw' in reverse = 'wOlleY'", "wOlleY", result);
	}	

	@Test
	public void FirstReverse_TextWithMixedCaseAndSpaces_ReturnsCorrectText() {
		Function function = new Function();
		String result = function.FirstReverse("Great Work Jordan!");
		assertEquals("'Great Work Jordan!' in reverse = '!nadroJ kroW taerG'", "!nadroJ kroW taerG", result);
	}	
	
}
