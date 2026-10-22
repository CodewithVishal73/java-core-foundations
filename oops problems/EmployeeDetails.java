import java.util.Scanner;
class employee{
	 private String name;
	 private int age;
	 private double salary;
	
	 public employee() {
         }
	public String getname(){
		   return name;
	}
	public void setname(String name){
			this.name= name;
	}
	public int getage(){
		   return age;
	}
	public void setAge(int age){
			this.age= age;
	}
	public double getSalary(){
		return salary;
	}
	public void setsalary(double salary){
			this.salary= salary;
	}
}

public class EmployeeDetails{
		public static void main(String [] args){
			 employee ac= new employee();
			 Scanner s= new Scanner(System.in);
			 System.out.println("Enter Name: ");
			 String name= s.nextLine();
			 System.out.println("Enter age:");
			 int age= s.nextInt();
			 System.out.println("Enter Salary:");
			 double salary= s.nextDouble();
			 ac.setname(name);
			 ac.setAge(age);
			 ac.setsalary(salary);
			 System.out.println("\nName : "+ac.getname());
			 System.out.println("Age : "+ac.getage());
			 System.out.println("Salary : "+ac.getSalary());
			 s.close();
		}
}