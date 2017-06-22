class ReverseNumber
{
	public static void main(String args[])
	{
		int reverse=0;int y;
		int num=1200;
		while(num!=0)
		{
			y=num%10;
			reverse=(reverse*10)+y;
			num=num/10;
		}
		System.out.println(reverse);
		

	}
}