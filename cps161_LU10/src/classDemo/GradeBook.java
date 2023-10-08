package classDemo;

import java.util.Scanner;

public class GradeBook {

	private double[][] grades;
	private double[] stdnAverage;
	private double[] quizAverage;
	private String[] stdnName;
	private int numbOfStdn;
	private int numbOfQuiz;
	public static Scanner scan = new Scanner(System.in);

	public GradeBook() {
		System.out.println("enter the number of students: ");
		numbOfStdn = scan.nextInt();
		System.out.println("enter the number of quizes: ");
		numbOfQuiz = scan.nextInt();
		scan.nextLine();
		grades = new double[numbOfStdn][numbOfQuiz];
		stdnAverage = new double[numbOfStdn];
		quizAverage = new double[numbOfQuiz];
		stdnName = new String[numbOfStdn];
		fillGrades();
		fillStudentAverage();
		fillQuizAverage();

	}

	public void fillGrades() {
		for (int i = 0; i < numbOfStdn; i++) {
			System.out.println("enter the student name: ");
			stdnName[i] = scan.nextLine();
			for (int j = 0; j < numbOfQuiz; j++) {
				System.out.println("enter the grade for quiz " + (j + 1));
				grades[i][j] = scan.nextDouble();
			}
			scan.nextLine();
		}
	}

	public void fillStudentAverage() {
		double sum = 0;
		double average;
		for (int i = 0; i < numbOfStdn; i++) {
			sum = 0;
			for (int j = 0; j < numbOfQuiz; j++) {
				sum = sum + grades[i][j];
			}
			average = sum / numbOfQuiz;
			stdnAverage[i] = average;
		}
	}

	public void fillQuizAverage() {
		double sum = 0;
		double average;
		for (int i = 0; i < numbOfQuiz; i++) {
			sum = 0;
			for (int j = 0; j < numbOfStdn; j++) {
				sum = sum + grades[j][i];
			}
			average = sum / numbOfStdn;
			quizAverage[i] = average;
		}

	}

	public void display() {

		System.out.printf("%-20s%-20s%-20s%-20s%n", "name", "quiz1", "quiz2", "average");

		for (int i = 0; i < numbOfStdn; i++) {
			System.out.printf("%-20s", stdnName[i]);
			for (int j = 0; j < numbOfQuiz; j++) {
				System.out.printf("%-20.1f", grades[i][j]);
			}
			System.out.printf("%-20.1f%n", stdnAverage[i]);
		}

		System.out.printf("%-20s", "quiz average:");
		for (int i = 0; i < numbOfQuiz; i++) {
			System.out.printf("%-20.1f", quizAverage[i]);
		}
	}

	public static void main(String[] args) {
		GradeBook myBook = new GradeBook();
		myBook.display();
	}

}
