import java.util.Random;
public class ran8{
        public static void main(String[] args){
			Random r= new Random();
			System.out.print("Lottery draw:");
			for(int i=0;i<6;i++){
				int num= r.nextInt(1,49);
				System.out.println(num);
			}
	}
}