import java.util.Scanner;
class Address{
	 String addres;
	 Address(String addres){
		this.addres=addres;
	 }
}
class employee{
	  String name;
	  Address address;
	  employee(String name, Address address){
		this.name=name;
		this.address=address;
	  }

	  void display(){
		System.out.println("name of employee : "+name);
		System.out.println("Address of employee : "+address.addres);
	  }
}
public class empAddress{
		public static void main(String [] args){
			   Scanner s= new Scanner(System.in);
			   System.out.println("enter name of employee :");
			   String name= s.nextLine();
			   System.out.println("enter address of employee :");
			   String address= s.nextLine();
			   Address ad1= new Address(address);
			   employee emp= new employee(name,ad1);
			   emp.display();
			   s.close();
		}
}