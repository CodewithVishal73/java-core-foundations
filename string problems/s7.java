import java.util.Scanner;
import java.util.*;
public class s7
{
	public static void main(String [] args){
			Scanner s= new Scanner(System.in);
			System.out.println("enter string:");
			String st= s.nextLine();
			System.out.println("enter char sequence:");		
			String k= s.nextLine();
			System.out.println("\nchar sequence is present in string: "+st.contains(k));
			s.close();
	}
}