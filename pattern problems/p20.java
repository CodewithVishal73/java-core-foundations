import java.io.*;
public class p20{
      public static void main(String[] args)throws IOException
      {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nenter rows");
		int n= Integer.parseInt(in.readLine());
		for(int i=0;i<n;i++){
				for(int j=1;j<=(n-i);j++){
						System.out.print(j);
				}
				System.out.print("\n");
		}
		for(int i=0;i<n;i++){
				for(int j=1;j<=i+1;j++){
					System.out.print(j);
				}
				System.out.print("\n");
		 }
       }
}