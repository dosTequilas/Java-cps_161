package classDemo;

import java.util.Scanner;


public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//7.8
		
		Scanner scan = new Scanner(System.in);
		int myInt, yourInt;
		double myDouble;
		String myStr;
		System.out.println("Please enter 2 integers: ");
		myInt = scan.nextInt();
		yourInt = scan.nextInt();
		System.out.println("Please enter a double value: ");
		myDouble = scan.nextDouble();
		System.out.println("Please enter a string :");
		//myStr = scan.next();
		scan.nextLine();
		myStr = scan.nextLine();
		System.out.println("myInt: " + myInt);
		System.out.println("yourInt: " + yourInt);
		System.out.println("myDouble: " + myDouble);
		System.out.println("myStr: " + myStr);
		
		scan.close();
	}

}