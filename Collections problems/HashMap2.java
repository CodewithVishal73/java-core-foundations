import java.util.HashMap;
import java.util.TreeMap;
import java.io.*;
public class HashMap2{
        public static void main(String[] args) throws IOException{
                    HashMap<String,Integer> hmap= new HashMap<>();
                    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Enter size of HashMap:");
                    int n= Integer.parseInt(br.readLine());
                    System.out.println("Enter key and values to add in HashMap:");
                    for(int i=0;i<n;i++){
                            System.out.println("\nEnter cars: ");
                            String cars= br.readLine();
                            System.out.println("\nEnter mileage: ");
                            int mileage= Integer.parseInt(br.readLine());
                            hmap.put(cars,mileage);
                    }
                    TreeMap<String,Integer> tmap= new TreeMap(hmap);
                    System.out.println("\nKeys in Alphabetical order: ");
                    for(String i : tmap.keySet()){
                            System.out.print(i+" ");
                    }

        }
}