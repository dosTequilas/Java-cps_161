package classPractice;

public class TamagotchiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour = 5;
		Tamagotchi cookie = new Tamagotchi("Cookie");
		Tamagotchi fifi = new Tamagotchi("FiFi");
		System.out.println(cookie);
		System.out.println(fifi);
		
		cookie.timePassed(hour);
		System.out.println(cookie);
		
		cookie.feed();
		System.out.println(cookie);
		
		cookie.play();
		System.out.println(cookie);
	}
}
