package classPractice;

import java.util.Scanner;

public class FinalGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Double userScore;
		int gradeA = 90;
		int gradeB = 80;
		int gradeC = 70;
		int gradeD = 60;
		
		System.out.println("Please enter your score: ");
		userScore = scan.nextDouble();
		
		if (userScore >= gradeA) {
			System.out.println("A");
		} else if (userScore >= gradeB) {
			System.out.println("B");
		} else if (userScore >= gradeC) {
			System.out.println("C");
		} else if (userScore >= gradeD) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		scan.close();
	}

}