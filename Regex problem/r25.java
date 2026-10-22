import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;
import java.util.*;
public class r25{
        public static void main(String [] args){
			  Scanner s= new Scanner(System.in);
			  System.out.println("enter pin:");
			  String st= s.nextLine();
			  if(Pattern.matches("#?[a-fA-F0-9]{3,6}",st)==true){
				System.out.println("it is valid hexcode");
			  }
			  else{
				System.out.println("it is not valid hexcode");
			  }
			  s.close();
	}
}