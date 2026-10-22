import java.util.HashSet;
import java.util.Scanner;
import java.util.Collections;
public class HashSet1{
        public static void main(String[] args){
                    HashSet<Integer> hset= new HashSet<>();
                    Scanner s= new Scanner(System.in);
                    System.out.println("Enter size of HashSet:");
                    int n= s.nextInt();
                    System.out.println("Enter numbers to add in HashSet:");
                    for(int i=0;i<n;i++){
                            int num= s.nextInt();
                            hset.add(num);
                    }
                    int max= Collections.max(hset);
                    int min= Collections.min(hset);
                    System.out.println("Maximum element in set: "+max);
                    System.out.println("Minimum element in set: "+min);
                    s.close();
        }
}