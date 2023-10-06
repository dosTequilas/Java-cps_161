package classDemo;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray;
//		System.out.println(intArray);
		intArray = new int[5];
//		System.out.println(intArray[0]);
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int) (Math.random() * 20) + 1;
			
		}
		
		for (int eachElem : intArray) {
			eachElem = eachElem * 2;
			System.out.println(eachElem);
		}
	}

}
