import java.util.HashMap;
import java.io.*;
public class HashMap1{
        public static void main(String[] args) throws IOException{
                    HashMap<String,Integer> hmap= new HashMap<>();
                    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Enter size of HashMap:");
                    int n= Integer.parseInt(br.readLine());
                    System.out.println("Enter key and values to add in HashSet:");
                    for(int i=0;i<n;i++){
                            System.out.println("\nEnter student: ");
                            String student= br.readLine();
                            System.out.println("\nEnter Marks: ");
                            int marks= Integer.parseInt(br.readLine());
                            hmap.put(student,marks);
                    }
                    int max=0;
                    for(String i : hmap.keySet()){
                            if(hmap.get(i)>max){
                                   max=hmap.get(i);
                            }
                    }
                    for(String i : hmap.keySet()){
                            if(hmap.get(i)==max){
                                   System.out.println("\nMaximum marks student : "+i);
                            }
                    }

        }
}