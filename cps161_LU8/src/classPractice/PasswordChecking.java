package classPractice;

import java.util.Scanner;

public class PasswordChecking {

	public static boolean isLongEnough(String password) {
		return password.length() >= 10;
	}
	
	public static boolean hasLowerCase(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (Character.isLowerCase(password.charAt(i))) {
				return true;
			} 
		}
		return false;
	}
	
	public static boolean hasUpperCase(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (Character.isUpperCase(password.charAt(i))) {
				return true;
			} 
		}
		return false;
	}
	
	public static boolean hasNumber(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) {
				return true;
			} 
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String pass;
		System.out.println("please enter password: ");
		pass = scan.nextLine();
		
		StringBuilder msg = new StringBuilder();
		
		
		if(!isLongEnough(pass)) {
			msg.append("needs to be at least 10 characters long. ");
			msg.append("\n");
		}
		
		if (!hasLowerCase(pass)) {
			msg.append("needs to contain at least one lower case character. ");
			msg.append("\n");
		}
		
		if (!hasUpperCase(pass)) {
			msg.append("needs to contain at least one upper case character. ");
			msg.append("\n");
		}
		
		if (!hasNumber(pass)) {
			msg.append("at least one character must be a number. ");
			msg.append("\n");
		}
		
		System.out.println(msg);
		
		scan.close();
	}

}
