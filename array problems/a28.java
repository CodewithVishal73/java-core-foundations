import java.util.Scanner;
import java.util.Arrays;
public class a28
{
	public static void main(String [] args){
			Scanner s= new Scanner(System.in);
			int k=0;
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
				for(int j=0;j<n;j++){
                                      if(i==j)
				           k=k+ mat[i][j];
				}
			}
			System.out.println("sum of diagonal elements: "+k);	
	}
}