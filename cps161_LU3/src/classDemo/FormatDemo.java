package classDemo;

public class FormatDemo {

	public static void main(String[] args) {
		
		
		System.out.println("Hi");
		System.out.print("\tMy name is Johny.\n");
		System.out.println("Nice to meet you.");
		
		double price = 19.8;
		String item = "chair";
		System.out.printf("The price is: $%-6.2f for each %-12s", price, item);
	}
}
