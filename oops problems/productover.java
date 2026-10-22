import java.util.Scanner;
class product{
	 private String name;
	 private double price;
	 private int quantity;
	 public product(String name){
		this.name=name;
		this.price=0.0;
		this.quantity=0;
	 }
	 public product(String name, double price){
			this.name=name;
			this.price=price;
			this.quantity=0;
	 }
	 public product(String name, double price, int quantity){
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	 }
	 void display(){
		System.out.println("Name : "+name);
		System.out.println("price : "+price);
		System.out.println("quantity : "+quantity);
	 }
}

public class productover{
		public static void main(String [] args){
		           product a1= new product("shampoo");
			   product a2= new product("facewash",329);
			   product a3= new product("soap",43.67,120);
			   a1.display();
			   a2.display();
			   a3.display();
		}
}