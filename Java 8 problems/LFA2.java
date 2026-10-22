import java.util.Scanner;
import java.util.*;
@FunctionalInterface
interface StringOperation{
      String operate(String st);
}
public class LFA2{
    public static void main(String [] args){
            Scanner s = new Scanner(System.in);
            StringOperation upper= (st)-> st.toUpperCase();
            StringOperation reverse= (st)-> new StringBuilder(st).reverse().toString();
            StringOperation length= (st)-> String.valueOf(st.length());
            System.out.println("\nenter String : ");
            String st= s.nextLine();
            System.out.println("\nString to uppercase : "+upper.operate(st));
            System.out.println("\nenter String : "+reverse.operate(st));
            System.out.println("\nenter String : "+length.operate(st));
            s.close();
    }    
}