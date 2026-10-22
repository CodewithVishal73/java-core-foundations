import java.util.Scanner;
import java.util.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class dt9{
         public static void main(String [] args){
			Scanner s = new Scanner(System.in);
			System.out.println("enter date 1:");
			String date1= s.nextLine();
		        System.out.println("enter date 2:");
			String date2= s.nextLine();
			DateTimeFormatter f= DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate d1= LocalDate.parse(date1,f);
			LocalDate d2= LocalDate.parse(date2,f);
			int cnt=0;
			while(!d1.isAfter(d2)){
                                if(d1.getDayOfWeek()!=DayOfWeek.SATURDAY && d1.getDayOfWeek()!=DayOfWeek.SUNDAY){
					 cnt++;
				}
				d1=d1.plusDays(1);
			}
			System.out.println("total working days two dates: "+cnt);
			s.close();
	}
}