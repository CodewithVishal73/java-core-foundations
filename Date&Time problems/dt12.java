import java.time.LocalTime;
import java.util.*;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class dt12{
         public static void main(String [] args){
			LocalDateTime t= LocalDateTime.now();
			System.out.println("current Time in iso format: "+t.toString());
	}
}