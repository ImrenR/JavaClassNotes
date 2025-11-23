package j102_OCA.Q041;

public class C extends B{
    void m1() {
        System.out.println("C m1 ");
    }

    void m2() {
        System.out.println("C two");
    }
    void m4(){
        System.out.println("C'ye özel method");
    }
    @Override
    void m3() {
        System.out.println("C'den gelen method");
    }

    void m5() {
        System.out.println("Overiide edilmemiş" );
    }
}
