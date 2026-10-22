import java.util.Scanner;
public class a19
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
			int c;
			System.out.println("Majority element :-");
                        for(int i=0;i<n;i++){
				c=0;
				for(int j=i;j<n;j++){
				     if(vs[i]==vs[j])
					    c++;
				}
				if(c>(n/2)){
				       System.out.println(vs[i]);
				}
			}
	 }
}