import java.util.Scanner;
import java.util.*;
public class s14
{
	public static void main(String [] args){
			Scanner s= new Scanner(System.in);
			System.out.println("enter string:");
			String st= s.nextLine();
			int max=1;
			String pal= "";
                        for(int i=0;i<st.length();i++){
			    for(int j=i+1;j<st.length();j++){
				  String sh= st.substring(i,j);
				  String rev= new StringBuffer(sh).reverse().toString();
				  if(sh.equals(rev)==true){
				         int k=sh.length();
				         if(k>max){
					       max=k;
                                               pal=sh;
				         }
				  }
			    }
			}
			System.out.println("longest palindromc substring:"+pal);
			s.close();
	}
}