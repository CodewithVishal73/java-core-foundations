import java.time.LocalTime;
import java.util.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class dt11{
         public static void main(String [] args){
			LocalTime t= LocalTime.now();
			int hours= t.getHour();
			if(hours>12)
					System.out.println("PM");
			else
					System.out.println("AM");
	}
}