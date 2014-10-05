package coderbyte.challenges.easy.simpleadding;

import java.util.*;
import java.io.*;

/**
 * Question: Have the function SimpleAdding(num) add up all the numbers from 1 to num. 
 *           For the test cases, the parameter num will be any number from 1 to 1000. 
 * 
 * @author Carmen Grantham
 *
 */
class Function {
    int SimpleAdding(int num) {

        // code goes here
        /*
         * Note: In Java the return type of a function and the parameter types
         * being passed are defined, so this return call must match the return
         * type of the function. You are free to modify the return type.
         */

        int total = 0;
        for (int i = 1; i <= num; i++) {
            total += i;
        }

        return total;

    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        System.out.print(c.SimpleAdding(Integer.parseInt(s.nextLine())));
    }

}