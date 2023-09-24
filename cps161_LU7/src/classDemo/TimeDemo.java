package classDemo;

public class TimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		System.out.println(time.getHour());
//		time.setHour(23);
		
		Time time = new Time();
		time.displayTime();
		System.out.println(time);
		
		Time time2 = new Time(13, 50, 50);
		time2.displayTime();
		System.out.println(time2);
		
		Time time3 = new Time(time2);
		time3.displayTime();
		System.out.println(time3);
		
		System.out.println(time2 == time3 );
		System.out.println(time2.equals(time3));

	}

}
