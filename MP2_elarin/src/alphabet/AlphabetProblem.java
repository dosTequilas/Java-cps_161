package alphabet;

public class AlphabetProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letter = 'a';
		String result = "";
		
		while(letter <= 'z') {
			switch (letter) {
				case 'a', 'e', 'i', 'o', 'u', 'y':
					result = "is a vowel";
					break;
				default: 
					result = "is a consonant";
					break;
			}
			System.out.println(letter + " " + result);
			letter++;
		}
	}
}
