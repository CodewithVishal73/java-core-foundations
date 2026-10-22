import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;
import java.util.*;
public class r22{
        public static void main(String [] args){
			  Scanner s= new Scanner(System.in);
			  System.out.println("enter string:");
			  StringBuilder st= new StringBuilder(s.nextLine());
			  StringBuilder st1= new StringBuilder();
			  Pattern p= Pattern.compile("[a-z]");
			  Matcher m= p.matcher(st);
			  Pattern p1= Pattern.compile("[A-Z]");
			  Matcher m1= p1.matcher(st);
			  while(m.find()){
				  st1.append(m.group().charAt(0));
			  }	
			  while(m1.find()){
				  st1.append(m1.group().charAt(0));
			  }
			  st=st1;
			  System.out.println("new string : "+st);
			  s.close();
	}
}