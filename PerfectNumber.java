class PerfectNumber
{
	public static void main(String args[]){
		int sum=0; int i=1;
		int num= 28;
		while(i<=num/2)
		{
			if (num%i==0)
			{
				sum=sum+i;
			}
			if(sum==num)
			{
				System.out.println("Perfect Number");
			}
			else
			{
				System.out.println("Not Perfect Number");
			}
			break;
		  }
		}
	}



