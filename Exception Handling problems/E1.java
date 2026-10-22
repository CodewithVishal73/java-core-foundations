public class E1{
       public static void main(String [] args){

			int a=10;
			int b=0;
			try{
				int c= a/b;
				System.out.println("division is : "+c);
			}
			catch(ArithmeticException e){
				System.out.println("Diviide by zero error is recognized");
			}
			finally{
				System.out.println("Finally block is executed....");
			}
	}
}