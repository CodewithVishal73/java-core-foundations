import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;
import java.util.*;
public class r17{
        public static void main(String [] args){
			  Scanner s= new Scanner(System.in);
			  System.out.println("enter pin:");
			  StringBuilder st= new StringBuilder(s.nextLine());
			  Pattern p= Pattern.compile("[468]");
			  Matcher m= p.matcher(st);
			  if(m.find()){
				System.out.println("it is valid pin");
			  }
			  else
				System.out.println("it is not valid pin");
			  s.close();
	}
}