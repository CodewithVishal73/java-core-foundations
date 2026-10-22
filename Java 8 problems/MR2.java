import java.util.Scanner;
import java.util.*;
class personN{
        String name;
        public personN(String name){
                 this.name=name;
        }
        
        public String getname(){
              return name;
        }
}
public class MR2{
     public static int comparebyname(personN a,personN b){
               return a.getname().compareTo(b.getname());
     }
      public static void main(String [] args){
                Scanner s= new Scanner(System.in);
                System.out.println("\nEnter size of list: ");
                int n= s.nextInt();
                s.nextLine();
                List<personN> plist= new ArrayList<>();
                System.out.println("Enter elements : ");
                for(int i=0;i<n;i++){
                         String name= s.nextLine();
                         plist.add(new personN(name));
                }
                Collections.sort(plist,MR2::comparebyname);
                System.out.println("Sort Name By alphabetical order : ");
                plist.stream().map(x->x.getname()).forEach(System.out::println);
                s.close();
      }
}