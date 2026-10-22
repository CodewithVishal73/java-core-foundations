import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;
public class r1{
        public static void main(String [] args){
			  Scanner s= new Scanner(System.in);
			  System.out.println("enter string:");
			  String st= s.nextLine();
			  System.out.println("pattern matches:"+ Pattern.matches("[a-zA-Z0-9]+",st));
			  s.close();
	}
}