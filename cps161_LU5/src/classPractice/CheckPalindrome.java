package classPractice;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userWord;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a string: ");
		userWord = scan.nextLine();
		boolean isPalindrome = true;
		
		for (int i = 0; i < userWord.length() / 2; i++) {
	        if (userWord.charAt(i) != userWord.charAt(userWord.length() - i - 1)) {
	            isPalindrome = false;
	            break;
	        }
	    }
			
		if (isPalindrome) {
			System.out.println("it is a palindrome.");
		} else {
			System.out.println("it is not a palindrome.");
		}
      
		scan.close();		
	}
}


