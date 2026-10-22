import java.util.Scanner;
import java.util.regex.Pattern;
public class w9{
      public static void main(String[] args){
		    Scanner s= new Scanner(System.in);
		    System.out.println("enter your age:");
		    String age= s.nextLine();
		    if(Pattern.matches("\\d+",age)==true)
				      System.out.println("Yes it is numeric");
		    else
				      System.out.println("No it is not numeric");
		    s.close();
      }
}
		    