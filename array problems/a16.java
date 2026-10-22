import java.util.Scanner;
public class a16
{
	   public static void main(String [] args){
			Scanner s= new Scanner(System.in);
			System.out.println("\nenter size of array:");
			int n= s.nextInt();
		       	System.out.println("\nenter specific number you want to check:");
			int k= s.nextInt();
			int [] vs= new int [n];
			System.out.println("enter array elements:");
			for(int i=0;i<n;i++){
				 vs[i]= s.nextInt();
			}
                        System.out.println("\npair values:");
                        for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					if(vs[i]+vs[j]==k){
						System.out.println("("+vs[i]+","+vs[j]+")");
					}
				}
			}
			s.close();
	 }
}