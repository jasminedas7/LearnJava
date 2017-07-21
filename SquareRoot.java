import java.util.Scanner;
class SquareRoot{
	public static void main(String args[]){
		Scanner x = new Scanner(System.in);
		double number;
		do {
		    System.out.println("Enter a number");
		    number=x.nextDouble();
	    	double result = Math.sqrt(number);
	    	System.out.println(result);
	    } while (number>0);

	}
}