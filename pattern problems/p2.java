import java.util.Scanner;
public class p2
{
      	public static void main(String [] args){
		      Scanner s= new Scanner(System.in);
		      System.out.println("enter rows:");
		      int n= s.nextInt();
		      for(int i=0;i<n;i++){
				for(int j=n-i;j>0;j--){
					System.out.print("*");
				}
				System.out.print("\n");
		      }
		  s.close();
	}
}