package classDemo;

import java.util.Scanner;

public class MaxMinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int currentNum = 0;
		int biggestNum = Integer.MIN_VALUE;
		int smallestNum = Integer.MAX_VALUE;
		String doWeContinue = "yes";
		
		
		do {
			System.out.println("please enter an integer");
			currentNum = scan.nextInt();
			scan.nextLine();
			
			System.out.println("do you want to continue?");
			doWeContinue = scan.nextLine();
			
			if (currentNum > biggestNum) {
				biggestNum = currentNum;
			}
			if (currentNum < smallestNum) {
				smallestNum = currentNum;
			}

		} while(!doWeContinue.equals("no"));
		System.out.println("The max value you entered is: " + biggestNum);
		System.out.println("The min value you entered is: " + smallestNum);
	}

}
