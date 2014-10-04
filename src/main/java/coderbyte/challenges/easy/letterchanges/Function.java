package coderbyte.challenges.easy.letterchanges;

import java.util.*; 
import java.io.*;

/**
 * Question: Have the function LetterChanges(str) take the str parameter being passed and modify it using 
 *           the following algorithm. Replace every letter in the string with the letter following it in 
 *           the alphabet (ie. c becomes d, z becomes a). Then capitalize every vowel in this new string 
 *           (a, e, i, o, u) and finally return this modified string. 

 * 
 * @author Carmen Grantham
 *
 */
class Function {
    String LetterChanges(String str) {

        // code goes here
        /*
         * Note: In Java the return type of a function and the parameter types
         * being passed are defined, so this return call must match the return
         * type of the function. You are free to modify the return type.
         */

        if (str == null) {
            return null;
        }

        if ("".equals(str.trim())) {
            return "";
        }

        String replaceStr = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            char lowerChar = str.toLowerCase().charAt(i);

            if (alphabet.indexOf(lowerChar) >= 0) {
                if (lowerChar == 'z') {
                    replaceStr += 'A';
                } else {
                    char newChar = (char) (currentChar + 1);
                    switch (newChar) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        newChar = String.valueOf(newChar).toUpperCase().charAt(0);
                        break;
                    }
                    replaceStr += newChar;
                }

            } else {
                replaceStr += currentChar;
            }
        }

        return replaceStr;

    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        System.out.print(c.LetterChanges(s.nextLine()));
    }

}
