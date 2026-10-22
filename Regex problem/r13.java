import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;
import java.util.*;
public class r13{
        public static void main(String [] args){
			  Scanner s= new Scanner(System.in);
			  System.out.println("enter string:");
			  String st= s.nextLine();
			  Pattern p= Pattern.compile("[aeiouAEIOU]");
			  Matcher m= p.matcher(st);
			  int v=0;
			  while(m.find()){
				  v=v+1;
			  }
			  System.out.println("no. of vowels: "+v);
			  s.close();
	}
}