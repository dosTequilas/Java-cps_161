package classPractice;

import java.util.Scanner;

public class BoundDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startingValue;
		int upperBound;
		int step;
		int stringCount = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the starting value: ");
		startingValue = scan.nextInt();
		System.out.println("please enter the upper bound: ");
		upperBound = scan.nextInt();
		System.out.println("please enter the step: ");
		step = scan.nextInt();

		for (int i = startingValue; i <= upperBound; i = i + step) {
			System.out.print(i + " ");
			stringCount++;
			if (stringCount % 5 == 0) {
				System.out.println();
			}
		}
		scan.close();
	}

}
