import java.util.Scanner;
import java.util.Arrays;
public class a39
{
	public static void main(String [] args){
			Scanner s= new Scanner(System.in);
			System.out.println("enter rows and columns:");
			int n= s.nextInt();
			int [][] mat= new int[n][n];
			int k=0,r=0;
			System.out.println("enter matrix elements:");
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
				        mat[i][j]= s.nextInt();
				}
			}
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
				         if(mat[i][j]==0)
							k++;
					 else 
							r++;
					
				}
			}	
			if(k>r)
				System.out.println("yes it is sparse matrix");
                        else 
				System.out.println("it is not sparse matrix");
			s.close();
	}
}