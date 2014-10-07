package coderbyte.challenges.easy.lettercapitalize;

import java.util.*;
import java.io.*;

/**
 * Question: Have the function LetterCapitalize(str) take the str parameter being 
 *           passed and capitalize the first letter of each word. Words will be 
 *           separated by only one space. 
 * 
 * @author Carmen Grantham
 *
 */
class Function {
    String LetterCapitalize(String str) {

        // code goes here
        /*
         * Note: In Java the return type of a function and the parameter types
         * being passed are defined, so this return call must match the return
         * type of the function. You are free to modify the return type.
         */
        StringTokenizer st = new StringTokenizer(str);
        StringBuffer buffer = new StringBuffer("");
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            buffer.append(token.substring(0, 1).toUpperCase());
            buffer.append(token.substring(1));
            buffer.append(" ");
        }

        return buffer.toString().trim();

    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        System.out.print(c.LetterCapitalize(s.nextLine()));
    }

}
