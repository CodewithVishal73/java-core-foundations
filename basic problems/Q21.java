import java.util.Scanner;
public class Q21
{
        public static void main(String[] args){
		      int i,m=1,l,n1,n2;
                      Scanner s= new Scanner(System.in);
	              System.out.print("\nenter first no:");
		      int a= s.nextInt(); 
		      System.out.print("\nenter second no:");
		      int b= s.nextInt();
		      n1=a;
		      n2=b;
		      while (b!=0){
   				 int temp = b;
   				 b=a%b;
    				 a=temp;
		      }
		      l= (n1*n2)/a;
		      System.out.println("LCM: "+l);
	}
}