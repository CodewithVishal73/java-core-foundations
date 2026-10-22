import java.util.Scanner;
public class a9
{
	   public static void main(String [] args){
			Scanner s= new Scanner(System.in);
			System.out.println("\nenter size of array:");
			int n= s.nextInt();
			int [] vs= new int [n];
			System.out.println("\nenter element you want to add at specific position:");	
			int src=s.nextInt();
			System.out.println("enter position:");	
			int pos=s.nextInt();
			System.out.println("enter array elements:");
			for(int i=0;i<n;i++){
				 vs[i]= s.nextInt();
			}
			for(int i=0;i<n;i++){
				if((i+1)==pos)
					vs[i]=src;
			}
                        System.out.println("\nupdated array:");
                        for(int i=0;i<n;i++){
				System.out.println(vs[i]);
			}
			s.close();
	 }
}