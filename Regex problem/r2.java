import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;
public class r2{
        public static void main(String [] args){
			  Scanner s= new Scanner(System.in);
			  System.out.println("enter string:");
			  String st= s.nextLine();
			  System.out.println("pattern matches:"+ Pattern.matches("[p]?[q]*",st));
			  s.close();
	}
}