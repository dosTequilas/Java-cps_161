package classDemo;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [][] myArr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		 for (int i = 0; i < myArr.length; i++) {
			 for (int j = 0; j < myArr[i].length; j++) {
				 System.out.print(myArr[i][j] + " ");
			 }
			 System.out.println();
		 }
	}

}
