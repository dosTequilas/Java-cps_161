package classDemo;

public class NestedLoopDemo {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.print("i is: " + i);
			for (int j = 1; j <= 10; j++) {
				System.out.print(" j is: " + j); 
			}
			System.out.println();
		}
	}

}