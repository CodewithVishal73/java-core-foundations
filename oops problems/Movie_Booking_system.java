import java.util.Scanner;
class Movie{
         private String name;
	 private String cust_name;
	 private float price;
	 private int Id;
	 private int seat_no;
	
	 public Movie(String name, String cust_name, float price, int Id, int seat_no){
        	this.name= name;
        	this.cust_name = cust_name;
        	this.price = price;
		this.Id = Id;
		this.seat_no= seat_no;
         }

	public String getname(){
		   return name;
	}
	public String getcustomer(){
		   return cust_name;
	}
	public float getprice(){
		   return price;
	}
	public int getId(){
		   return Id;
	}
	public int getseat(){
		return seat_no;
	}
	public void display(){
		System.out.println("Movie name : "+name);
		System.out.println("customer name : "+cust_name);
		System.out.println("price : "+price);
		System.out.println("Ticket Id : "+Id);
		System.out.println("Seat No. : "+seat_no);
		System.out.println("_____________________________________________________");
	}
	
}
public class Movie_Booking_system{
		public static void main(String [] args){
			Scanner s= new  Scanner(System.in);
		        System.out.println("Enter number of tickets: ");
			int n= s.nextInt();
			Movie [] tickets= new Movie[n];
			s.nextLine();
			for(int i=0;i<n;i++){
				System.out.println("Enter movie name: ");
				String name= s.nextLine();
				System.out.println("Enter customer name: ");
				String cust_name= s.nextLine();
				System.out.println("Enter price: ");
				float price= s.nextFloat();
				System.out.println("Enter Id: ");
				int Id= s.nextInt();
				System.out.println("Enter seat No: ");
				int seat_no= s.nextInt();
				s.nextLine();
				tickets[i]= new Movie(name, cust_name, price, Id, seat_no);
			}
			System.out.println("Enter movie that want to see all tickets:");
			String choice= s.nextLine();
			int cnt=0;
			for(Movie m : tickets){
				if(m.getname().equalsIgnoreCase(choice)){
				  	 m.display();
					 cnt=1;
				}
			}
			if(cnt==0){
				 System.out.println("no ticket found for this movie...");
			}
			for (int i = 0; i < n; i++) {
   				 String currentMovie = tickets[i].getname();
				 boolean repeat = false;
				 for (int k = 0; k < i; k++) {
       					 if (tickets[k].getname().equalsIgnoreCase(currentMovie)) {
           					 repeat = true;
           					 break;
        				 }
   				 }
				 if(!repeat){
					int count=0;
   				 	for (int j=0; j < n; j++) {
       					 	if (tickets[j].getname().equalsIgnoreCase(currentMovie)) {
           				 		count++;
        			 	 	}
   				 	}
					 System.out.println("\n"+currentMovie+": "+count+" Tickets");
				 }
			}
			s.close();
		}
}