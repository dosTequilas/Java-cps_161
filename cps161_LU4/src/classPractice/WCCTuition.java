package classPractice;

import java.util.Scanner;

public class WCCTuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		
		String isFaceToFace;
		String isInDistrict;
		int numbOfCreditHours;
		Double rate = null;
		Double tuition;
		
		
		
		System.out.println("Are you taking face to face cources? ");
		isFaceToFace = scan.nextLine();
		
		System.out.println("Are you in district? ");
		isInDistrict = scan.nextLine();
		
		System.out.println("Please enter the credit hours you are taking: ");
		numbOfCreditHours = scan.nextInt();
		
		
		if (isFaceToFace.equals("yes") && isInDistrict.equals("yes")) {
			rate = 99.0;
		} else if (isFaceToFace.equals("yes") && isInDistrict.equals("no")) {
			rate = 176.0;
		} else if (isFaceToFace.equals("no") && isInDistrict.equals("yes")) {
			rate = 112.0;
		} else if (isFaceToFace.equals("no") && isInDistrict.equals("no")) {
			rate = 125.0;
		}
		
		
		tuition = rate * numbOfCreditHours;
		System.out.printf("Your rate is: $%.2f\n", rate);
		System.out.printf("Your tuition is: $%.2f\n", tuition);

		scan.close();
	}

}
