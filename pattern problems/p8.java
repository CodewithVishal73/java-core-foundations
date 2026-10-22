import java.util.Scanner;
public class p8
{
      	public static void main(String [] args){
		      Scanner s= new Scanner(System.in);
		      System.out.println("enter rows:");
		      int n= s.nextInt();
		      for(int i=0;i<n;i++){
				for(int k=0;k<n-i;k++){
					System.out.print(" ");
				}
				for(int j=1;j<=i+1;j++){
					System.out.print("*");
				}
				System.out.print("\n");
		      }
                      for(int i=0;i<n;i++){
				for(int k=0;k<=i;k++){
					System.out.print(" ");
				}
				for(int j=n-i;j>0;j--){
					System.out.print("*");
				}
				System.out.print("\n");
		      }
		  s.close();
	}
}