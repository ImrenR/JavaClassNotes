package j102_OCA.Q104;

//Base.java:
class Base {
    public void test() {
        System.out.println("Base ");
    }

    public void test2() {
        System.out.println("Base Test 2");
    }
}

// DerivedA.java:
class DerivedA extends Base {
    public void test() {
        System.out.println("DerivedA ");
    }
}
//DerivedB.java:
class DerivedB extends Base {
    public void test () {
        System.out.println("DerivedB ");
    }
    public static void main (String[] args) {
        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();
        Base b4 = b3; //new DerivedB();
        b1 =  (Base) b2; //new DerivedA();
        b1.test();
        b4.test();
        b1.test2();
        b2.test2();
    }

}
	/*
	 *What is the result?
A. BaseDerivedA
B. BaseDerivedB
C. DerivedBDerivedB
D. DerivedBDerivedA
E. A ClassCastException is thrown at runtime.

Answer:
	 */


////Answer: DerivedADerivedB



