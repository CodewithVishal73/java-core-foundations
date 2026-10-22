import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;
import java.util.*;
public class r15{
        public static void main(String [] args){
			  Scanner s= new Scanner(System.in);
			  System.out.println("enter string:");
			  String st= s.nextLine();
			  Pattern p= Pattern.compile("[aeiouAEIOU]");
			  Matcher m= p.matcher(st);
			  System.out.println("enter specified character:");
			  char c= s.next().charAt(0);
			  int v=0,i=0;
			  while(m.find()){
				 st = st.replace(m.group().charAt(0),c);
			  }
			  System.out.println("new string : "+st);
			  s.close();
	}
}