import java.util.Scanner;
public class a2
{
	   public static void main(String [] args){
			int sum=0;
			Scanner s= new Scanner(System.in);
			System.out.println("\nenter size of array:");
			int n= s.nextInt();
			int [] vs= new int [n];
			System.out.println("\nenter array elements:");
			for(int i=0;i<n;i++){
				 vs[i]= s.nextInt();
			}
			for(int i=0;i<n;i++){
				sum+= vs[i];
			}
                        System.out.println("\nsum of array elements:"+sum);
			s.close();
	 }
}