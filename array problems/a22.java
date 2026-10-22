import java.util.Scanner;
public class a22
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
			int ev=0,od=0;
                        for(int i=0;i<n;i++){
				 if(vs[i]%2==0)
					ev++;
				 else
					od++;
			}
			System.out.println("No. of odd integers:"+od);
			System.out.println("No. of even integers:"+ev);
	
			s.close();
	 }
}