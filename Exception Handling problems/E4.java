import java.util.Scanner;
public class E4{
        public static int meth(String inp){
			try{
				int n= Integer.parseInt(inp);
				System.out.println("Integer conversion successful : "+ n);
				return n;
			}
			catch(NumberFormatException e){
				System.out.println("Input string value "+inp+" cannot converted to Integer ");
				return -1;
			}
	}
       public static void main(String [] args){
			meth("123");
			meth("vishal123");
			
       }
}