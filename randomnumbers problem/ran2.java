import java.util.Random;
public class ran2{
        public static void main(String[] args){
			Random r= new Random();
			int num1= r.nextInt(1000) | 1;
			System.out.println("ODD intger:"+num1);
			int num2= r.nextInt(1000) & -2;
			System.out.println("EVEN intger:"+num2);
	}
}