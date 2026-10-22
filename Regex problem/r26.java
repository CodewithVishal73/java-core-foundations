import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;
import java.util.*;
public class r26{
        public static void main(String [] args){
			  Scanner s= new Scanner(System.in);
			  System.out.println("enter string:");
			  StringBuilder st= new StringBuilder(s.nextLine());
			  int l= st.length();
			  StringBuilder st1= new StringBuilder();
			  int c=0;
			  for(int i=0;i<l;i++){
				  if(Pattern.matches("[aeiouAEIOU]",String.valueOf(st.charAt(i)))){
					   st1.append("-").append(st.charAt(i)).append("-");
					   c++;
				  }
				  else{
					st1.append(st.charAt(i));
				  }
			  }
                          st.setLength(0);
			  st.append(st1);
			  System.out.println("ew string: "+st);
			  s.close();
	}
}