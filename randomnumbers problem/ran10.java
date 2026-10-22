import java.util.Random;
public class ran10{
        public static void main(String[] args){
			Random r= new Random();
			int [] f= new int[13];
			int s=0;
			for(int i=0;i<100;i++){
				int d1= r.nextInt(1,7);
				int d2=r.nextInt(1,7);
				s= d1+d2;
				f[s]++;
			}
			for(int i=2;i<13;i++){
				System.out.println("Sum :"+i+" Frequency: "+f[i]);
			}
	}
}