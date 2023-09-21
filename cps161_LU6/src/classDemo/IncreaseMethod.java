package classDemo;

public class IncreaseMethod {
	
	public static int increase (int numb) {
		numb++;
		return numb;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numb = 5 ;
		System.out.println("the value of number is: " + numb);
		numb = increase(numb);
		System.out.println("after increase");
		System.out.println("the value of number is: " + numb);
	}

}
