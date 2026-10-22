import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;
import java.util.*;
public class r24{
        public static void main(String [] args){
			  Scanner s= new Scanner(System.in);
			  System.out.println("enter string:");
			  String st= s.nextLine();
			  System.out.println("enter n:");
			  int n= s.nextInt();
			  int l= st.length();
			  StringBuilder st1= new StringBuilder();
			  int c=0;
			  for(int i=l-1;i>=0;i--){
				  if(Pattern.matches("[aeiouAEIOU]",String.valueOf(st.charAt(i)))){
					   st1.append(st.charAt(i));
					   c++;
				  }
				  if(c==n){
					break;		
				  }
			  }
			  System.out.println("n vowels from last in string: "+st1);
			  s.close();
	}
}