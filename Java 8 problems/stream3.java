import java.util.Scanner;
import java.util.stream.*;
import java.util.*;
class Employee{
        private String name;
        private int id;
        private double salary;
        public Employee(int id,String name, double salary){
                 this.id=id;
                 this.name=name;
                 this.salary=salary;
        }
        public Integer getID(){
              return id;
        }
        
        public String getname(){
              return name;
        }
        public Double getsalary(){
              return salary;
        }

        @Override
        public String toString(){
               return "Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
        }
}
public class stream3{
      public static void main(String [] args){
                Scanner s= new Scanner(System.in);
                System.out.println("\nEnter size of list: ");
                int n= s.nextInt();
                List<Employee> plist= new ArrayList<>();
                System.out.println("Enter elements : ");
                for(int i=0;i<n;i++){
                         int id= s.nextInt();
                         String name= s.next();
                         double salary=s.nextDouble();
                         plist.add(new Employee(id,name,salary));
                }
                System.out.println("Employees : ");
                plist.stream().map(x->x.getname()).forEach(System.out::println);
                System.out.println("\nSalary greater than 50000:  ");
                plist.stream().filter(x->x.getsalary()>50000).forEach(System.out::println);
                System.out.println("\nHighest salary : ");
                plist.stream().max(Comparator.comparingDouble(Employee::getsalary)).ifPresent(System.out::println);
                s.close();
      }
}