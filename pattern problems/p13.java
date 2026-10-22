import java.io.*;
public class p13{
      public static void main(String[] args)throws IOException
      {
		int cnt=1;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nenter rows");
		int n= Integer.parseInt(in.readLine());
		for(int i=0;i<n;i++){
				for(int k=0;k<n-i;k++){
					System.out.print(" ");
				}
				for(int j=0;j<=i;j++){
					if(j==0 || i==0)
				       		cnt=1;
					else
						cnt= cnt* (i-j+1)/j ;
					System.out.print(cnt+" ");
				}
			    System.out.print("\n");
		}
       }
}