package j102_OCA.Q086;

class A {
    public A() {
        System.out.println("A constructor");
    }

    public void test() {

        System.out.println("A ");
    }
}
class B extends A {
    public B() {
        System.out.println("B constructor");
    }
    public void test(){
        System.out.println("B ");
    }
}
class C extends A {
    public C() {
        System.out.println("C constructor");
    }
    public void test(){
        System.out.println("C ");
    }
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();

        A ab=new B();
        A ac=new C();

        // B bc=new C(); Compile time
        //B ba= (A) new A();Compile time
        //B ba= (B) new A();Compile time
        a.test();
        a=(A)b;  //Upcasting
        a=(B)b;
        a.test();

        b=(B)a;
        b.test();







    }
}
    /*
    What is the result?
    A. AB
    B. AC
    C. CC
    D. A ClassCastException is thrown only at line n1.
    E. A ClassCastException is thrown only at line n2.
    Answer: D

     */
