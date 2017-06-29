/*
Question - 
Input - "We are studying" 0
Output - WeAreStudying
Input - "We are studying" 1
Output - WE ArE StudyinG
*/

class AdvancedCamelCase {

	public static void main(String[] args) {
		String inputString = args[0];
		int option = Integer.parseInt(args[1]);
		AdvancedCamelCase c = new AdvancedCamelCase();
		if (option == 0){
			System.out.println(c.camelCase(inputString));
		}

		if (option == 1){
			System.out.println(c.capitalizeFirstAndLast(inputString));
		}
	}

	String camelCase(String sentence){
		String str = "";
		String word[] = sentence.split(" ");
		for(int i=0;i<word.length;i++){
			String lowerCase = Character.toString(word[i].charAt(0));
			String upperCase = lowerCase.toUpperCase();
			String swap = word[i].replaceFirst(lowerCase,upperCase);
			str= str + swap;
		}
		return (str);
	}

	String capitalizeFirstAndLast(String sentence){
		String str = "";
		String words[] = sentence.split(" ");
		for(int i=0;i<words.length;i++){
			String firstCharacter = Character.toString(words[i].charAt(0));
			String lastChracter = Character.toString(words[i].charAt(words[i].length()-1));
			String upperCaseFirstCharacter = firstCharacter.toUpperCase();
			String upperCaseLastCharacter = lastChracter.toUpperCase();
			String swap = words[i].replaceFirst(firstCharacter,upperCaseFirstCharacter);

			String wordWithoutLastIndex = swap.substring(0, swap.length() - 1);
			String withFirstAndLastLetterCapitlized = wordWithoutLastIndex + upperCaseLastCharacter;
			str = str+withFirstAndLastLetterCapitlized + " ";
		}
		return(str);
	}
}