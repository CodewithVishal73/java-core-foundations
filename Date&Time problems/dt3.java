import java.util.Scanner;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class dt3{
         public static void main(String [] args){
			Scanner s = new Scanner(System.in);
			System.out.println("enter any year:");
			String date= s.nextLine();
			DateTimeFormatter f= DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate d= LocalDate.parse(date,f);
			System.out.println("day of week of given date: "+d.getDayOfWeek());
			s.close();
	}
}