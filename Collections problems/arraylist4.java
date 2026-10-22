import java.util.ArrayList;
import java.util.Scanner;
public class arraylist4{
     public static void main(String [] args){
                ArrayList<Integer> ar= new ArrayList<>();
                Scanner s= new Scanner(System.in);
                System.out.println("Enter size of arraylist:");
                int n= s.nextInt();
                System.out.println("Enter numbers to add in array list:");
                for(int i=0;i<n;i++){
                         int num= s.nextInt();
                         ar.add(num);
                }
                for(int i=0;i<n;i++){
                       if(ar.get(i)%2==0){
                             ar.remove(i);
                             n--;
                       }
                }
                System.out.println("Array after removing even numbers: ");
                for(int i=0;i<n;i++){
                         System.out.print(ar.get(i)+" ");
                }
                s.close();
     }
}