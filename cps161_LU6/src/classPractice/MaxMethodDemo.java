package classPractice;

import java.util.Scanner;

public class MaxMethodDemo {
	
	
	
	public static int max(int firstVal, int secondVal) {
		
		if (firstVal < secondVal) {
			return secondVal;
		} else {
			return firstVal;
		}
	}
	
	public static void voidMax(int firstVal, int secondVal) {
		if (firstVal < secondVal) {
			System.out.println("the max value is: " + secondVal);
		} else {
			System.out.println("the max value is: " + firstVal);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int userInput1;
		int userInput2;
		
		System.out.println("enter two integers: ");
		userInput1 = scan.nextInt();
		userInput2 = scan.nextInt();
		
		System.out.println("the max value is: " + max(userInput1, userInput2));
		voidMax(userInput1, userInput2);
		
		scan.close();
	}
	
}
