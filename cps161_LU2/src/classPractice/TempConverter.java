package classPractice;

public class TempConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double celsius = 14.5;
		double fahrenheit = (celsius * 9 / 5) + 32; // added spaces to keep it readable, let me know if it is wrong
		System.out.println("celsius " + celsius + " is " + fahrenheit + " in fahrenheit");
		
		double newFahrenheit = 85.3;
		double newCelsius = (newFahrenheit - 32 ) * 5 / 9;
		System.out.println("fahrenheit " + newFahrenheit + " is " + newCelsius + " in celsius");
	}

}