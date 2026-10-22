import java.util.Scanner;
public class Q12
{
        public static void main(String[] args){
                      Scanner s= new Scanner(System.in);
	              System.out.print("\nenter first no:");
		      int a= s.nextInt(); 
		      System.out.print("\nenter second no:");
		      int b= s.nextInt();
		      System.out.print("\nenter third no:");
		      int c= s.nextInt();
		      if(a<b && a<c)
				System.out.print("\na is smaller");
		      else if(b<c)
				System.out.print("\nb is smaller");
		      else
				System.out.print("\nc is smaller");
	}
}