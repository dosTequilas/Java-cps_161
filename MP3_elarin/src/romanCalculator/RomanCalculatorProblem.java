package romanCalculator;

import java.util.Scanner;

public class RomanCalculatorProblem {

	    public static Scanner kbInput = new Scanner(System.in);

	    public static String doMath(char operator, int firstNum, int secondNum) {
	        int result = 0;
	        switch (operator) {
	            case '+':
	                result = firstNum + secondNum;
	                break;
	            case '-':
	                result = firstNum - secondNum;
	                break;
	            case '*':
	                result = firstNum * secondNum;
	                break;
	            case '/':
	                if (secondNum != 0) {
	                    result = firstNum / secondNum;
	                } else {
	                    return "Division by zero is not allowed.";
	                }
	                break;
	            default:
	                return "Invalid operator: " + operator;
	        }

	        return convertToRoman(result);
	    }

	    public static char getOperator() {
	        char operator;
	        do {
	            System.out.println("Please choose an operator: +, -, *, or /");
	            operator = kbInput.nextLine().charAt(0);

	            if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
	                System.out.println("Your operand is bad ... try again:");
	            }
	        } while (operator != '+' && operator != '-' && operator != '*' && operator != '/');

	        return operator;
	    }


	    public static int getOperands() {
	        int num;
	        do {
	            System.out.print("Enter operand: ");
	            String romanNum = kbInput.nextLine().toUpperCase();
	            num = convertFromRoman(romanNum);
	            if (num == -1) {
	                System.out.println("bad character");
	            }
	        } while (num == -1);

	        return num;
	    }

	    public static int convertFromRoman(String romanNum) {
	        int[] values = { 1000, 500, 100, 50, 10, 5, 1 };
	        char[] symbols = { 'M', 'D', 'C', 'L', 'X', 'V', 'I' };

	        int result = 0;
	        int prevValue = 0;

	        for (int i = 0; i < romanNum.length(); i++) {
	            char currentSymbol = romanNum.charAt(i);
	            int currentValue = 0;

	            for (int j = 0; j < symbols.length; j++) {
	                if (symbols[j] == currentSymbol) {
	                    currentValue = values[j];
	                    break;
	                }
	            }

	            if (currentValue == 0) {
	                return -1; // Invalid Roman numeral
	            }

	            if (currentValue <= prevValue || prevValue == 0) {
	                result += currentValue;
	            } else {
	                result += (currentValue - 2 * prevValue);
	            }

	            prevValue = currentValue;
	        }

	        return result;
	    }

	    public static String convertToRoman(int num) {
	        if (num <= 0 || num > 3999) {
	            return "Invalid result: " + num;
	        }

	        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < values.length; i++) {
	            while (num >= values[i]) {
	                result.append(symbols[i]);
	                num -= values[i];
	            }
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {
	    	// TODO Auto-generated method stub
	        String result;
	        do {
	        	char operator = getOperator();
	            int firstOperand = getOperands();
	            int secondOperand = getOperands();
	            result = doMath(operator, firstOperand, secondOperand);

	            System.out.println("Answer = " + result);
	            System.out.println("Do you want to continue? (y/n)");
	        } while (kbInput.nextLine().equalsIgnoreCase("y"));
	        System.out.println("Have a nice day!");
	    }
	}
