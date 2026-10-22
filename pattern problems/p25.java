import java.util.Scanner;
public class p25
{
	public static void main(String [] args){
			Scanner s=new Scanner(System.in);
			System.out.print("\nenter rows:");
			int n= s.nextInt();
			for(int i=0;i<n;i++){
				for(int k=0;k<n-i;k++){
					System.out.print(" ");
				}
				char c= 'A';
				for(int j=1;j<=i+1;j++){
					System.out.print(c+" ");
					c++;
				}
				System.out.print("\n");
			} 
	}
}