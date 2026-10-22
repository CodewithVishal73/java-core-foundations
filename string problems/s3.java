import java.util.Scanner;
import java.util.*;
public class s3
{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("enter string:");
		String s= in.nextLine();
		System.out.println("enter index before you want to print element unicode:");
		int k= in.nextInt();
	        for(int i=0;i<s.length();i++){
                         if(i<k){
				System.out.println("unicode at "+i+" :"+s.codePointAt(i));
			 }
		}
		in.close();
	}
}