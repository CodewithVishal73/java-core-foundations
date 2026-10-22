import java.util.Scanner;
import java.util.Arrays;
public class a30
{
	public static void main(String [] args){
			Scanner s= new Scanner(System.in);
			int k=0;
			System.out.println("enter rows:");
			int r= s.nextInt();
           	        System.out.println("enter columns:");
			int c= s.nextInt();
			int [][] mat= new int[r][c];
			System.out.println("enter matrix elements:");
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
				        mat[i][j]= s.nextInt();
				}
			}
			System.out.println("row wise sum\n");
                        for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
				           k=k+ mat[i][j];
				}
				System.out.println("sum of row"+(i+1)+": "+k+"\n");
				k=0;
			}
                        System.out.println("column wise sum\n");
			for(int i=0;i<c;i++){
				for(int j=0;j<r;j++){
				           k=k+ mat[j][i];
				}
				System.out.println("sum of column"+(i+1)+": "+k+"\n");
				k=0;
			}
			s.close();	
	}
}