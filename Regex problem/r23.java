import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;
import java.util.*;
public class r23{
        public static void main(String [] args){
			  Scanner s= new Scanner(System.in);
			  System.out.println("enter string:");
			  String st= s.nextLine();
			  String[] words= st.split("\\s+");
			  int l= words.length;
			  StringBuilder st2= new StringBuilder();
			  for(int i=0;i<l;i++){
				  if(words[i].length()>3){
					   st2.append(new StringBuilder(words[i]).reverse()).append(" ");
				  }
				  else{
					st2.append(words[i]).append(" ");
				  }
			  }
			  System.out.println("new string : "+st2);
			  s.close();
	}
}