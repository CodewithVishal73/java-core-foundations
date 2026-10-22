import java.util.Scanner;
public class a17
{
	   public static void main(String [] args){
			Scanner s= new Scanner(System.in);
			System.out.println("enter size of array1:");
			int n= s.nextInt();
		       	System.out.println("enter size of array2:");
			int k= s.nextInt();
			int [] vs= new int [n];
			System.out.println("enter array1 elements:");
			for(int i=0;i<n;i++){
				 vs[i]= s.nextInt();
			}
			int [] rs= new int [k];
			System.out.println("enter array2 elements:");
			for(int i=0;i<k;i++){
				 rs[i]= s.nextInt();
			}
                        System.out.println("\ncommon values:");
                        for(int i=0;i<n;i++){
				for(int j=0;j<k;j++){
					if(vs[i]==rs[j]){
						System.out.println(vs[i]);
					}
				}
			}
			s.close();
	 }
}