import java.util.Scanner;
public class Q5
{
        public static void main(String[] args){
                      int i,k=0;
                      Scanner s= new Scanner(System.in);
	              System.out.print("\nenter any no:");
		      int a= s.nextInt(); 
		      for(i=a;i>0;i=i/10){
				k=k+(i%10);
                      }
		      System.out.print("\nsum of digits: "+k);
	}
}