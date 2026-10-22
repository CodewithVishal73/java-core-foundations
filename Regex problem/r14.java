import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;
import java.util.*;
public class r14{
        public static void main(String [] args){
			  Scanner s= new Scanner(System.in);
			  System.out.println("enter string:");
			  StringBuilder st= new StringBuilder(s.nextLine());
			  StringBuilder st1= new StringBuilder();
			  Pattern p= Pattern.compile("[^aeiouAEIOU]");
			  Matcher m= p.matcher(st);
			  int v=0,i=0;
			  while(m.find()){
				  st1.append(m.group());
			  }
			  st=st1;
			  System.out.println("new string : "+st1);
			  s.close();
	}
}