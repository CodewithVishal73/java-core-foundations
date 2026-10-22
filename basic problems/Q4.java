import java.util.Scanner;
public class Q4
{
        public static void main(String[] args){
                      int area=0,p=0;
                      Scanner s= new Scanner(System.in);
	              System.out.print("\nenter length:");
		      int l= s.nextInt(); 
		      System.out.print("\nenter width:");
		      int b= s.nextInt();
		      area=l*b;
		      p= 2*(l+b);
		       System.out.print("\narea: "+area);
		       System.out.print("\nperimeter: "+p);
	}
}