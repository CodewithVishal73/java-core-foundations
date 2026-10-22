import java.util.Scanner;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class dt6{
         public static void main(String [] args){
			Scanner s = new Scanner(System.in);
			System.out.println("enter any Date:");
			String date= s.nextLine();
			DateTimeFormatter f= DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate d= LocalDate.parse(date,f);
			LocalDate n= LocalDate.now();
			if(d.isAfter(n)==true)
			             System.out.println("FUTURE");
			else
				     System.out.println("PAST");
			s.close();
	}
}