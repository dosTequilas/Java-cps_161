package classDemo;

public class MultiwayIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String light = "purple";
		if (light.equals("red")) {
			System.out.println("red means stop");
		} else if(light.equals("yellow")){
			System.out.println("be careful");
		} else if(light.equals("green")) {
			System.out.println("go");
		} else {
			System.out.println("invalid");
		}
		System.out.println("continue driving");
		
//		 ==, >, <, <=, >=, !=
	}

}
