package classPractice;

import java.util.Scanner;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String word;
		String processing = "process something";
		String question = "do you want to continue?";
		
		do {
			System.out.println(processing);
			System.out.println(question);
			word = scan.nextLine(); 
		} while(word.toLowerCase().charAt(0) == 'y');
		System.out.println("outside of the loop");
	}

}
