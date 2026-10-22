import java.util.Scanner;
public class w5{
      public static void main(String[] args){
		    Scanner s= new Scanner(System.in);
		    System.out.println("enter char value:");
		    char ch= s.nextLine().charAt(0);
		    System.out.println("enter double value:");
		    double d= s.nextDouble();
		    System.out.println("enter int value:");
		    int n= s.nextInt();
		    Integer a = n;
		    Double b = d;
	            Character c= ch;
		    System.out.println("double object :"+ b);
		    System.out.println("char object :"+ c);
		    System.out.println("int object :"+ a);
		    s.close();
      }
}