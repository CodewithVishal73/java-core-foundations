import java.util.Scanner;
import java.util.Arrays;
public class a37
{
	public static int determinant(int [][] mat,int n){
			int [][]mat1= new int [n][n];
			int det=0;
			if(n==1)
				return mat[0][0];
			if(n==2)
				return (mat[0][0]*mat[1][1] - (mat[0][1]*mat[1][0]));
			for(int i=0;i<n;i++){
				int mr=0,mc=0;
				for(int j=1;j<n;j++){
					for(int k=0;k<n;k++){
					   if(k!=i){
						mat1[mr][mc]= mat[j][k];
						mc++;
						if(mc==n-1){
							mc=0;
							mr++;
						}
					   }	
					}
				}
			      if(i%2==0)
				   det+= 1* mat[0][i] * determinant(mat1,n-1);
			      else
				   det+= -1* mat[0][i] * determinant(mat1,n-1);
                       }
                       return det;	
	}
						
	public static void main(String [] args){
			Scanner s= new Scanner(System.in);
			System.out.println("enter rows and columns:");
			int n= s.nextInt();
			int [][] mat= new int[n][n];
			int ratio, det=1;
			System.out.println("enter matrix elements:");
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
				        mat[i][j]= s.nextInt();
				}
			}
			System.out.println("DETERMINANT :"+determinant(mat,n));
			s.close();
	}
}