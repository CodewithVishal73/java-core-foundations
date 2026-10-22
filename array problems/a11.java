import java.util.Scanner;
public class a11
{
	   public static void main(String [] args){
			Scanner s= new Scanner(System.in);
			System.out.println("\nenter size of array:");
			int n= s.nextInt();
			int [] vs= new int [n];
			System.out.println("enter array elements:");
			for(int i=0;i<n;i++){
				 vs[i]= s.nextInt();
			}
                        System.out.println("\nreversed array:");
                        for(int i=n-1;i>=0;i--){
				System.out.println(vs[i]);
			}
			s.close();
	 }
}