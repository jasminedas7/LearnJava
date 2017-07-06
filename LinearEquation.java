import java.util.Scanner;  
class LinearEquation{  
 public static void main(String args[]){  
   Scanner sc=new Scanner(System.in);  
     
   System.out.println("Enter your number1");  
   int number1=sc.nextInt();  
   System.out.println("Enter your number2");  
   int number2=sc.nextInt();  
   int sum= (2*number1*number2)+number2;
   System.out.println("(2*number1*number2)+number2="+sum);
   sc.close();  
 }  
}   