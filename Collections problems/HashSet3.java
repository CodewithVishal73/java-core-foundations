import java.util.HashSet;
import java.util.Scanner;
public class HashSet1{
        public static void main(String[] args){
                    HashSet<Integer> hset= new HashSet<>();
                    Scanner s= new Scanner(System.in);
                    System.out.println("Enter size of Hashset:");
                    int n= s.nextInt();
                    System.out.println("Enter numbers to add in HashSet:");
                    for(int i=0;i<n;i++){
                            int num= s.nextInt();
                            hset.add(num);
                    }
                    
                    System.out.println("Enter value you want to check in hash set:");
                    
                    s.close();
        }
}