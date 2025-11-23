package j102_OCA.Q145;

public class Q145 { //Class name is SumTest
//	    public static void doSum(Double x, Double y) {
//	        System.out.println("double sum is " + (x + y));
//	    }

//	    public static void doSum(double x, double y) {
//	        System.out.println("double sum is " + (x + y));
//	    }
//	public static void doSum(float x, float y) {
//		System.out.println("float sum is " + (x + y));
//	}
//	public static void doSum(int x, int y) {
//		System.out.println("int sum is " + (x + y));
//	}
	public static void doSum(byte x, byte y) {
		System.out.println("byte sum is " + (x + y));
	}


	    public static void main(String[] args) {  //once primitive cagrilir
	      doSum((byte) 10, (byte) 20);//en küçük int
	      //doSum(10.0f, 20.0f);
			//doSum((Integer.valueOf(20)),Integer.valueOf(10));

	    }}
/* What is the result?
A.	double sum is 30.0
	float sum is 30.0

B.	float sum is 30.0
	double sum is 30.0

C.	Integer sum is 30
	double sum is 30.0

D.	Integer sum is 30
	float sum is 30.0






 */
