import java.util.Scanner;
import java.util.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class dt7{
         public static void main(String [] args){
			Scanner s = new Scanner(System.in);
			System.out.println("enter year:");
			int year= s.nextInt();
		        System.out.println("enter month:");
			int month= s.nextInt();
			LocalDate date= LocalDate.of(year,month,1);
			while(date.getMonthValue()== month){
                                if(date.getDayOfWeek()==DayOfWeek.MONDAY){
					 System.out.println(date);
				}
				date=date.plusDays(1);
			}
			s.close();
	}
}