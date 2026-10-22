import java.util.Scanner;
import java.util.*;
import java.time.LocalTime;
public class dt13{
	public static void main(String[] args){
			Scanner s= new Scanner(System.in);
			System.out.println("enter seconds to count:");
			int sec= s.nextInt();
			for(int i=sec;i>0;i--){
				System.out.println("Time remaining: "+i+" Seconds");
				 try {
                			Thread.sleep(1000); 
          			 } 
				 catch (InterruptedException e) {
               				 System.err.println("Timer interrupted!");
            			 }
			}
			System.out.println("Time's up: "+LocalTime.now());
			s.close();
	}
}