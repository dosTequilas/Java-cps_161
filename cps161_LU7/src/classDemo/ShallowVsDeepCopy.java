package classDemo;

public class ShallowVsDeepCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time myTime = new Time (4, 50, 50);
		Time yourTime = new Time (10,30,30);
		//shallow copy
//		System.out.println("shallow copy: \n");
//		
//		System.out.println("myTime: " + myTime);
//		System.out.println("yourTime: " + yourTime);
//		
//		myTime = yourTime; // after this myTime in the heap became an "orphant object"
//		
//		System.out.println("myTime: " + myTime);
//		System.out.println("yourTime: " + yourTime);
//		
//		yourTime.setHour(14);
//		
//		System.out.println("myTime: " + myTime);
//		System.out.println("yourTime: " + yourTime);
//		
//		myTime.setHour(20);
//		
//		System.out.println("myTime: " + myTime);
//		System.out.println("yourTime: " + yourTime);
		
		System.out.println("\ndeep copy: \n");
		
		myTime = new Time(yourTime);
		
		System.out.println("myTime: " + myTime);
		System.out.println("yourTime: " + yourTime);
		
		yourTime.setHour(14);
		
		System.out.println("myTime: " + myTime);
		System.out.println("yourTime: " + yourTime);
		
		myTime.setHour(20);

		System.out.println("myTime: " + myTime);
		System.out.println("yourTime: " + yourTime);
	}

}
