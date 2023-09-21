package fizzBuzz;

public class FizzBuzzProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 15 == 0) {
				System.out.print("FizzBuzz ");
			} else if (i % 5 == 0) {
				System.out.print("Buzz ");
			} else if (i % 3 == 0){
				System.out.print("Fizz ");
			} else {
				System.out.print(i + " ");
			}
			count++;
			
			if (count % 10 == 0) {
				System.out.println();
			}
		}
	}

}
