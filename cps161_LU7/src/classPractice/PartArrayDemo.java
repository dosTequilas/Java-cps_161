package classPractice;

public class PartArrayDemo {
	private Tamagotchi[] pets;
	private int maxNumbOfPets;
	private int currentNumbOfPets;
	
	public PartArrayDemo(int maxNumbOfPets) {
		this.maxNumbOfPets = maxNumbOfPets;
		pets = new Tamagotchi[maxNumbOfPets];
	}
	
	public void add(Tamagotchi newPet) {
//		for (int i = 0; i < pets.length; i++) {
//			if(pets[i] == null) {
//				pets[i] = newPet;
//				break;
//			}
//		}
		if (currentNumbOfPets < maxNumbOfPets) {
			pets[currentNumbOfPets++] = newPet;	
		} else { 
			System.out.println("overflowing, cannot add");
		}
	}
	public void allSpeak() {
//		for (Tamagotchi tamagotchi : pets) {
//			if (tamagotchi != null) {
//				tamagotchi.speak();	
//			}
//		}
		for(int i = 0; i < currentNumbOfPets; i++) {
			pets[i].speak();	
		}
	}
	
	
	
	public void displayAll() {
		for (Tamagotchi tamagotchi : pets) {
			System.out.println(tamagotchi);
		}
	}
	
	
	public static void main (String[] args) {
		PartArrayDemo myPets = new PartArrayDemo(5);
		myPets.add(new Tamagotchi("Fifi"));
		myPets.add(new Tamagotchi("Cookie"));
		myPets.add(new Tamagotchi("Snowshoe"));
//		myPets.add(new Tamagotchi("newDog1"));
//		myPets.add(new Tamagotchi("newDog2"));
//		myPets.add(new Tamagotchi("newDog3"));
		myPets.displayAll();
		myPets.allSpeak()
;	}
}
