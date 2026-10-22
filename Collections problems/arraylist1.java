import java.util.ArrayList;
import java.util.Scanner;
public class arraylist1{
     public static void main(String [] args){
                ArrayList<Integer> arr= new ArrayList<>();
                Scanner s= new Scanner(System.in);
                System.out.println("Enter size of arraylist:");
                int n= s.nextInt();
                System.out.println("Enter numbers to add in array list:");
                for(int i=0;i<n;i++){
                         int num= s.nextInt();
                         arr.add(num);
                }
                System.out.println("array list in reverse order : ");
                for(int i=n-1;i>=0;i--){
                       System.out.print(arr.get(i)+" ");
                }
                s.close();
     }
}