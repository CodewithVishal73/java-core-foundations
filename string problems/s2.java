import java.util.Scanner;
import java.util.*;
public class s2
{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("enter string:");
		String s= in.nextLine();
		for(int i=0;i<s.length();i++){
				System.out.println("string unicode:"+s.codePointAt());
		}
		in.close();
	}
}