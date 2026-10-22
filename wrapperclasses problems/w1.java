import java.util.Scanner;
public class w1{
      public static void main(String[] args){
		    Scanner s= new Scanner(System.in);
		    System.out.println("enter your string:");
		    String st= s.nextLine();
		    int n= Integer.parseInt(st) + 10;
		    System.out.println("string to int conversion: "+n);
		    s.close();
      }
}
		    