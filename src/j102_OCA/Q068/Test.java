package j102_OCA.Q068;

import java.io.IOException;

public class Test {
	public static void main(String[] args) throws Exception {
		try {
			method1();
		} catch (MyException ne) {
			System.out.print("A");
		}
	}
	public static void method1() throws Exception{ // line n1
		try {
			throw 11 > 10 ? new MyException() : new IOException();
		} catch (MyException ie) {
			System.out.println("I");
		} catch (RuntimeException re) {
			System.out.print("B");
		}

	}
}

 //	What is the result?
 //		A. A
 //		B. AB
 //		C. A compile time error occurs at line n1.
 // 	D. B
 //		E. I









 // Answer: E


	//second way:

//	        try {
//	            method1();
//	        }
//	        catch(MyException ne){
//	            System.out.print("A");
//	        }
//	    }

//	    public static void method1(){ // line n1
//	        try {
//	            throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
	//
//	        } catch (RuntimeException re) {
//	            System.out.print("B");
//	        }
	//
//	    }
	//}

	// Answer: B
	//
	//
//	        third way:
//	         catch (RuntimeException re) {
//	            System.out.print("I");
//	        }
	//
//	    }
	//}
	// Answer: "I"
	

