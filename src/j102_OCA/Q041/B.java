package j102_OCA.Q041;

public class B extends A {
    public B() {
        super();
        System.out.println("B'nın Constructor");
    }

    void m1() {
        System.out.println("One");
    }

    void m2() {
        System.out.println("Two");
    }
    void m4(){
        System.out.println("B'ye özel method");
    }
@Override
    void m3() {
        System.out.println("B'den gelen method");
    }
}
