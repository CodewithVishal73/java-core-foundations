import java.util.Random;
import java.util.Scanner;
import java.util.*;
public class ran12{
        public static void main(String[] args){
			Random r= new Random();
			Scanner s= new Scanner(System.in);
			System.out.println("enter length of password:");
			int l= s.nextInt();
			String c= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+<>?/";
			StringBuilder pass= new StringBuilder();
			for(int i=0;i<l;i++){
				int ind= r.nextInt(c.length());
				pass.append(c.charAt(ind));
			}
			System.out.println("random password: "+ pass.toString());
			s.close();
	}
}