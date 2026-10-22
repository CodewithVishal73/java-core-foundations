import java.util.Scanner;
public class a23{
              public static void main(String [] args){
			Scanner s= new Scanner(System.in);
			System.out.println("enter no. of sub-arrays:");
			int n = s.nextInt();
			int [][] ar= new int[n][];
			for(int i=0;i<n;i++){
				System.out.println("enter size of sub-array "+(i+1)+":");
				int size= s.nextInt();
				ar[i] = new int[size];
			}
			for(int i=0;i<n;i++){
				System.out.println("enter elements of sub--array "+(i+1)+":");
				for(int j=0;j<ar[i].length;j++){
						ar[i][j]= s.nextInt();
				}
			}
                        
			System.out.println("Final Jagged array :");
			for(int i=0;i<n;i++){
				for(int j=0;j<ar[i].length;j++){
						System.out.print(ar[i][j]+" ");
				}
				System.out.println("\n");
			}	
			s.close();
	       }
}