import java.util.Random;
public class ran3{
        public static void main(String[] args){
			Random r= new Random();
			System.out.println("10 random odd integers:-");
			for(int i=0;i<10;i++){
				int num1= r.nextInt(1,100) | 1;
				System.out.println(num1);
			}
			System.out.println("10 random even integers:-");
			for(int i=0;i<10;i++){
				int num2= r.nextInt(1,100) & -2;
				System.out.println(num2);
			}
	}
}