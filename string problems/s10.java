import java.util.Scanner;
import java.util.*;
public class s10
{
	public static void main(String [] args){
			Scanner s= new Scanner(System.in);
			System.out.println("enter string:");
			String st= s.nextLine();
			System.out.println("enter string you want to check:");		
			String k= s.nextLine();
                        if(st.indexOf(k)==0)
			         System.out.println("\nTRUE");
                        else
				 System.out.println("\nFALSE");
			s.close();
	}
}