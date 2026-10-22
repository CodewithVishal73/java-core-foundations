import java.util.Scanner;
public class Employee{
         private String name;
	 private double basic;
	 private float Hra;
	 private float DA;
	 private double gross;
	
	 public Employee(double basic, String name, float hra, float da) {
        	this.basic= basic;
        	this.name = name;
        	this.Hra = hra;
		this.DA = da;
        	calculateGrossSalary();
         }

	public String getname(){
		   return name;
	}
	public double getBasicSalary(){
		   return basic;
	}
	public float getHra(){
		   return Hra;
	}
	public float getDa(){
		   return DA;
	}
	public double getGross(){
		return gross;
	}
	public void calculateGrossSalary(){
		  this.gross= basic + Hra + DA;
	}
	public void display(){
		System.out.println("Name: "+name);
		System.out.println("Basic Salary: "+basic);
		System.out.println("HRA: "+Hra);
		System.out.println("DA: "+DA);
		System.out.println("Gross Salary: "+gross);
		System.out.println("_____________________________________________________");
	}
	
	public static void main(String [] args){

			Scanner s= new  Scanner(System.in);
		        System.out.println("Enter number of Employee: ");
			int n= s.nextInt();
			Employee [] employees= new Employee[n];
			for(int i=0;i<n;i++){
				System.out.println("Enter Name: ");
				s.nextLine();
				String name= s.nextLine();
				System.out.println("Enter Basic Salary: ");
				double basic= s.nextDouble();
				System.out.println("Enter HRA: ");
				float Hra= s.nextFloat();
				System.out.println("Enter DA: ");
				float Da= s.nextFloat();
				employees[i]= new Employee(basic, name, Hra, Da);
			}
			System.out.println("Employees salary Slip whose gross salary is greater than 50000 :-");
			for(Employee emp : employees){
				if(emp.getGross() > 50000){
				  	 emp.display();
				}
			}
			s.close();
	}
}