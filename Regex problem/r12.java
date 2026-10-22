import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;
import java.util.*;
public class r12{
        public static void main(String [] args){
			  Scanner s= new Scanner(System.in);
			  System.out.println("enter string:");
			  String st= s.nextLine();
			  if((Pattern.matches("\\b\\w*Python\\w*code\\w*\\b",st))==true){
					      st=st.replace("Python","Java");
					      st=st.replace("code","coding");
			  }
			  System.out.println("new string: "+st);
			  s.close();
	}
}