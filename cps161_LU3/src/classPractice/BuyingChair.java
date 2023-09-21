package classPractice;

import java.util.Scanner;

public class BuyingChair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int chairsICanAfford;
		double chairPrice;
		double dollarsIHave;
		double dollarsLeftAfterPurchase;
	
		
		System.out.println("Please enter the money amount: ");
		dollarsIHave = scan.nextDouble();
		
		System.out.println("Please enter the price for each chair: ");
		chairPrice = scan.nextInt();
		
		chairsICanAfford = (int) (dollarsIHave / chairPrice);
		dollarsLeftAfterPurchase = (int) (dollarsIHave % chairPrice);
		
		System.out.println("You can purchase " + chairsICanAfford + " chairs.");
		System.out.println("You will have $" + String.format("%.0f", dollarsLeftAfterPurchase) + " left.");

		scan.close();
	}

}
