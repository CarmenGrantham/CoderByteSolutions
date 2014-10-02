package coderbyte.challenges.easy.firstfactorial;

import java.util.*; 
import java.io.*;

/**
 * Question: Have the function FirstFactorial(num) take the num parameter being passed and return the 
 * 			 factorial of it (ie. if num = 4, return (4 * 3 * 2 * 1)). For the test cases, the range 
 * 			 will be between 1 and 18.
 *  
 * @author Carmen Grantham
 *
 */
class Function {
	int FirstFactorial(int num) {
		int sum = num;
		num--;
		for (int i = num; i > 0; i--) {
			sum *= num;
			num--;
		}
		return sum;
	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		Function c = new Function();
		System.out.print(c.FirstFactorial(Integer.parseInt(s.nextLine())));
	}

}
