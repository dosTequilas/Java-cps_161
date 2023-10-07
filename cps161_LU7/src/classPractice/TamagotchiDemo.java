package classPractice;

public class TamagotchiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour = 5;
		System.out.println("numb of pets: " + Tamagotchi.getNumbOfPets());
		
		Tamagotchi cookie = new Tamagotchi("Cookie");
		System.out.println("numb of pets: " + Tamagotchi.getNumbOfPets());
		Tamagotchi fifi = new Tamagotchi("FiFi");
		System.out.println("numb of pets: " + Tamagotchi.getNumbOfPets()); 
		System.out.println(cookie);
		System.out.println(fifi);
		
		cookie.timePassed(hour);
		System.out.println(cookie);
		
		cookie.feed();
		System.out.println(cookie);
		
		cookie.play();
		System.out.println(cookie);
		
		cookie.speak();
		fifi.speak();
		}
}
