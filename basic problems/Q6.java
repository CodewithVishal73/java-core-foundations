import java.util.Scanner;
public class Q6
{
        public static void main(String[] args){
                      int i,k=0;
                      Scanner s= new Scanner(System.in);
	              System.out.print("\nenter any no:");
		      int a= s.nextInt(); 
		      for(i=a;i>0;i=i/10){
				k=k*10 + (i%10);
                      }
		      System.out.print("\nreverse no: "+k);
	}
}