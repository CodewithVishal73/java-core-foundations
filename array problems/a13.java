import java.util.Scanner;
public class a13
{
	   public static void main(String [] args){
			Scanner s= new Scanner(System.in);
			System.out.println("\nenter size of array:");
			int n= s.nextInt();
			int [] vs= new int [n];
			int [] vs1=new int [n];
			System.out.println("enter array elements:");
			for(int i=0;i<n;i++){
				 vs[i]= s.nextInt();
			}
			int c,k=0;
                        for(int i=0;i<n;i++){
				c=0;
				for(int j=0;j<k;j++){
					if(vs[i]==vs1[j]){
                                               c=1;
					       break;
					}
				}
				if(c==0){
				       vs1[k]=vs[i];
				       k++;
				}
			}
			System.out.println("\narray after removing duplicate elements:");
                        for(int i=0;i<k;i++)
				System.out.println(vs1[i]);
			s.close();
	 }
}