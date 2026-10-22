import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;
import java.util.*;
public class r19{
        public static void main(String [] args){
			  Scanner s= new Scanner(System.in);
			  System.out.println("enter string:");
			  String st= s.nextLine();
			  if((Pattern.matches("[0-9]{10}",st))==true){
					       System.out.println("it is valid phone number");
			  }
			  else
						System.out.println("it is not valid phone number");

			  s.close();
	}
}