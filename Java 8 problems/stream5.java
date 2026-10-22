import java.util.Scanner;
import java.util.stream.*;
import java.util.*;
class transaction{
        private String type;
        private int id;
        private double amount;
        public transaction(int id,double amount,String type){
                 this.id=id;
                 this.amount=amount;
                 this.type=type;
        }
        public Integer getID(){
              return id;
        }
        
        public String gettype(){
              return type;
        }
        public Double getamount(){
              return amount;
        }

        @Override
        public String toString(){
               return "Transaction [ID=" + id + ", Amount=" + amount + ", Type=" + type + "]";
        }
}
public class stream5{
      public static void main(String [] args){
                Scanner s= new Scanner(System.in);
                System.out.println("\nEnter number of transactions: ");
                int n= s.nextInt();
                s.nextLine();
                List<transaction> ts= new ArrayList<>();
                System.out.println("Enter Transaction details : ");
                for(int i=0;i<n;i++){
                         int id= s.nextInt();
                         String type= s.next();
                         double amount=s.nextDouble();
                         ts.add(new transaction(id,amount,type));
                }
                double total_credit=ts.stream().filter(x-> x.gettype().equalsIgnoreCase("credit")).mapToDouble(transaction::getamount).sum();
                double total_Debit=ts.stream().filter(x->x.gettype().equalsIgnoreCase("debit")).mapToDouble(transaction::getamount).sum();
                double Highest=ts.stream().mapToDouble(transaction::getamount).max().orElse(0.0);
                System.out.println("Total Credit amount : "+total_credit);
                System.out.println("Total Debit amount : "+total_Debit);
                System.out.println("Highest amount : "+Highest);
                s.close();
      }
}