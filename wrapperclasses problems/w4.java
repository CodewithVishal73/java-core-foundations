import java.util.Scanner;
import java.util.regex.Pattern;
public class w4{
      public static void main(String[] args){
		    Scanner s= new Scanner(System.in);
		    System.out.println("enter your string:");
		    String st= s.nextLine();
		    if(Pattern.matches("\\d+",st)==true)
				      System.out.println("Yes it is purely numeric");
		    else
				      System.out.println("No it is not purely numeric");
		    s.close();
      }
}
		    