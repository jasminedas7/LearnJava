class Split
{
	public static void main(String args[])
	{
		String sentence = "learning to use use split()";
		String split[];
		split = sentence.split(" ");
		for(int i=0;i<split.length;i++)
		System.out.println(split[i]);

	}
}