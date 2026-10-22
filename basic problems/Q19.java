import java.util.Scanner;
public class Q19
{
        public static void main(String[] args){
		      int i,c=0;
                      Scanner s= new Scanner(System.in);
	              System.out.print("\nenter number:");
		      int n= s.nextInt(); 
		      for(i=1;i<=n;i++){
				if(n%i==0)
					c++;
		      }
		      if(c==2)
				System.out.println("it is prime number");
		      else
				System.out.println("it is not a prime number");
	}
}