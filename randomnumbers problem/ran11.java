import java.util.Random;
import java.util.Scanner;
import java.util.*;
public class ran11{
        public static void main(String[] args){
			Random r= new Random();
			Scanner s= new Scanner(System.in);
			String card[] = {"Heart","Spade","Club","Diamond"};
			String rank[] = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
			for(int i=0;i<52;i++){
				int i1= r.nextInt(4);
				int i2=r.nextInt(13);
				System.out.println(rank[i2]+" OF "+card[i1]);
			}
			s.close();
	}
}