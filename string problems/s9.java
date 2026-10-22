import java.util.Scanner;
import java.util.*;
public class s9
{
	public static void main(String [] args){
			Scanner s= new Scanner(System.in);
			System.out.println("enter string:");
			String st= s.nextLine();
			System.out.println("enter string you want to replace:");		
			String k= s.nextLine();
			System.out.println("enter new string:");
			String k1=s.nextLine();
			System.out.println("\nnew string: "+st.replace(k,k1));
			s.close();
	}
}