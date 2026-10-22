import java.util.Scanner;
class Hotel{
         private String name;
	 private int room_no;
	 private int days;
	 private float rate;
	 private double Total;
	
	 public Hotel(int room_no, String name, int days, float rate) {
        	this.room_no = room_no;
        	this.name = name;
        	this.days = days;
		this.rate= rate;
		calculateTotalAmount();
         }

	public String getname(){
		   return name;
	}
	public int getroom(){
		   return room_no;
	}
	public int getdays(){
		return days;
	}
	public float getrate(){
		return rate;
	}
	public double getamount(){
		return Total;
	}
	public void calculateTotalAmount(){
		this.Total= rate * days;
	}
	public void display(){
		System.out.println("Name: "+name);
		System.out.println("Room no: "+room_no);
		System.out.println("No of days of stay: "+days);
		System.out.println("Rates per day: "+rate);
		System.out.println("Total amount: "+Total);
		System.out.println("_____________________________________________________");
	}
	
}
public class Reservation{
		public static void main(String [] args){

			Scanner s= new  Scanner(System.in);
		        System.out.println("Enter number of customers: ");
			int n= s.nextInt();
			Hotel [] customers= new Hotel[n];
			for(int i=0;i<n;i++){
				System.out.println("Enter Name: ");
				s.nextLine();
				String name= s.nextLine();
				System.out.println("Enter room no: ");
				int room_no= s.nextInt();
				System.out.println("Enter no of Days to stay: ");
				int days= s.nextInt();
				System.out.println("Enter rate per day :");
				float rate= s.nextFloat();
				customers[i]= new Hotel(room_no, name, days, rate);
			}
			System.out.println("customers with bill greater than 10000:-");
			for(Hotel cu : customers){
				if(cu.getamount()>10000){
				   	cu.display();
				}
			}
			s.close();
		}
}