class Length
{
	public static void main(String args[])
	{   int sum=0;
		String line = "    jasm   ine   ";
		String result=line.trim();
		String split[];
		split=result.split(" ");
		for(int i=0;i<split.length;i++){
			if(split[i].equals("") != true)
		    	sum=sum+split[i].length();

		
		}
		System.out.println(sum);
	}
}