import java.util.Scanner;
import java.util.*;
public class s4
{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		System.out.println("enter string 1:");
		String s1= in.nextLine();
		System.out.println("enter string 2:");
		String s2= in.nextLine();
		s1=s1.concat(s2);
		System.out.println("concatenated string :"+ s1);
		in.close();
	}
}