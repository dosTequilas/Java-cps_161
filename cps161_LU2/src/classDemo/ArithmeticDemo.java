package classDemo;

public class ArithmeticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumb = 10;
		int secondNumb = 3;
		
		int addResult;
		int subResult;
		int mulResult;
		int divResult;
		int modResult;
	
		double doubleDivResult;
		
		addResult = firstNumb + secondNumb;
		subResult = firstNumb - secondNumb;
		mulResult = firstNumb * secondNumb;
		divResult = firstNumb / secondNumb;
		modResult = firstNumb % secondNumb;
		
		doubleDivResult = (double)firstNumb / secondNumb;
		
		System.out.println("addResult is: " + addResult);
		System.out.println("subResult is: " + subResult);
		System.out.println("mulResult is: " + mulResult);
		System.out.println("divResult is: " + divResult);
		System.out.println("doubleDivResult is: " + doubleDivResult);
		System.out.println("modResult is: " + modResult);
		System.out.println(10/3+6.5);
		
		//casting:short int long float double
		
		double myDouble = 5.5;
		int myInt = 7;
		String myStr = "Hi";
		
		myInt = (int)myDouble;
		myDouble = myInt;

		System.out.println("myDouble: "+ myDouble);
		System.out.println("myInt: "+ myInt);
		
		//++ -- 
		int n = 2;
		//n++;
		//++n;
		System.out.println("n is: " + n);
		System.out.println((++n)*2);
		
	}

}
