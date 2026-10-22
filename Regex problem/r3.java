import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;
public class r3{
        public static void main(String [] args){
			  Scanner s= new Scanner(System.in);
			  System.out.println("enter string:");
			  String st= s.nextLine();
			  Pattern p= Pattern.compile("[a-z]+_[a-z]+");
			  Matcher m= p.matcher(st);
 			  while(m.find()){
			  	System.out.println("sequence:"+m.group());
			  }
			  s.close();
	}
}