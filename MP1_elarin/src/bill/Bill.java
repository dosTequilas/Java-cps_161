package bill;

import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
        double subtotal = 0.0;

        System.out.print("Input name of dish 1: ");
        String name1 = scan.nextLine();

        System.out.print("Input quantity of dish 1: ");
        int quantity1 = scan.nextInt();

        System.out.print("Input price of dish 1: ");
        double price1 = scan.nextDouble();
        subtotal += quantity1 * price1;

        scan.nextLine(); // Consume newline

        System.out.print("Input name of dish 2: ");
        String name2 = scan.nextLine();

        System.out.print("Input quantity of dish 2: ");
        int quantity2 = scan.nextInt();

        System.out.print("Input price of dish 2: ");
        double price2 = scan.nextDouble();
        subtotal += quantity2 * price2;

        scan.nextLine(); // Consume newline

        System.out.print("Input name of dish 3: ");
        String name3 = scan.nextLine();

        System.out.print("Input quantity of dish 3: ");
        int quantity3 = scan.nextInt();

        System.out.print("Input price of dish 3: ");
        double price3 = scan.nextDouble();
        subtotal += quantity3 * price3;

        double tip = subtotal * 0.18;
        double tax = subtotal * 0.06;
        double total = subtotal + tip + tax;
        
        //Creating a bill
        System.out.println("\nYour bill:");
        System.out.println("Dish                        Quantity  Price     Total");

        System.out.printf("%-30s %5d %10.2f %10.2f%n", name1, quantity1, price1, quantity1 * price1);
        System.out.printf("%-30s %5d %10.2f %10.2f%n", name2, quantity2, price2, quantity2 * price2);
        System.out.printf("%-30s %5d %10.2f %10.2f%n", name3, quantity3, price3, quantity3 * price3);

        System.out.printf("%-30s $%.2f%n", "Subtotal", subtotal);
        System.out.printf("%-30s $%.2f%n", "18% tip (before tax)", tip);
        System.out.printf("%-30s $%.2f%n", "6.00% sales tax", tax);
        System.out.printf("%-30s $%.2f%n", "Total", total);

        scan.close();
	}

}
