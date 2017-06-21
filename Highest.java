class Highest
{
	public static void main(String args[])
	{

		int x=3,y=3,z=1;
		if((x>y)&&(x>z) || (x=y) )
		{
			System.out.println(x);
		}
		else if((y>x)&&(y>z) || (y=z))
		{
			System.out.println(y);
		}
		else if((z>x)&&(z>y) || (z=x))
		{
			System.out.println(z);
		}

	}
}