import java.util.Scanner;
public class a5
{
	   public static void main(String [] args){
			int K=0;
			Scanner s= new Scanner(System.in);
			System.out.println("\nenter element you want to check:");
		        int src= s.nextInt();
			System.out.println("\nenter size of array:");
			int n= s.nextInt();
			int [] vs= new int [n];
			System.out.println("\nenter array elements:");
			for(int i=0;i<n;i++){
				 vs[i]= s.nextInt();
			}
			for(int i=0;i<n;i++){
				if(vs[i]==src)
					K=1;
			}
                        if(K==1)
				System.out.println("Element found in array:");
			else
				System.out.println("Element not found in array:");

			s.close();
	 }
}