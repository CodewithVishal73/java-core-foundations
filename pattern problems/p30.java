import java.util.Scanner;
public class p30
{
	public static void main(String [] args){
			Scanner s=new Scanner(System.in);
			System.out.print("\nenter rows:");
			int n= s.nextInt();
			for(int i=0;i<n;i++){
				for(int k=0;k<=i;k++){
					System.out.print(" ");
				}
				char c= 'A';
				for(int j=1;j<=(n-i);j++){
					System.out.print(c);
					c++;
				}
				System.out.print("\n");
			}
	}
}