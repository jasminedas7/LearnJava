class SplitMerge {
	public static void main(String args[]){
		String sentence="Ram is a nice boy";String str="";
		String word[]=sentence.split(" ");
		for(int i=0;i<word.length;i++){
			// System.out.println(word[i]);
			String lowerCase = Character.toString(word[i].charAt(0));
			String upperCase = lowerCase.toUpperCase();
			String swap = word[i].replaceFirst(lowerCase,upperCase);
			//System.out.println(swap);
			str= str + swap;
		}
		System.out.println(str);
	}
}
