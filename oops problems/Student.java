import java.util.Scanner;
public class Student{
         private String name;
	 private int roll_no;
	 private float [] marks=new float[5];
	 private double average;
	
	 public Student(int roll_no, String name, float[] marks) {
        	this.roll_no = roll_no;
        	this.name = name;
        	this.marks = marks;
        	calculateAverage();
         }

	public String getname(){
		   return name;
	}
	public int getroll(){
		   return roll_no;
	}
	public float[] getmarks(){
		   return marks;
	}
	public double getaverage(){
		return average;
	}
	public void calculateAverage(){
		  double sum=0;
		  for(int i=0;i<5;i++){
			sum+= marks[i];
		  }
		  this.average= sum/marks.length;
	}
	public void display(){
		System.out.println("Name: "+name);
		System.out.println("Roll no: "+roll_no);
		System.out.println("Marks in 5 Subjects:-");
		for(float mark : marks){
			System.out.println(mark);
		}
		System.out.println("Average :"+average);
		System.out.println("_____________________________________________________");
	}
	
	public static void main(String [] args){

			Scanner s= new  Scanner(System.in);
		        System.out.println("Enter number of students: ");
			int n= s.nextInt();
			Student [] students= new Student[n];
			for(int i=0;i<n;i++){
				System.out.println("Enter Name: ");
				s.nextLine();
				String name= s.nextLine();
				System.out.println("Enter Roll no: ");
				int roll_no= s.nextInt();
				System.out.println("Marks in 5 Subjects:-");
				float [] marks= new float[5];
				for(int j=0;j<5;j++){
					marks[j]= s.nextFloat();
				}
			
				students[i]= new Student(roll_no, name, marks);
			}
			System.out.println("Students Report card :-");
			for(Student st : students){
				   st.display();
			}
			s.close();
	}
}