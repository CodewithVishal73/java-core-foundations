import java.util.Scanner;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class dt14{
	public static void main(String[] args){
			Scanner s= new Scanner(System.in);
			DateTimeFormatter f= DateTimeFormatter.ofPattern("dd-MM-yyyy");
			System.out.println("enter start date1:");
			LocalDate start1= LocalDate.parse(s.nextLine(),f);
			System.out.println("enter start date2:");
			LocalDate start2= LocalDate.parse(s.nextLine(),f);
			System.out.println("enter end date1:");
			LocalDate end1= LocalDate.parse(s.nextLine(),f);
			System.out.println("enter end date2:");
			LocalDate end2= LocalDate.parse(s.nextLine(),f);
			boolean k= !start1.isAfter(end2) && !start2.isAfter(end1);
			System.out.println("overlap: "+k);
			s.close();
	}
}