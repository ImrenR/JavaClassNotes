package j102_OCA.Q026;

public class FieldInit {
	static String x;// static variable class
	Character c;//instance// obje ye ait
	boolean b;
	float f;
	void printAll() {
		System.out.println("c = " + c);
		System.out.println("b = " + b);
		System.out.println("f = " + f);
	}
	public static void main(String[] args) {
		FieldInit f = new FieldInit();
		//f.printAll();
		System.out.println("f.b = " + f.b);
		System.out.println("f.c = " + f.c);
		System.out.println("f.f = " + f.f);


	}
}
//What is the result? 
//A. c=null b=true f=0.0 
//B. c= b=false f=0.0 
//C. c=null b=false f=0.0 
//D. c=0 b=false f=0.0F





// C