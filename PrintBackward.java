class PrintBackward
{
	public static void main(String args[])
	{
		int num[]={11,21,31,42,53};
		for(int i=4;i >=0;i--)
		{
			System.out.println(num[i]);
		}
		for (int i=4;i>=0;i--)
		{ 
			if(i%2==0)
			{
 				System.out.print("Numbers present in even index:"+num[i]);
			}
			
		}
	}
}