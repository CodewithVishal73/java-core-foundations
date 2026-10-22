import java.util.Random;
public class randomWalk{
	public static void main(String [] args){
			Random r= new Random();
			String[] pos= {"up","down","left","right"};
			int x=0,y=0;
			for(int i=1;i<=100;i++){
				int ind= r.nextInt(4);
				if(pos[ind]=="up"){
					y++;
				}
				else if(pos[ind]=="down"){
					y--;
				}
				else if(pos[ind]=="right"){
					x++; 
				}
				else{
					x--;
				}
			}
			System.out.println("position after hundred steps :"+x+","+y);
	}
}