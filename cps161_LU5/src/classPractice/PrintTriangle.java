package classPractice;

import java.util.Scanner;

public class PrintTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (char i = 'a'; i <= 'z'; i++) {
			for (char j = 'a'; j <= 'z'; j++) {
				System.out.print(i);
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");	
			}
			System.out.println(" ");
		}
	}

}
