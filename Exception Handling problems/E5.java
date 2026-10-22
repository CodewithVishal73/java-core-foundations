public class E5{
       public static void main(String [] args){

			int a=10;
			int b=0;
			try{
				int c= a/b;
				System.out.println("division is : "+c);
				int[] arr= new int[5];
				arr[7]= 19;
				String st= null;
				System.out.println("length of st: "+st.length());
			}
			catch(ArithmeticException e){
				System.out.println("ArithmeticException caught :"+e.getMessage());
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("ArrayIndexOutOfBoundsException caught :"+e.getMessage());
			}
			catch(NullPointerException e){
				System.out.println("NullPointerException caught :"+e.getMessage());
			}
			finally{
				System.out.println("Finally block is executed....");
			}
	}
}