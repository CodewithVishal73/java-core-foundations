import java.util.*;
import java.util.Scanner;
public class Queue1{
     public static void main(String [] args){
                Queue<Integer> q= new LinkedList<Integer>();
                Scanner s= new Scanner(System.in);
                System.out.println("Enter size of Queue:");
                int n= s.nextInt();
                System.out.println("Enter numbers to add in queue:");
                for(int i=0;i<n;i++){
                         int num= s.nextInt();
                         q.add(num);
                }
                Queue<Integer> fq= new PriorityQueue<Integer>();
                while(!q.isEmpty()){
                       int k= q.poll();
                       if(k%2==0){
                             fq.add(k);
                       }
                }
               System.out.println("queue elements only even numbers: ");
                while(!fq.isEmpty()){
                       System.out.println(fq.poll()+" ");
                }
                s.close();
     }
}