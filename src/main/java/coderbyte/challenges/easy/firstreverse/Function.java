package coderbyte.challenges.easy.firstreverse;

import java.util.*;
import java.io.*;

/**
 * Question: Have the function FirstReverse(str) take the str parameter being
 * passed and return the string in reversed order. Use the Parameter Testing
 * feature in the box below to test your code with different arguments.
 * 
 * @author Carmen Grantham
 */
class Function {
    String FirstReverse(String str) {

        // code goes here
        /*
         * Note: In Java the return type of a function and the parameter types
         * being passed are defined, so this return call must match the return
         * type of the function. You are free to modify the return type.
         */

        if (str == null) {
            return null;
        }
        String newStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            newStr = newStr + str.substring(i, i + 1);
        }

        str = newStr;

        return str;

    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        System.out.print(c.FirstReverse(s.nextLine()));
    }

}
