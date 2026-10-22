import java.util.Scanner;
public class w12{
      public static void main(String[] args){
		    Scanner s= new Scanner(System.in);
		    System.out.println("enter your character:");
		    char ch= s.nextLine().charAt(0);
		    if(Character.isDigit(ch))
		    			System.out.println("it is digit");
		    else if(Character.isLetter(ch))
		    			System.out.println("it is letter");
		    if(Character.isUpperCase(ch))
		    			System.out.println("it is Uppercase");
		    s.close();
      }
}