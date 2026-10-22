import java.util.Scanner;
public class Q13
{
        public static void main(String[] args){
                      Scanner s= new Scanner(System.in);
	              System.out.print("\nenter first no:");
		      int a= s.nextInt(); 
		      System.out.print("\nenter second no:");
		      int b= s.nextInt();
		      System.out.print("\nenter third no:");
		      int c= s.nextInt();
		      if(a>b && a<c || a>c && a<b)
				System.out.print("\na is second larger");
		      else if(b>c && b<a || b<c && b>a)
				System.out.print("\nb is second larger");
		      else
				System.out.print("\nc is second larger");
	}
}