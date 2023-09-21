package temperature;

import java.util.Scanner;

public class TemperatureProblem {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        double totalCentigrade = 0;
        double totalFahrenheit = 0;
        int validInputs = 0;
        double centigrade;
        double fahrenheit;
        double averageCentigrade;
        double averageFahrenheit;
        
        System.out.print("Enter Temp in Centigrade or <= -100.0 to quit: ");
        centigrade = scan.nextDouble();
        
        while (centigrade > -100) {
            fahrenheit = (9.0 / 5.0) * centigrade + 32.0;
            System.out.printf("Temperature: F(%.1f) C(%.1f)%n", fahrenheit, centigrade);
            
            totalFahrenheit += fahrenheit;
            totalCentigrade += centigrade;
            validInputs++;
            
            System.out.print("Enter Temp in Centigrade or <= -100.0 to quit: ");
            centigrade = scan.nextDouble();
        }
        
        if (validInputs > 0) {
            averageCentigrade = totalCentigrade / validInputs;
            averageFahrenheit = totalFahrenheit / validInputs;
            System.out.printf("Average: Centigrade(%.1f) Average: Fahrenheit(%.10f)%n", averageCentigrade, averageFahrenheit);
        } else {
            System.out.println("No valid inputs provided.");
        }
        
        scan.close();
    }
}
