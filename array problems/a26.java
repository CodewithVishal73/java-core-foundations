import java.util.Scanner;
import java.util.Arrays;
public class a26
{
	public static void main(String [] args){
			Scanner s= new Scanner(System.in);
			System.out.println("enter rows:");
			int r= s.nextInt();
                        System.out.println("enter columns:");
			int c= s.nextInt();
			int [][] mat1= new int[r][c];
                        int [][] mat2= new int[r][c];
                        int [][] mat3= new int[r][c];
			System.out.println("enter matrix1 elements:");
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
				        mat1[i][j]= s.nextInt();
				}
			}
			System.out.println("enter rows of 2nd matrix:");
			int r1= s.nextInt();
                        System.out.println("enter columns of 2nd matrix:");
			int c1= s.nextInt();
                        System.out.println("enter matrix2 elements:");
                        for(int i=0;i<r1;i++){
				for(int j=0;j<c1;j++){
				        mat2[i][j]= s.nextInt();
				}
			}
			for(int i=0;i<r;i++){
				for(int j=0;j<c1;j++){
					mat3[i][j]=0;
					for(int k=0;k<c;k++){
				               mat3[i][j]= mat3[i][j]+ mat1[i][k] * mat2[k][j];
					}
				}
			}
			System.out.println("MATRIX AFTER MULTIPLICATION:");
			for(int i=0;i<r;i++){
				for(int j=0;j<c1;j++){
				        System.out.print(mat3[i][j]+" ");
				}
				System.out.print("\n");
			}
			s.close();
	}
}