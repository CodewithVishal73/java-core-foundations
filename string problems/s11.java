import java.util.Scanner;
import java.util.*;
public class s11
{
	public static void main(String [] args){
			Scanner s= new Scanner(System.in);
			System.out.println("enter string:");
			String st= s.nextLine();
			System.out.println("enter your starting position:");		
			int i= s.nextInt();
                        System.out.println("enter your ending position:");		
			int j= s.nextInt();
                        System.out.println("substring at specified position:"+ st.substring(i,j));
			s.close();
	}
}