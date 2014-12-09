package coderbyte.challenges.easy.checknum;

import java.util.Scanner;

/**
 * Question: Have the function CheckNums(num1,num2) take both parameters being
 * passed and return the string true if num2 is greater than num1, otherwise
 * return the string false. If the parameter values are equal to each other then
 * return the string -1.
 * 
 * @author Carmen Grantham
 *
 */
class Function {
    String CheckNums(int num1, int num2) {
        if (num2 > num1) {
            return "true";
        } else if (num1 == num2) {
            return "-1";
        }
        return "false";

    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        
        System.out.println("Enter the first number:");
        int num1 = Integer.parseInt(s.nextLine());
        System.out.println("Enter the second number:");
        int num2 = Integer.parseInt(s.nextLine());
        
        System.out.print(c.CheckNums(num1, num2));
    }

}
