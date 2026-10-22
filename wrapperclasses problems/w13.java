import java.util.Scanner;
public class w13{
      public static void main(String[] args){
		    Scanner s= new Scanner(System.in);
		    byte b= 10;
		    Byte ob1= b;
		    String st= ob1.toString();
		    Integer n= Integer.valueOf(st);
		    System.out.println("String : "+st);
		    System.out.println("Integer: "+n);
		    s.close();
      }
}  
		    