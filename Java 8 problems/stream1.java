import java.util.Scanner;
import java.util.*;
public class stream1{
        public static void main(String [] args){
                   Scanner s = new Scanner(System.in);
                   List<Integer> list= new  ArrayList<>();
                   System.out.println("\nEnter size of list : ");
                   int n=s.nextInt();
                   System.out.print("\nenter list elements : ");
                   for(int i=0;i<n;i++){
                          int num= s.nextInt();
                          list.add(num);
                   }
                   System.out.println("\nODD NUMBERS : ");
                   list.stream().filter(x-> x%2!=0).forEach(System.out::println);
                   s.close();
        }
}