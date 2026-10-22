import java.util.Scanner;
class Product{
         private String name;
	 private float price;
	 private int Id;
	 private int stock;
	 private double Total;
	
	 public Product(String name, float price, int Id, int stock) {
        	this.name= name;
        	this.price = price;
		this.Id = Id;
		this.stock= stock;
		Totall();
         }

	public String getname(){
		   return name;
	}
	public float getprice(){
		   return price;
	}
	public int getId(){
		   return Id;
	}
	public int getStock(){
		return stock;
	}
	public double getTotal(){
		return Total;
	}
	public void Totall(){
		  this.Total = price*stock;
		 
	}
	public void display(){
		System.out.println("product Name: "+name);
		System.out.println("price: "+price);
		System.out.println("Id: "+Id);
		System.out.println("Stock: "+stock);
		System.out.println("_____________________________________________________");
	}

}
public class Inventory{
		public static void main(String [] args){
						
			Scanner s= new  Scanner(System.in);
		        System.out.println("Enter number of products: ");
			int n= s.nextInt();
			Product [] products= new Product[n];
			for(int i=0;i<n;i++){
				System.out.println("Enter name: ");
				s.nextLine();
				String name= s.nextLine();
				System.out.println("Enter price: ");
				float price= s.nextFloat();
				System.out.println("Enter Id: ");
				int Id= s.nextInt();
				System.out.println("Enter stock quantity: ");
				int stock= s.nextInt();
				products[i]= new Product(name, price, Id, stock);
			}
			int cnt=0;
			for(Product p : products){
				if(p.getStock()<10){
				  	 p.display();
					 cnt=1;
				}
			}
			if(cnt==0){
				 System.out.println("No Book has stock less than 10");
			}
			double totalval=0;
			for(Product p : products){
				totalval+= p.getTotal();
			}
			 System.out.println("\nTotal value of Inventory : "+totalval);
			s.close();
		}
}