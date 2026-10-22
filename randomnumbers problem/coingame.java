import java.util.Random;
public class coingame{
	public static void main(String [] args){
			Random r= new Random();
			String[] choice= {"Head","Tail"};
			int h=0,t=0;
			for(int i=1;i<=10;i++){
				int ind= r.nextInt(2);
				if(choice[ind]=="Head"){
					System.out.println("Toss "+i+":"+choice[ind]);
					h++;
				}
				else{
					System.out.println("Toss "+i+":"+choice[ind]);
					t++;
				}
			}
			System.out.println("Total Heads count :"+h);
			System.out.println("Total Tails count :"+t);
	}
}