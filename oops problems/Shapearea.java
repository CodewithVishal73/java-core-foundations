
class shape{
	void area(){
  		System.out.println("calculating area of shape");
	}
}
class Circle extends shape{
		float r;
		Circle(float radius){
			r= radius;
		}
		@Override()
		void area(){
			double Area= 3.14*r*r;
			System.out.println("area of circle : "+Area);
		} 
}
class Rectangle extends shape{
		float l,b;
		Rectangle(float length,float breadth){
			 l=length;
			 b=breadth;
		}
		@Override
		void area(){
			double Area= l*b;
			System.out.println("area of rectangle : "+Area);
		}
}
class Triangle extends shape{
		float height,base;
		Triangle(float Base,float Height){
			 base= Base;
			 height=Height;
		}
		@Override
		void area(){
			double Area= 0.5*base*height;
			System.out.println("area of triangle : "+Area);
		}
}
public class Shapearea{
		public static void main(String [] args){
			   shape s;
       			   s = new Circle(5);
        		   s.area();
       			   s = new Rectangle(4, 6);
        		   s.area(); 
        		   s = new Triangle(3, 4);
       			   s.area();  
		}
}