import java.util.Scanner;
import java.util.stream.*;
import java.util.*;
public class stream4{
        public static void main(String [] args){
                   Scanner s = new Scanner(System.in);
                   List<String> normal= new  ArrayList<>();
                   System.out.println("\nEnter size of list : ");
                   int n=s.nextInt();
                   s.nextLine();
                   System.out.print("\nenter list elements : ");
                   for(int i=0;i<n;i++){
                          String st= s.nextLine();
                          normal.add(st);
                   }
                   System.out.println("\nfinal list : ");
                   normal.stream().distinct().sorted(Comparator.comparingInt(String::length)).limit(3).forEach(System.out::println);
                   s.close();
        }
}