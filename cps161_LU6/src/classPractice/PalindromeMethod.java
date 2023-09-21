package classPractice;

import java.util.Scanner;

public class PalindromeMethod {

	public static String palindromeChecker(String userInput) {
		
		boolean isPalindrome = true;

		for (int i = 0; i < userInput.length() / 2; i++) {
			if (userInput.charAt(i) != userInput.charAt(userInput.length() - i - 1)) {
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome) {
			return "it is a palindrome.";
		} else {
			return "it is not a palindrome.";
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String userWord;

		System.out.println("please enter a string: ");
		userWord = scan.nextLine();
		
		System.out.println(palindromeChecker(userWord));

		scan.close();

	}

}
