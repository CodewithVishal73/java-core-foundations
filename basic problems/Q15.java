import java.util.Scanner;
public class Q15
{
        public static void main(String[] args){
		      int i,m=1;
                      Scanner s= new Scanner(System.in);
	              System.out.print("\nenter first no:");
		      int a= s.nextInt(); 
		      System.out.print("\nenter second no:");
		      int b= s.nextInt();
		      for(i=0;i<b;i++){
				m=m*a;
		      }
		      System.out.println("exponentiation: "+m);
	}
}