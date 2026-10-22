import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class dt10{
         public static void main(String [] args){
			ZonedDateTime t= ZonedDateTime.now();
			ZonedDateTime kolkata= t.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
			ZonedDateTime Utc= t.withZoneSameInstant(ZoneId.of("UTC"));
			ZonedDateTime Newyork= t.withZoneSameInstant(ZoneId.of("America/New_York"));
			System.out.println("timezone of kolkata: "+kolkata);
			System.out.println("timezone of UTC: "+Utc);
			System.out.println("timezone of NewYork: "+ Newyork);
	}
}