package j102_OCA.Q021;

class Vehicle {
	String vehicle="vehicle";//parent classs ait


	Vehicle()
	{
		System.out.println("Vehicle constructor");
	}
}
class Bus extends Vehicle{
	String bus="bus";//child
	String vehicle="vehicle bus";
	Bus(int a){
		System.out.println("Bus parametreli construc");
	}

	Bus(){
		super();	// constructor çağıma işlemi parantez vars "Vehicle constructor"
		System.out.println("this.bus = " + this.bus);//bus
		System.out.println("this.vehicle = " + this.vehicle);//vehicle bus
		System.out.println("super.vehicle = " + super.vehicle);//vehicle

	}
}
public class Transport {
	public static void main(String[] args) {

		Vehicle v = new Bus();


	}
}
//What is the result?
//A.	Vehicle 
//		Bus
//B.	Bus
//		Vehicle
//C.	Bus
//D.	The program doesn’t print anything
