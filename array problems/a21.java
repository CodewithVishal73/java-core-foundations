import java.util.Scanner;
public class a21
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
			int c=0;
                        for(int i=0;i<n;i++){
				 if(vs[i]==0 || vs[i]==-1)
					c++;
			}
			if(c==0)
				System.out.println("Array is without 0 and -1");
			else
				System.out.println("Array is with 0 and -1");
	
			s.close();
	 }
}