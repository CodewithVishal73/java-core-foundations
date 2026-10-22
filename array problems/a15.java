import java.util.Scanner;
public class a15
{
	   public static void main(String [] args){
			Scanner s= new Scanner(System.in);
			System.out.println("\nenter rows:");
			int r= s.nextInt();
			System.out.println("\nenter columns:");
			int c= s.nextInt();
			int [][] vs= new int [r][c];
			int [][] rs= new int [r][c];
			System.out.println("enter matrix1 elements:");
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
					 vs[i][j]= s.nextInt();
				}
			}
			System.out.println("enter matrix2 elements:");
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
					 rs[i][j]= s.nextInt();
				}
			}
			int [][] fs= new int [r][c];
                        for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
					fs[i][j]= vs[i][j] + rs[i][j];
				}
			}
			System.out.println("Addition of two matrices ");
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
					System.out.print(fs[i][j]+" ");
				}
				System.out.print("\n");
			}
			s.close();
	 }
}