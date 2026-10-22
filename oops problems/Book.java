import java.util.Scanner;
public class Book{
         private String Title;
	 private String author;
	 private float price;
	 private int Id;
	 private int quantity;
	 private double Total;
	
	 public Book(String Title, String author, float price, int Id, int quantity) {
        	this.Title= Title;
        	this.author = author;
        	this.price = price;
		this.Id = Id;
		this.quantity= quantity;
		Totall();
         }

	public String getTitle(){
		   return Title;
	}
	public String getauthor(){
		   return author;
	}
	public float getprice(){
		   return price;
	}
	public int getId(){
		   return Id;
	}
	public int getQuantity(){
		return quantity;
	}
	public double getTotal(){
		return Total;
	}
	public void Totall(){
		  this.Total = price*quantity;
		 
	}
	public void display(){
		System.out.println("Title: "+Title);
		System.out.println("Author: "+author);
		System.out.println("price: "+price);
		System.out.println("Id: "+Id);
		System.out.println("quantity: "+quantity);
		System.out.println("_____________________________________________________");
	}
	
	public static void main(String [] args){

			Scanner s= new  Scanner(System.in);
		        System.out.println("Enter number of Books: ");
			int n= s.nextInt();
			Book [] books= new Book[n];
			s.nextLine();
			for(int i=0;i<n;i++){
				System.out.println("Enter Title: ");
				String Title= s.nextLine();
				System.out.println("Enter author name: ");
				String author= s.nextLine();
				System.out.println("Enter price: ");
				float price= s.nextFloat();
				System.out.println("Enter Id: ");
				int Id= s.nextInt();
				System.out.println("Enter quantity: ");
				int quantity= s.nextInt();
				s.nextLine();
				books[i]= new Book(Title, author, price, Id, quantity);
			}
			System.out.println("Enter book title you want to search book for:");
			String choice= s.nextLine();
			int cnt=0;
			for(Book b : books){
				if(b.getTitle().equalsIgnoreCase(choice)){
				  	 b.display();
					 cnt=1;
				}
			}
			if(cnt==0){
				 System.out.println("Book not found...");
			}
			double totalcost=0;
			for(Book b : books){
				totalcost+= b.getTotal();
			}
			 System.out.println("\nTotal cost of all books : "+totalcost);
			s.close();
	}
}