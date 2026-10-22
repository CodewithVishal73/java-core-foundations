import java.util.Scanner;
class Box{
	 private double length, width, height;
	 public Box(double s){
		this.length=this.width=this.height=s;
	 }
	 public Box(double l,double w,double h){
		this.length=l;
		this.width=w;
		this.height=h;
	 }
	 public Box(){
		this.length=this.width=this.height=1;
	 }
	 public double volume(){
		return length*width*height;
	 }
	 void display(){
		System.out.println("volume : "+volume());
	 }
}

public class Boxover{
		public static void main(String [] args){
		           Box cube= new Box(5);
			   Box cuboid= new Box(5,6,7);
			   Box def= new Box();
			   cube.display();
			   cuboid.display();
			   def.display();
		}
}