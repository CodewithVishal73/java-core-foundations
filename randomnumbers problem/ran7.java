import java.util.Random;
import java.util.Scanner;
public class ran7{
        public static void main(String[] args){
			Random r= new Random();
			Scanner s= new Scanner(System.in);
			System.out.println("enter limit of array:");
			int n= s.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++){
				arr[i]= s.nextInt();
			}
			int ind= r.nextInt(n);
			System.out.println("random number from array: "+arr[ind]);
			s.close();
	}
}