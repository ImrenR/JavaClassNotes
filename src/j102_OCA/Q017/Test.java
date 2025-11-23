package j102_OCA.Q017;

public class Test {
	static int x, y;

	public Test(int x, int y) {
		initialize(x, y);
	}
	
	public void initialize(int x, int y) {
		Test.x = x * x;
	    Test.y = y * y;
	}
	
	public static void main(String[] args) {
	int x = 3, y =5;
	Test objTest = new Test(x, y);

	System.out.println(Test.x + " " + Test.y); // prints the local variables
	}
}
//What is the result?
//A.	Compilation fails.
//B.	3 5
//C.	0 0
//D.	9 25
