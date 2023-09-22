package stringMethod;

public class StringMethodProblem {

	public static int countOccurrences(String text, String substring) {
		int count = 0;
		int index = text.indexOf(substring);

		while (index != -1) {
			index = text.indexOf(substring, index + 1);
			count++;
		}
		return count;
	}

	public static int countUppercaseLetters(String text) {
		int count = 0;
		int length = text.length();

		for (int i = 0; i < length; i++) {
			char c = text.charAt(i);
			if (Character.isUpperCase(c)) {
				count++;
			}
		}
		return count;
	}

	public static String pigLatin(String word) {
	    word = word.toLowerCase();
	    int firstVowelIndex = -1;

	    for (int i = 0; i < word.length(); i++) {
	        char c = word.charAt(i);
	        if ("aeiou".contains(String.valueOf(c))) {
	            firstVowelIndex = i;
	            break;
	        }
	    }

	    if (firstVowelIndex == -1) {
	        return word;
	    } else {
	        String prefix = word.substring(0, firstVowelIndex);
	        String suffix = word.substring(firstVowelIndex);
	        return suffix + prefix;
	    }
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String mainString = "Parked in a van down by the river bank";
        String substring = "an";
        System.out.println("Occurrences of '" + substring + "' in '" + mainString + "': " + countOccurrences(mainString, substring));

        String inputString = "Today is Friday, Sep 22nd 2023.";
        System.out.println("Uppercase letters count in '" + inputString + "': " + countUppercaseLetters(inputString));

        String pigLatinWord = "hello";
        System.out.println("Pig Latin of '" + pigLatinWord + "': " + pigLatin(pigLatinWord));
	}

}
