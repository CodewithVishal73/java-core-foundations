import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
public class HashSet4{
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
                    int k=0;
                    TreeSet<Integer> tset= new TreeSet<>();
                    for(int i : hset){
                         k=0;
                         for(int j=1;j<=i;j++){
                                if(i%j==0){
                                    k++;
                                }
                         }
                         if(k==2){
                                tset.add(i);
                        }
                    }
                    System.out.println("New Set with prime numbers : "+tset);
                    s.close();
        }
}