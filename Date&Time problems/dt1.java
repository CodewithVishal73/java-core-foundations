import java.util.Scanner;
import java.util.*;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.time.LocalDateTime;
public class dt1{
         public static void main(String [] args){
			Scanner s = new Scanner(System.in);
			System.out.println("enter you DOB:");
			String dob= s.nextLine();
			DateTimeFormatter f= DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate dob1= LocalDate.parse(dob,f);
			LocalDate n= LocalDate.now();
			Period age= Period.between(dob1,n);
			System.out.println("years: "+age.getYears()+"\n"+"Months :"+age.getMonths()+"\n"+"Days :"+age.getDays());
			s.close();
	}
}