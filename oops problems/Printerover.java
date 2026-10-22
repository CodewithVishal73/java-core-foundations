
class printer{
	void print(){
  		System.out.println("data is printed");
	}
	void print(String name){
		System.out.println("hi i am "+name);
	}
}

public class printerover{
		public static void main(String [] args){
			   printer p= new printer();
			   p.print();
			   p.print("vishal");
		}
}