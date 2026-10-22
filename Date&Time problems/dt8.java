import java.util.Scanner;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class dt8{
         public static void main(String [] args){
			Scanner s = new Scanner(System.in);
			System.out.println("enter any Date:");
			String date= s.nextLine();
			DateTimeFormatter f= DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate d= LocalDate.parse(date,f);
			DateTimeFormatter f1= DateTimeFormatter.ofPattern("yyyy-MM-dd");
			String Newdate= d.format(f1);
			System.out.println("new date : "+Newdate);
			s.close();
	}
}