import java.util.Scanner;
import java.util.Arrays;
public class a31
{
	public static void main(String [] args){
			Scanner s= new Scanner(System.in);
			int k=0,temp=0;
			System.out.println("enter rows and columns:");
			int n= s.nextInt();
			int [][] mat= new int[n][n];
			System.out.println("enter matrix elements:");
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
				        mat[i][j]= s.nextInt();
				}
			}
                        for(int i=0;i<n;i++){
                                temp=mat[i][i];
				mat[i][i]= mat[i][n-1-i];
                                mat[i][n-1-i]=temp;
			}
			System.out.println("NEW MATRIX :\n");
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
				        System.out.print(mat[i][j]+" ");
				}
				System.out.print("\n");
			}	
			s.close();
	}
}