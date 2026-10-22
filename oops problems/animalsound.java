
abstract class animal{
	abstract void sound();
}
class Dog extends animal{
		@Override
		void sound(){
			System.out.println("dog barks");
		}
}
class Cat extends animal{
		@Override
		void sound(){
			System.out.println("cat meows");
		}
}
public class animalsound{
		public static void main(String [] args){
			     animal dog= new Dog();
			     animal cat= new Cat();
			     dog.sound();
			     cat.sound();
		}
}