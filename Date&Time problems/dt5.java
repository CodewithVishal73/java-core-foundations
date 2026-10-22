import java.util.Scanner;
import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
public class dt5{
         public static void main(String [] args){
			Scanner s = new Scanner(System.in);
			System.out.println("enter first Date:");
			String date1= s.nextLine();
			System.out.println("enter second Date:");
			String date2= s.nextLine();
			DateTimeFormatter f= DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate d1= LocalDate.parse(date1,f);
			LocalDate d2= LocalDate.parse(date2,f);
			System.out.println("no. of days between two dates: "+ChronoUnit.DAYS.between(d1,d2));
			s.close();
	}
}