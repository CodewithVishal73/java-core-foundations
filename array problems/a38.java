import java.util.Scanner;
import java.util.Arrays;
public class a38
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
                                     if(j!=i){
					 if(mat[i][i]==1 && mat[i][j]==0)
							k++;
					 else
							r++;
				     }
				}
			}	
			if(r==0)
				System.out.println("yes it is identity matrix");
                        else 
				System.out.println("it is not identity matrix");
			s.close();
	}
}