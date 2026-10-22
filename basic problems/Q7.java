import java.util.Scanner;
public class Q7
{
        public static void main(String[] args){
                      double area,c;
                      Scanner s= new Scanner(System.in);
	              System.out.print("\nenter radius:");
		      int r= s.nextInt(); 
		      area=3.14 * r * r;
		      c= 2* 3.14* r;
		       System.out.print("\narea: "+area);
		       System.out.print("\ncircumference: "+c);
	}
}