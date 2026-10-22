import java.util.Scanner;
public class Player{
         private String name;
	 private int matches;
	 private long runs;
	 private float Average;
	
	 public Player(String name, int matches, long runs) {
        	this.name= name;
        	this.matches = matches;
        	this.runs = runs;
        	calculateAverage();
         }

	public String getname(){
		   return name;
	}
	public int getmatches(){
		   return matches;
	}
	public long getruns(){
		   return runs;
	}
	public float getAverage(){
		   return Average;
	}
	public void calculateAverage(){
		  this.Average = runs/matches;
	}
	
	public void display(){
		System.out.println("Player Name: "+name);
		System.out.println("Matches played: "+matches);
		System.out.println("Total Runs: "+runs);
		System.out.println("Average: "+Average);
		System.out.println("_____________________________________________________");
	}
	
	public static void main(String [] args){

			Scanner s= new  Scanner(System.in);
		        System.out.println("Enter number of Players: ");
			int n= s.nextInt();
			Player [] players= new Player[n];
			for(int i=0;i<n;i++){
				System.out.println("Enter Name: ");
				s.nextLine();
				String name= s.nextLine();
				System.out.println("Enter matches played: ");
				int matches= s.nextInt();
				System.out.println("Enter Runs: ");
				long runs= s.nextLong();
				players[i]= new Player(name, matches, runs);
			}
			float max=0;
			for(Player pl : players){
				if(pl.getAverage()>max){
				  	 max=pl.getAverage();
				}
			}
			System.out.println("Player with Highest Average :-");
			for(Player pl : players){
				if(pl.getAverage()==max){
				  	 pl.display();
				}
			}
			s.close();
	}
}