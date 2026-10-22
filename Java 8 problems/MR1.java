import java.util.Scanner;
import java.util.ArrayList.Collectors;
import java.util.List.Collectors;
import java.util.*;
class person{
        String name;
        int age;
        public person(int name,int age){
                 this.age=age;
                 this.name=name;
        }
        public Integer getage(){
              return age;
        }
        
        public String getname(){
              return name;
        }
}
public class MR1{
     public static int comparebyage(person a,person b){
               return a.getage().compareTo(b.getage());
     }
      public static void main(String [] args){
                Scanner s= new Scanner(System.in);
                System.out.println("\nEnter size of list: ");
                int n= s.nextInt();
                List<person> plist= new ArrayList<>();
                System.out.println("Enter elements : ");
                for(int i=0;i<n;i++){
                         String name= s.nextLine();
                         int age= s.nextInt();
                         plist(name,age);
                }
                Collectors.Sort(plist,MR1::comparebyage);
                System.out.println("Sort By age : ");
                plist.stream().map(x->x.getname()).forEach(System.out::println);
                s.close();
      }
}