package classDemo;

public class BreakContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				System.exit(0);
			}
			System.out.println(i);
		}
		System.out.println("outside the loop");
	}

}
