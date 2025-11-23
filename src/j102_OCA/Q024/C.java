package j102_OCA.Q024;

class A{
	public A() {
		System.out.print("A ");
	}
	public A(int x) {
		System.out.print("A parametreli ");
	}
}
class B extends A{
	public B() {
		super(4);
		System.out.print("B ");
	}
}
class C extends B{
	public C() {
		super();

		System.out.print("C");
	}
	public static void main(String[] args) {
		C c = new C();
	}
}

//What is the result?
//A.	C B A
//B.	C
//C.	A B C
//D.	Compilation fails at line n1 and line n2


