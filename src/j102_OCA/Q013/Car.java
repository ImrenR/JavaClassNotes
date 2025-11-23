package j102_OCA.Q013;

class Vehicle{
	int x;

	@Override
	public String toString() {
		return "Vehicle{" +
				"x=" + x +
				'}';
	}

	Vehicle(){


		System.out.println("Süper constructor parametresiz");// line n1
	}
	Vehicle(int x){
		System.out.println("Süper constructor parametreli");

		this.x= x;
	}
}
 class Car extends Vehicle{
	int y;
	Car(){

		super(10);
		System.out.println("Parametresiz child");// line n2
	}
	Car(int y){

		super();
		this.y =y;
		System.out.println("Parametreli child");
	}
	public String toString() {
		return super.x + ":" + this.y;

	}
	// And given the code fragment
	 // Vehicle y = new Car(20);  // in another version 20 is deleted ==> 10:0
	//		System.out.println(y);
	 public static void main(String[] args) {
		Vehicle y = new Car (20);  // in another version 20 is deleted ==> 10:0
		System.out.println(y);
	}}
 
// What is the result?
//		 A.	Compilation fails at line n2.
//		 B.	Compilation fails at line n1.
//		 C.	20:20
//		 D.	10:20

