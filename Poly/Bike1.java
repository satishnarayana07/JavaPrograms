package Poly;
public class Bike1 {
	
	void run() { 
		System.out.println("bike is running");
	}
}

class Splendor extends Bike1{
	
	void run() {
		
		System.out.println("safely reached with speed 60km");
	}

	public static void main(String[] args) {
		
		Bike1 b1=new Splendor(); //Upcasting.
		b1.run();
		

	}

}
