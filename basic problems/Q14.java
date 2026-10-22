import java.util.Scanner;
public class Q14
{
        public static void main(String[] args){
                      Scanner s= new Scanner(System.in);
	              System.out.print("\nenter number:");
		      int a= s.nextInt(); 
		      if(a>0)
				System.out.print("\nnumber is positive");
		      else if(a==0)
				System.out.print("\nnumber is zero");
		      else
				System.out.print("\nnumber is negative");
	}
}