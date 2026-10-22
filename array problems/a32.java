import java.util.Scanner;
import java.util.Arrays;
public class a32
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
			System.out.println("UPPER TRIANGULAR MATRIX :\n");
			for(int i=0;i<n;i++){
				for(int k=0;k<i;k++){
                                           System.out.print("  ");
				}
				for(int j=0;j<n;j++){
                                    if((i-j)<=0)
				      System.out.print(mat[i][j]+" ");
				}
				System.out.print("\n");
			}	
			s.close();
	}
}