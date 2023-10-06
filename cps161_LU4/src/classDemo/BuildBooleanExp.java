package classDemo;

public class BuildBooleanExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 5;
		
//		if (score > 0 && score < 10) {
//			System.out.println("Score is between 0 and 10");
//		} else {
//			System.out.println("Score is not between 0 and 10");
//		}
		
		if (score < 0 || score > 10) {
			System.out.println("Score is less than 0 or greater than 10");
		} else {
			System.out.println("Score is not less than 0 or greater than 10");
		}
		
//		practice true or false
//		count is 0 , limit is 10 , x is 9 , y is 7
//		(count == 0) && (limit < 20) true
//		count == 0 && limit < 20 true
//		(limit > 20) || (count < 5) true
//		!(count ==12) true
//		(count == 1) && (x < y) false
//		(count < 10) || (x < y) true
//		!(((count < 10) || (x < y) ) && (count >=0)) false
		
//		if ((kids != 0) && (toys/kids >= 2) {
//			System.out.println("each kid has more than 2 toys");
//		}
		
	}

}
