
class person{
	void intro(){
		System.out.println("hi first i am a person");
	}
}
class Teacher extends person{
		void identity(){
			System.out.println("my identity is teacher");
		}
}
class student extends person{
		void Identity(){
			System.out.println("my identity is student");
		}
}
public class PersonSystem{
		public static void main(String [] args){
			 Teacher t= new Teacher();
			 t.intro();
			 t.identity();
			 student s= new student();
			 s.intro();
			 s.Identity();
		}
}