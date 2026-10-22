import java.util.Scanner;
import java.util.InputMismatchException;
public class E3{
       public static void main(String [] args){

			Scanner s= new Scanner(System.in);
			try{
				System.out.println("enter a integer value:");
				int n= s.nextInt();
				System.out.println("Integer value : "+ n);
			}
			catch(InputMismatchException e){
				System.out.println("Input is not an integer value ");
			}
			finally{
				System.out.println("Finally bllock is executed....");
			}
			s.close();
	}
}