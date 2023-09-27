package classDemo;

public class PassingReferenceType {

	public static void changeTime(Time time) {
		time.setHour(20);
		
	}
	public static void greeting(String name) {
		name = "Hi" + name; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time time = new Time(1, 30, 30);
		System.out.println(time);
		changeTime(time);
		System.out.println(time);
		
		String name = new String("Johny");
		System.out.println(name);
		greeting(name);
		System.out.println(name);
	}

}
