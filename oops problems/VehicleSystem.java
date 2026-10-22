
class vehicle{
	void start(){
		System.out.println("Vehicle is starting...");
	}
}
class car extends vehicle{
		void drive(){
			System.out.println("Driving car");
		}
}
class bike extends vehicle{
		void ride(){
			System.out.println("bike riding");
		}
}
public class VehicleSystem{
		public static void main(String [] args){
			 car c= new car();
			 c.start();
			 c.drive();
			 bike b= new bike();
			 b.start();
			 b.ride();
		}
}