import java.util.Scanner;
class MathUtils{
	 static int facto(int n){
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		return fact;
	 }
	
}
public class factorial{
		 public static void main(String [] args){
			   Scanner s= new Scanner(System.in);
			   System.out.println("enter the number you want to find fatorial :");
			   int n= s.nextInt();
			   int result= MathUtils.facto(n);
			   System.out.println("Factorial of number : "+result);
			   s.close();
		 }
}