import java.util.ArrayList;
import java.util.Scanner;
public class arraylist3{
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
                int max=ar.get(0);
                int min=ar.get(0);
                for(int i=0;i<n;i++){
                       if(ar.get(i)>max){
                             max=ar.get(i);
                       }
                       if(ar.get(i)<min){
                             min=ar.get(i);
                       }
                }
                int secondmax=min;
                for(int i=0;i<n;i++){
                       if(ar.get(i)!=max && ar.get(i)>secondmax){
                             secondmax=ar.get(i);
                       }
                }
                if(secondmax==min){
                       System.out.println("No second largest found...");
                }
                else{
                     System.out.println("Second largest : "+secondmax);
                }
                s.close();
     }
}