import java.util.Scanner;
import java.util.*;
public class s6
{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		System.out.println("enter string :");
		String s= in.nextLine();
		System.out.println("enter old character:");
		char c1= in.next().charAt(0);
                System.out.println("enter new character:");
		char c2= in.next().charAt(0);
		System.out.println("new string after replacing character:"+ s.replace(c1,c2));
		in.close();
	}
}