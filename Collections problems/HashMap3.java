import java.util.HashMap;
import java.io.*;
public class HashMap3{
        public static void main(String[] args) throws IOException{
                    HashMap<String,Integer> hmap1= new HashMap<>();
                    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Enter size of HashMap1:");
                    int n1= Integer.parseInt(br.readLine());
                    System.out.println("Enter key and values to add in first HashMap:");
                    for(int i=0;i<n1;i++){
                            System.out.println("\nEnter cars: ");
                            String cars1= br.readLine();
                            System.out.println("\nEnter mileage: ");
                            int mileage1= Integer.parseInt(br.readLine());
                            hmap1.put(cars1,mileage1);
                    }
                    HashMap<String,Integer> hmap2= new HashMap<>();
                    System.out.println("Enter size of HashMap2:");
                    int n2= Integer.parseInt(br.readLine());
                    System.out.println("Enter key and values to add in second HashMap:");
                    for(int i=0;i<n2;i++){
                            System.out.println("\nEnter cars: ");
                            String cars2= br.readLine();
                            System.out.println("\nEnter mileage: ");
                            int mileage2= Integer.parseInt(br.readLine());
                            hmap2.put(cars2,mileage2);
                    }
                    hmap1.putAll(hmap2);
                    System.out.println("\nhashmap after merging: "+hmap1);
        }
}