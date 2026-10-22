import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;
import java.util.*;
public class r21{
        public static void main(String [] args){
			  Scanner s= new Scanner(System.in);
			  System.out.println("enter string:");
			  StringBuilder st= new StringBuilder(s.nextLine());
			  StringBuilder st1= new StringBuilder();
			  StringBuilder st2= new StringBuilder();
			  Pattern p= Pattern.compile("[aeiouAEIOU]");
			  Matcher m= p.matcher(st);
			  Pattern p1= Pattern.compile("[a-zA-Z&&[^aeiouAEIOU]]");
			  Matcher m1= p1.matcher(st);
			  while(m.find()){
				  st1.append(m.group().charAt(0));
			  }	
			  while(m1.find()){
				  st2.append(m1.group().charAt(0));
			  }
			  System.out.println("new string of vowels: "+st1);
			  System.out.println("new string of consonents: "+st2);
			  s.close();
	}
}