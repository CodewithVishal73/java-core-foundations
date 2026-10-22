import java.util.Scanner;
public class a20
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
			int sum=0,cnt=0;
			for(int i=0;i<n;i++){
				if(vs[i]!=max && vs[i]!=min){
					sum=sum+vs[i];
					cnt++;
				}
			}
                        System.out.println("average of array except maximum and minimum values:"+(sum/cnt));
			s.close();
	 }
}