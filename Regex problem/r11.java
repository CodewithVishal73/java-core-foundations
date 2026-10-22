import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;
public class r11{
	public static String pattern(String st){
			 if((Pattern.matches("\\b\\w* python \\w*\\b",st))==true)
					return "java";
			 else
					return "c++";
	}
        public static void main(String [] args){
			  Scanner s= new Scanner(System.in);
			  System.out.println("enter string:");
			  String st= s.nextLine();
			  System.out.println(pattern(st));
			  s.close();
	}
}