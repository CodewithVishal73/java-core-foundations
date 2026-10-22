import java.util.Scanner;
public class Q8
{
        public static void main(String[] args){
                      Scanner s= new Scanner(System.in);
	              System.out.print("\nenter number:");
		      int a= s.nextInt(); 
		      if(a%2==0)
				System.out.print("\nnumber is even");
		      else
				System.out.print("\nnumber is odd");
	}
}