import java.util.Scanner;
class Account{
	 private int acc_no;
	 private double balance;
	
	 public Account() {
         }

	public int getacc(){
		   return acc_no;
	}
	public void setAcc(int acc_no){
			this.acc_no= acc_no;
	}
	public double getbalance(){
		return balance;
	}
	public void setBalance(double balance){
			this.balance= balance;
	}
}

public class AccountSystem{
		public static void main(String [] args){
			 Account ac= new Account();
			 Scanner s= new Scanner(System.in);
			 System.out.println("Enter account number:");
			 int acc_no= s.nextInt();
			 System.out.println("Enter balance:");
			 double balance= s.nextDouble();
			 ac.setAcc(acc_no);
			 ac.setBalance(balance);
			 System.out.println("\nAccount number : "+ac.getacc());
			 System.out.println("Balance : "+ac.getbalance());
			 s.close();
		}
}