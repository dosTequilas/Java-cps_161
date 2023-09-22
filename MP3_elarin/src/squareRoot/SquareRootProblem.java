package squareRoot;

import java.util.Scanner;

public class SquareRootProblem {

	public static double mySQRT(double num) {
		double guess = num / 2;
		double lastGuess = 0;

		while (Math.abs(guess - lastGuess) > 0.000001) {
			lastGuess = guess;
			guess = ((num / guess) + guess) / 2;
		}

		return guess;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double userInput;
		double resultNewton;
		double resultMath;

		System.out.println("Enter in N for Newton: ");
		userInput = scan.nextDouble();

		resultMath = Math.sqrt(userInput);
		resultNewton = mySQRT(userInput);

		System.out.println("mySQRT(" + (int)userInput + ") = " + resultNewton);
		System.out.println("Math.sqrt(" + (int)userInput + ") = " + resultMath);

		scan.close();
	}

}
