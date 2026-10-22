import java.util.Scanner;
import java.util.Arrays;
public class a24
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
                        System.out.println("enter matrix2 elements:");
                        for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
				        mat2[i][j]= s.nextInt();
				}
			}
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
				        mat3[i][j]= mat1[i][j] + mat2[i][j];
				}
			}
			System.out.println("MATRIX AFTER ADDITION:");
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
				        System.out.print(mat3[i][j]+" ");
				}
				System.out.print("\n");
			}
			s.close();
	}
}