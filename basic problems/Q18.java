import java.util.Scanner;
public class Q18
{
        public static void main(String[] args){
		      int i,a=0,b=1,sum=0;
                      Scanner s= new Scanner(System.in);
	              System.out.print("\nenter number:");
		      int n= s.nextInt(); 
		      System.out.println("fibonaaci series: ");
		      for(i=0;i<n;i++){
				System.out.print(" "+sum);
				a=b;
				b=sum;
				sum=a+b;
		      }
	}
}