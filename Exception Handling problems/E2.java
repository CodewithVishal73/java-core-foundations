public class E2{
       public static void main(String [] args){

			int[] a= new int[5];
			try{
				a[6]=10;
				System.out.println("array value at index 6: "+ a[6]);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("accessing array Index 6 is out of range");
			}
			finally{
				System.out.println("Finally block is executed....");
			}
	}
}