package classDemo;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {1, 2, 3, 4};
		int[] intArray;
		double average;
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		intArray = new int[5];
//		System.out.println(intArray[0]);
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int) (Math.random() * 20) + 1;
			sum += intArray[i];
			
			if (intArray[i] > max) {
				max = intArray[i];
			}
			
			if (intArray[i] < min) {
				min = intArray[i];
			}
			
			
		}
		
		for (int eachElem : intArray) {
			eachElem = eachElem * 2;
			System.out.println(eachElem);
		}
		
		System.out.println("sum is: " + sum);
		System.out.println("average is: " + sum / intArray.length);
		System.out.println("max is: " + max);
		System.out.println("min is: " + min);
	}

}
