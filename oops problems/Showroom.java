import java.util.Scanner;
class Car{
         private String model;
	 private String company;
	 private double price;

	 public Car(String model, String company, double price) {
        	this.model = model;
        	this.company = company;
        	this.price = price;
         }

	public String getmodel(){
		   return model;
	}
	public String getcompany(){
		   return company;
	}
	public double getprice(){
		return price;
	}
	public void display(){
		System.out.println("Model: "+model);
		System.out.println("company: "+company);
		System.out.println("price: "+price);
		System.out.println("_____________________________________________________");
	}
	
}
public class Showroom{
		public static void main(String [] args){

			Scanner s= new  Scanner(System.in);
		        System.out.println("Enter number of cars: ");
			int n= s.nextInt();
			Car [] cars= new Car[n];
			s.nextLine();
			for(int i=0;i<n;i++){
				System.out.println("Enter model: ");
				String model= s.nextLine();
				System.out.println("Enter company: ");
				String company= s.nextLine();
				System.out.println("Enter price: ");
			        double price= s.nextDouble();
				cars[i]= new Car(model, company, price);
				s.nextLine();
			}
			System.out.println("Toyota cars:-");
			int cnt=0;
			for(Car c : cars){
				if(c.getcompany().equalsIgnoreCase("Toyota")){
				  	 c.display();
					 cnt=1;
				}
			}
			if(cnt==0){
				 System.out.println("Toyota Cars not found...");
			}
			double max=0;
			for(Car c : cars){
				if(c.getprice()>max){
				  	 max=c.getprice();
				}
			}
			System.out.println("Most expensive car in showroom :-");
			for(Car c : cars){
				if(c.getprice()==max){
				  	 c.display();
				}
			}
			s.close();
		}
}