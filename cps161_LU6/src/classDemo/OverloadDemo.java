package classDemo;

public class OverloadDemo {
	public static int max(int val1, int val2) {
		System.out.println("param int is called");
		if (val1 > val2) {
			return val1;
		} else {
			return val2;
		}
		
	}
	public static double max(double val1, double val2) {
		System.out.println("param double is called");
		if (val1 > val2) {
			return val1;
		} else {
			return val2;
		}
	}
	
	public static int max(int val1, int val2, int val3) {
		return max(max(val1, val2), val3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max(4, 1));
	}

}
