import java.util.Scanner;
public class Q16
{
        public static void main(String[] args){
		      int i,f=1;
                      Scanner s= new Scanner(System.in);
	              System.out.print("\nenter number:");
		      int a= s.nextInt(); 
		      for(i=a;i>0;i--){
				f=f*i;
		      }
		      System.out.println("factorial: "+f);
	}
}