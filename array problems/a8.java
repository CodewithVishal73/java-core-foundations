import java.util.Scanner;
public class a8
{
	   public static void main(String [] args){
			Scanner s= new Scanner(System.in);
			System.out.println("\nenter size of array:");
			int n= s.nextInt();
			int [] vs= new int [n];
			int [] vs1= new int [n];
			System.out.println("\nenter array elements:");
			for(int i=0;i<n;i++){
				 vs[i]= s.nextInt();
			}
			for(int i=0;i<n;i++){
				vs1[i]=vs[i];
			}
                        System.out.println("\ncopied array:");
                        for(int i=0;i<n;i++){
				System.out.println(vs1[i]);
			}
			s.close();
	 }
}