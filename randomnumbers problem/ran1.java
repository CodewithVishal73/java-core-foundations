import java.util.Random;
public class ran1{
        public static void main(String[] args){
			Random r= new Random();
			for(int i=0;i<10;i++){
				int num= r.nextInt(100);
				System.out.println("intger "+(i+1)+": "+num);
			}
	}
}