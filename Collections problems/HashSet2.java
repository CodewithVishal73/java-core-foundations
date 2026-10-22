import java.util.HashSet;
import java.util.TreeSet;
import java.util.Scanner;
public class HashSet2{
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
                    TreeSet<Integer> tset= new TreeSet<>(hset);
                    System.out.println("\nHashSet converted to tree set : ");
                    for(int j: tset){
                            System.out.print(j+" ");
                    }
                    s.close();
        }
}