import java.util.Scanner;
import java.util.*;
import java.time.Year;
public class dt2{
         public static void main(String [] args){
			Scanner s = new Scanner(System.in);
			System.out.println("enter any year:");
			int year= s.nextInt();
			System.out.println("year is leap year: "+Year.isLeap(year));
			s.close();
	}
}