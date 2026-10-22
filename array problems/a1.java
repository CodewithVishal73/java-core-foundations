import java.util.Scanner;
public class a1
{
	   public static void main(String [] args){
			Scanner s= new Scanner(System.in);
			System.out.println("\nenter size of array:");
			int n= s.nextInt();
			int [] vs= new int [n];
			System.out.println("\nenter array elements:");
			for(int i=0;i<n;i++){
				 vs[i]= s.nextInt();
			}
			for(int i=0;i<n;i++){
				for(int j=i;j<n;j++){
					if(vs[i]>vs[j]){
						int temp= vs[i];
						vs[i]=vs[j];
						vs[j]=temp;
					}
				}
			}
                        System.out.println("\nsorted array:");
                        for(int i=0;i<n;i++){
				System.out.println(vs[i]+" ");
			}
			s.close();
	 }
}
                        