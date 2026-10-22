import java.util.Scanner;
public  class Sc
{
      public static void main(String[] args){
                  Scanner s= new Scanner(System.in);
                  System.out.println("enter string:");
		  String name= s.nextLine();
		  System.out.println("Name is:"+name);
                  System.out.println("enter integer:");
                  int a= s.nextInt();
		  System.out.println("integer is: "+a);
		  System.out.println("enter double:");
		  double d= s.nextDouble();
		  System.out.println("Double value :"+d);
                  System.out.println("enter charcater:");
		  char c=s.next().charAt(0);
		  System.out.println("character is:"+c);
		  s.close();
     }
}
					