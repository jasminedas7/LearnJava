class ReverseString
{
	public static void main(String args[])
	{ String reverse="";
      String str = "Jasmine";

      for(int i=str.length()-1;i>=0;i--)
      {
      	reverse=reverse+str.charAt(i);
      }
      System.out.println(reverse);
     
	}
}