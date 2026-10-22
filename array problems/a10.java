import java.util.Scanner;
public class a10
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
			int max=vs[0],min=vs[0];
			for(int i=0;i<n;i++){
				if(vs[i]>max)
					max=vs[i];
				if(vs[i]<min)
					min=vs[i];
			}
                        System.out.println("maximum value:"+max);
			System.out.println("minimum value:"+min);
			s.close();
	 }
}