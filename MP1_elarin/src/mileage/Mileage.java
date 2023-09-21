package mileage;

import java.util.Scanner;

public class Mileage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double gallons;
		double miles;
		double milesPerGallon;
		
        System.out.print("Enter the number of gallons of gas consumed: ");
        gallons = scan.nextDouble();

        System.out.print("Enter the distance traveled in miles: ");
        miles = scan.nextDouble();

        milesPerGallon = miles / gallons;

        System.out.println("Miles per gallon for your vehicle: " + String.format("%.1f", milesPerGallon));

        scan.close();
	}

}
