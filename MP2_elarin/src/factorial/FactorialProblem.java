package factorial;

import java.util.Scanner;

public class FactorialProblem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char continueFlag;
        int userInput;

        do {
            System.out.print("Enter in N: ");
            userInput = scan.nextInt();
            scan.nextLine();

            long factorial = 1;
            for (int i = 1; i <= userInput; i++) {
                factorial *= i;
            }
            
            System.out.println("Factorial = " + factorial);

            System.out.print("Do you want to continue? (y/n): ");
            continueFlag = scan.nextLine().toLowerCase().charAt(0);
        } while (continueFlag == 'y');

        System.out.println("Have a good day");
        scan.close();
    }

}
