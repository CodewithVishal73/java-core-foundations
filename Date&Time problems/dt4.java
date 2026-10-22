import java.util.Scanner;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class dt4{
         public static void main(String [] args){
			Scanner s = new Scanner(System.in);
			System.out.println("enter any Date:");
			String date= s.nextLine();
			DateTimeFormatter f= DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate d= LocalDate.parse(date,f);
			d=d.plusYears(2).plusMonths(3).plusDays(12);
			System.out.println("Date after adding years months and days: "+d);
			s.close();
	}
}