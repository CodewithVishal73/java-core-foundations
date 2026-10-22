import java.util.Scanner;
public class Q10
{
        public static void main(String[] args){
                      Scanner s= new Scanner(System.in);
	              System.out.print("\nenter first no:");
		      int a= s.nextInt(); 
		      System.out.print("\nenter second no:");
		      int b= s.nextInt();
		      if(a<b)
				System.out.print("\na is smaller than b");
		      else
				System.out.print("\nb is smaller than a");
	}
}