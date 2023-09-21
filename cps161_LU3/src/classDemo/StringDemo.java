package classDemo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0123456789
		//Good morning Evgenii!
		//charAt, length, toLowerCase, toUpperCase
		//indexOf, subString
		String greeting = "Good morning ";
		String name = "Evgenii";
		String myStr;
		myStr = greeting + name;
		String myStr2 = "good morning Evgenii";
		System.out.println(myStr);
		int size = myStr.length();
		System.out.println("The size of the string is: " + size);
		char myChar = myStr.charAt(19);
		System.out.println(myChar);
		String lowerStr = myStr.toLowerCase();
		System.out.println("myStr is: " + myStr);
		System.out.println("lowerStr is: " + lowerStr);
		int index = myStr.indexOf('g',12);
		//int index = myStr. index0f('z', 12);
		System.out.println("index is: " + index);
		System.out.println(myStr.indexOf("evgenii"));
		System.out.println(myStr.substring(4, 9));
		System.out.println(myStr.equals(myStr2));
		System.out.println(myStr.equalsIgnoreCase(myStr2));		
	}

}
