package classPractice;

public class Tamagotchi {

	//String name, int hunger, int boredom
	//toString, feed, play, timePassed
	
	private String name;
	private int hunger;
	private int boredom;
	
	public Tamagotchi(String name) {
		this.name = name;
		hunger = 10;
		boredom = 10; 
	}

	@Override
	public String toString() {
		String str = "";
		if (hunger > 30) {
			str = str + name + " is hungry. ";
		}
		
		if (boredom > 30) {
			str = str + name + " is bored.";
		}
		
		if (str.isEmpty()) {
			str = name + " is happy.";
		}
		
		return "Tamagotchi [name=" + name + ", hunger=" + hunger + ", boredom=" + boredom + "]\n" + str;
	}
	
	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public int getBoredom() {
		return boredom;
	}

	public void setBoredom(int boredom) {
		this.boredom = boredom;
	}

	public void feed() {
		System.out.println("Feeding " + name);
		hunger -= 5;
	}
	
	public void play() {
		System.out.println("Playing with " + name);
		boredom -= 5;
	}
	
	public void timePassed(int hour) {
		System.out.println(hour + " hours went by ...");
		for (int i = 0; i < hour; i++) {
			hunger += 5;
			boredom += 5;
		}
	}

}
