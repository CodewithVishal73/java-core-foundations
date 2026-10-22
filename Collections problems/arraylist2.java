import java.util.ArrayList;
import java.util.Scanner;
public class arraylist2{
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
                       for(int j=i+1;j<n;j++){
                            if(ar.get(i)==ar.get(j)){
                                    for(int k=j;k<n-1;k++){
                                            ar.set(k,ar.get(k+1));
                                    }
                                    n--;
                                    j--;
                            }
                       }
                }
                System.out.println("Array after removing duplicates: ");
                for(int i=0;i<n;i++){
                         System.out.print(ar.get(i)+" ");
                }
                s.close();
     }
}