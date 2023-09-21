package jar;

import java.util.Scanner;

public class Jar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of Quarters in the Jar: ");
        int quarters = scan.nextInt();

        System.out.print("Enter the number of Dimes in the Jar: ");
        int dimes = scan.nextInt();

        System.out.print("Enter the number of Nickels in the Jar: ");
        int nickels = scan.nextInt();

        System.out.print("Enter the number of Pennies in the Jar: ");
        int pennies = scan.nextInt();

        int totalCents = quarters * 25 + dimes * 10 + nickels * 5 + pennies;

        int dollars = totalCents / 100;
        int cents = totalCents % 100;

        System.out.println("The jar contains " + dollars + " dollars and " + cents + " cents.");

        scan.close();
	}

}
