import java.util.Scanner;
import java.util.*;
public class s16
{
	public static String reverse(String sh,int i,int j){
			char [] rev= sh.toCharArray();
			if(i>=j){
				return new String(rev);
			}
			else{
				char temp= rev[i];
		                rev[i]= rev[j];
				rev[j]=temp;
				return reverse(new String(rev),i+1,j-1);
			}
	}
	public static void main(String [] args){
			Scanner s= new Scanner(System.in);
			System.out.println("enter string:");
			String st= s.nextLine();
                        System.out.println("reverse string :"+ reverse(st,0,st.length()-1));
			s.close();
	}
}