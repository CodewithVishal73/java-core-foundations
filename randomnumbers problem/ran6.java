import java.util.Random;
public class ran6{
        public static void main(String[] args){
			Random r= new Random();
			char c= (char)(r.nextInt(26) + 'A');
			System.out.println("random Uppercase character :"+c);
	}
}