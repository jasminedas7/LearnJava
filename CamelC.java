//Take Ram is a fool as input and print it as "Ram IS A Fool "
import java.util.Scanner;
class CamelC {
	public static void main(String args[]){
		String sentence="Ram is an fool";String str="";
		String words[]=sentence.split(" ");
		for(int i=0;i<words.length;i++){
			//System.out.println(words[i]);
			String firstCharacter = Character.toString(words[i].charAt(0));
			String lastChracter = Character.toString(words[i].charAt(words[i].length()-1));
			String upperCaseFirstCharacter = firstCharacter.toUpperCase();
			String upperCaseLastCharacter = lastChracter.toUpperCase();
			String swap = words[i].replaceFirst(firstCharacter,upperCaseFirstCharacter);

			String wordWithoutLastIndex = swap.substring(0, swap.length() - 1);
			String withFirstAndLastLetterCapitlized = wordWithoutLastIndex + upperCaseLastCharacter;
			//System.out.println(withFirstAndLastLetterCapitlized);
			str = str+withFirstAndLastLetterCapitlized + " ";
		}
		
			System.out.print(str);
		
		
	}
}