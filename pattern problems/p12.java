import java.io.*;
public class p12{
      public static void main(String[] args)throws IOException
      {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nenter rows");
		int n= Integer.parseInt(in.readLine());
		for(int i=0;i<n;i++){
				for(int k=0;k<=i;k++){
					System.out.print(" ");
				}
				for(int j=n-i;j>0;j--){
					if(j==1 || j==(n-i) || i==0)
						System.out.print("* ");
				        else
						System.out.print("  ");
				}
				System.out.print("\n");
		}
                for(int i=0;i<n;i++){
				for(int k=0;k<n-i;k++){
					System.out.print(" ");
				}
				for(int j=1;j<=i+1;j++){
				    if(j==1 || j==i+1 || i==(n-1))
					System.out.print("* ");
				    else
					System.out.print("  ");
					
				}
				System.out.print("\n");
		      }
       }
}
		