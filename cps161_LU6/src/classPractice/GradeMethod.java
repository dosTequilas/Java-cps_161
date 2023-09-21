package classPractice;

import java.util.Scanner;

public class GradeMethod {
	
	public static char finalGrade(double score) {
		if (score >= 90) {
			return 'A';
		} else if (score >= 80) {
			return 'B';
		} else if (score >= 70) {
			return 'C';
		} else if (score >= 60) {
			return 'D';
		} else { 
			return 'F';
		} 
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double userInput;
		
		System.out.println("please enter your score: ");
		userInput = scan.nextDouble();
		
		System.out.println("your grade is: " + finalGrade(userInput));
		
		scan.close();
	}

}
