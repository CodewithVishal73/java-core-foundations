import java.util.Scanner;
class bank{
       private double balance;
       bank(double balance){
          this.balance=balance;
       }
       public synchronized void withdraw(double amount){
                    if((balance-1000)>=amount){
                         balance-=amount;
                         System.out.println("\namount withdrawal successfull : "+amount);
                         System.out.println("\nRemaining balance : "+balance);
                    }
                    else{
                        System.out.println("\nInsufficient Balance..");
                    }
       }
       public synchronized void deposit(double amount){
                    balance+=amount;
                    System.out.println("\nDeposit successfull new Balance: "+balance);
       }
       public double getbalance(){
           return balance;
       }
}
public class banker{
       public static void main(String [] args){
                Scanner s= new Scanner(System.in);
                System.out.println("Enter Balance : ");
                double balance = s.nextDouble();
                bank account= new bank(balance);
                System.out.println("\nEnter amount to deposit : ");
                double damount = s.nextDouble();
                System.out.println("\nEnter amount to withdraw : ");
                double wamount = s.nextDouble();
                Thread t1= new Thread(()-> {
                       for(int i=0;i<5;i++){
                                account.deposit(damount);
                                try{
                                     Thread.sleep(100);
                                }
                                catch(InterruptedException e){
                                    e.printStackTrace();
                                }
                       }
                });
                Thread t2= new Thread(()-> {
                       for(int i=0;i<5;i++){
                                account.withdraw(damount);
                                try{
                                     Thread.sleep(100);
                                }
                                catch(InterruptedException e){
                                    e.printStackTrace();
                                }
                       }
                });
                t1.start();
                t2.start();
                try{
                    t1.join();
                    t2.join();
                }
                catch(InterruptedException e){
                        e.printStackTrace();
                }
                System.out.println("\nFinal total balance left: "+account.getbalance());
                s.close();
       }
}