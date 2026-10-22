import java.util.Random;
import java.util.Scanner;
import java.util.*;
public class numberguessing{
        public static void main(String[] args){
			Random r= new Random();
			int n= r.nextInt(1,101);
			Scanner s= new Scanner(System.in);
			System.out.println("Hii Welcome to Number Guessing Game:-\nPlease Enter your any number between 1 to 100:");
			int ch= s.nextInt();
			if(ch>n)
				System.out.println("Too High");
			else if(ch<n)
				System.out.println("Too Low");
			else
				System.out.println("Congratulation you successfully guess the number and won:");

			s.close();
	}
}