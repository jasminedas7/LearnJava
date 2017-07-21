import java.util.Scanner;
class Problem{
	public static void main(String args[]){
		Scanner marks = new Scanner(System.in);
		System.out.println("Enter the full mark:");
		int number=marks.nextInt();
		System.out.println("Enter the mark scored:");
		int number1=marks.nextInt();
		double percentageScored=number1*100;
		System.out.println(percentageScored);
		
	}
}