import java.util.Scanner;
public class Account{
         private String name;
	 private int acc_no;
	 private double balance;
	
	 public Account(int acc_no, String name, double balance) {
        	this.acc_no = acc_no;
        	this.name = name;
        	this.balance = balance;
         }

	public String getname(){
		   return name;
	}
	public int getacc(){
		   return acc_no;
	}
	public double getbalance(){
		return balance;
	}
	public void deposit(double damount){

		  this.balance+= damount;
	}
	public void withdraw(double wamount){
		    if(wamount <= balance){
            			this.balance -= wamount;
        	    }
		    else{
           			System.out.println("Insufficient balance!");
        	    }
	}
	public void display(){
		System.out.println("Name: "+name);
		System.out.println("Account no: "+acc_no);
		System.out.println("Balance: "+balance);
		System.out.println("_____________________________________________________");
	}
	
	public static void main(String [] args){

			Scanner s= new  Scanner(System.in);
		        System.out.println("Enter number of accounts: ");
			int n= s.nextInt();
			Account [] accounts= new Account[n];
			for(int i=0;i<n;i++){
				System.out.println("Enter Holder Name: ");
				s.nextLine();
				String name= s.nextLine();
				System.out.println("Enter account no: ");
				int acc_no= s.nextInt();
				System.out.println("Enter balance: ");
				double balance= s.nextDouble();
				accounts[i]= new Account(acc_no, name, balance);
			}
			System.out.println("Accounts with Balance greater than 1000 :-");
			for(Account ac : accounts){
				if(ac.getbalance()>1000){
				   	ac.display();
				}
			}
			System.out.println("\n_______________________________________________\n\n");
			System.out.println("Enter account no where you want to deposit or withdraw: ");
			int Acc= s.nextInt();
			for(Account ac1 : accounts){
				if(ac1.getacc()==Acc){
						System.out.println("Enter what you want to perform withdraw or deposit: ");
						s.nextLine();
						String choice= s.nextLine().toLowerCase();
						switch(choice){
							case "withdraw":
								System.out.println("Enter amount you want to withdraw: ");
								double wamount= s.nextDouble();
								ac1.withdraw(wamount);
                        					break;		
							case "deposit":
								System.out.println("Enter amount you want to deposit: ");
								double damount= s.nextDouble();
								ac1.deposit(damount);
								break;
							default:
								System.out.println("Invalid choice.....");
						}
						System.out.println("Account details with new ammount:-");
						ac1.display();
						break;
				}
				
						
			}
			s.close();
	}
}