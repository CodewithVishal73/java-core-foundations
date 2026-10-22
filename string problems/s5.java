import java.util.Scanner;
import java.util.*;
public class s5
{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		System.out.println("enter string 1:");
		String s1= in.nextLine();
		System.out.println("enter string 2:");
		String s2= in.nextLine();
		System.out.println("s1 == s2? "+ s1.equals(s2));
		in.close();
	}
}