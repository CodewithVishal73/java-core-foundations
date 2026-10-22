import java.util.Scanner;
public class w8{
      public static void main(String[] args){
		    Scanner s= new Scanner(System.in);
		    System.out.println("enter your string:");
		    String st= s.nextLine();
		    int n= Integer.parseInt(st);
		    Double d= Double.parseDouble(st);
		    System.out.println("string to int conversion: "+n);
		    System.out.println("string to Double conversion: "+d);
		    s.close();
      }
}
		    