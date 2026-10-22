import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;
import java.util.*;
public class r18{
        public static void main(String [] args){
			  Scanner s= new Scanner(System.in);
			  System.out.println("enter number:");
			  String st=s.nextLine();
			  int c=0,d;
			  if(st.contains(".")){
				  c= st.indexOf(".");
				  d= st.length() - c -1;
			         System.out.println("no of decimal places: "+d);
			  }
			  s.close();
	}
}