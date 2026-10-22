import java.util.Scanner;
public class Q20
{
        public static void main(String[] args){
		      int i,m=1;
                      Scanner s= new Scanner(System.in);
	              System.out.print("\nenter first no:");
		      int a= s.nextInt(); 
		      System.out.print("\nenter second no:");
		      int b= s.nextInt();
		        while (b!=0) {
   				 int temp = b;
   				 b=a%b;
    				 a=temp;
			}

		      System.out.println("HCF: "+a);
	}
}