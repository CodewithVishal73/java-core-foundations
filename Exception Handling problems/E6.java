import java.util.Scanner;
public class E6{
		public static void main(String [] args){
				Scanner s= new Scanner(System.in);
				int[] arr= new int[5];
				int[] brr= new int[5];
				System.out.println("Enter first array elements :");
				for(int i=0;i<5;i++){
					arr[i]= s.nextInt();
				}
				System.out.println("Enter second array elements :");
				for(int i=0;i<5;i++){
					brr[i]= s.nextInt();
				}
				try{
					for(int i=0;i<6;i++){
						int r= arr[i]/brr[i];
					}
				}
				catch(ArithmeticException e){
					System.out.println("ArithmeticException caught :"+e.getMessage());
				}
				catch(ArrayIndexOutOfBoundsException e){
					System.out.println("ArrayIndexOutOfBoundsException caught :"+e.getMessage());
				}
				s.close();
		}
}
					