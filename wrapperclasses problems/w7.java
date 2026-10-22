import java.util.Scanner;
public class w7{
      public static void main(String[] args){
		    Scanner s= new Scanner(System.in);
		    System.out.println("enter first float value:");
		    float i1= s.nextFloat();
		    System.out.println("enter second float value:");
		    float i2= s.nextFloat();
		    Float a = i1;
		    Float b = i2;
		    System.out.println("maximum value :"+ Float.max(a,b));
		    System.out.println("minimum value :"+ Float.min(a,b));
		    s.close();
      }
}