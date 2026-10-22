import java.util.Scanner;
public class w6{
      public static void main(String[] args){
		    Scanner s= new Scanner(System.in);
		    System.out.println("enter first int:");
		    int i1= s.nextInt();
		    System.out.println("enter second value:");
		    int i2= s.nextInt();
		    Integer a = i1;
		    Integer b = i2;
		    System.out.println("Integer objects are equal :"+ a.equals(b));
		    s.close();
      }
}