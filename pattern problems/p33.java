import java.io.*;
public class p33{
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
						System.out.print(j+" ");
				}
				System.out.print("\n");
		}
       }
}