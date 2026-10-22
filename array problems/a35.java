import java.util.Scanner;
import java.util.Arrays;
public class a35
{
	public static void main(String [] args){
			Scanner s= new Scanner(System.in);
			System.out.println("enter rows and columns:");
			int n= s.nextInt();
			int [][] mat= new int[n][n];
			int k=0;
			System.out.println("enter matrix elements:");
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
				        mat[i][j]= s.nextInt();
				}
			}
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
                                    if((i-j)>=0)
				         k=k+mat[i][j];
				}
			}	
			System.out.println("SUM OF LOWER TRIANGULAR MATRIX :"+k);
			s.close();
	}
}