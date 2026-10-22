import java.util.Scanner;
public class p1
{
      	public static void main(String [] args){
		      Scanner s= new Scanner(System.in);
		      System.out.println("enter rows:");
		      int n= s.nextInt();
		      for(int i=0;i<n;i++){
				for(int j=1;j<=i+1;j++){
					System.out.print("*");
				}
				System.out.print("\n");
		      }
		  s.close();
	}
}