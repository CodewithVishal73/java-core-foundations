import java.util.*;
public class Banktoken{
     public static void main(String [] args){
                Queue<Integer> q= new LinkedList<Integer>();
                Scanner s= new Scanner(System.in);
                System.out.println("Enter total number of tokens:");
                int n= s.nextInt();
                int token=1;
                System.out.println("Bank Token Simulation:-\n1. Customer Enter\n2. Customer serving\n 3. Status\n0. Exit");
                while(true){
                      System.out.println("Enter your choice");
                      int choice= s.nextInt();
                      switch(choice){
                             case 1:
                                 if(token<=n){
                                       q.add(token);
                                       System.out.println("\nToken Generated : "+token++);
                                 }
                                 else{
                                     System.out.println("\nNo more token Available");
                                 }
                                 break;
                             case 2:
                                if(q.isEmpty()){
                                    System.out.println("\nNo more customer are remaining");
                                }
                                else{
                                    int temp= q.poll();
                                    System.out.println("\nCustomer serving token number : "+temp);
                                }
                                 break;
                             case 3:
                                if(q.isEmpty()){
                                    System.out.println("\nNo more customer are remaining");
                                }
                                else{
                                    System.out.println("\nCustomers remaining : "+q);
                                }
                                break;
                             case 0:
                                 System.out.println("\nBank is closed Now.\nSorry for Any Inconvenience");
                                 return;
                             default:
                                 System.out.println("\nInvalid choice\nPlease enter valid choice..");
                      }
                }
     }
}