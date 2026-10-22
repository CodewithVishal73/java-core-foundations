import java.util.Scanner;
import java.util.Arrays;
public class a36
{
	public static void main(String [] args){
			Scanner s= new Scanner(System.in);
			System.out.println("enter rows and columns:");
			int n= s.nextInt();
			int [][] mat= new int[n][n];
			System.out.println("enter matrix elements:");
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
				        mat[i][j]= s.nextInt();
				}
			}
			System.out.println("TRANSPOSE OF MATRIX :\n");
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
				      System.out.print(mat[j][i]+" ");
				}
				System.out.print("\n");
			}	
			s.close();
	}
}