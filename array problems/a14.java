import java.util.Scanner;
public class a14
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
			int max2=max,min2=min;
			for(int i=0;i<n;i++){
				if(vs[i]<max && (max2==max || vs[i]>max2))
					max2=vs[i];
				if(vs[i]>min && (min2==min || vs[i]<min2))
					min2=vs[i];
			}
                        System.out.println("second largest value:"+max2);
			System.out.println("second smallest value:"+min2);
			s.close();
	 }
}