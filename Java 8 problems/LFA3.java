import java.util.Scanner;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;
public class LFA3{
    public static void main(String [] args){
            Scanner s = new Scanner(System.in);
            ArrayList<Integer> list= new ArrayList<>();
            System.out.print("Enter number of elements: ");
            int size = s.nextInt();
            System.out.println("\nEnter list elements : ");
            for(int i=0;i<size;i++){
                      int n=s.nextInt();
                      list.add(n);
            }
            Predicate<Integer> even= (n)->n%2==0;
            List<Integer> evens = list.stream().filter(even).collect(Collectors.toList());
            System.out.println("\nEven numbers : ");
            evens.forEach(System.out::println);
            s.close();
    }
}