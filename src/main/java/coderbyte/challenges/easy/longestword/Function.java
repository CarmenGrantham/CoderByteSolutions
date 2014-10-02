package coderbyte.challenges.easy.longestword;

import java.util.*;
import java.io.*;

/**
 * Question: Have the function LongestWord(sen) take the sen parameter being passed and return the 
 * 			 largest word in the string. If there are two or more words that are the same length, 
 * 			 return the first word from the string with that length. Ignore punctuation and assume 
 * 			 sen will not be empty.
 *  
 * @author Carmen Grantham
 *
 */
class Function {
	String LongestWord(String sen) {

		String[] split = sen.split("[^a-zA-Z]");
		String longestWord = "";
		for (int i = 0; i < split.length; i++) {
			String value = split[i];
			if (value.length() > longestWord.length()) {
				longestWord = value;
			}
		}

		// code goes here
		/*
		 * Note: In Java the return type of a function and the parameter types
		 * being passed are defined, so this return call must match the return
		 * type of the function. You are free to modify the return type.
		 */

		return longestWord;

	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		Function c = new Function();
		System.out.print(c.LongestWord(s.nextLine()));
	}

}
