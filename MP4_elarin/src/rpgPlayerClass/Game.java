package rpgPlayerClass;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player1 = new Player("DosT", 450, 10000);
		Player player2 = new Player("Poss", 230, 190 );
		
		System.out.println("before the battle:");
		System.out.println(player1);
		System.out.println(player2);
		System.out.println(player1.getName()+" is battling "+ player2.getName());
		
		player1.battle(player2);
		
		System.out.println("after the battle");
		System.out.println(player1);
		System.out.println(player2);
		System.out.println("battle again");
		player1.battle(player2);
		System.out.println("after the battle");
		System.out.println(player1);
		System.out.println(player2);
	}

}
