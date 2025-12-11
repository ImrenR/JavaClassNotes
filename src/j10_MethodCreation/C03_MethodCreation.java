package j10_MethodCreation;


import static j10_MethodCreation.C03_MethodDepo.gecmeNotu;

public class C03_MethodCreation {//Class level  ->Benim koyum

    public static void main(String[] args) {//main level

        String imren= "JavaCan";
        String haluk = "Hoca";
        selamVer();
        System.out.println("imren = " + imren);
        System.out.println("haluk = " + haluk);
        C03_MethodDepo.gecmeNotu(67);// Class name ile komsu koyden method call edildi.
        gecmeNotu(89);
    }

    private static void selamVer() {
        System.out.println("Her sey harika oluyor cok mutluyum :)");
    }
// gecmeNotu(93); // CTE -> main disina meth call edilemez
}//Clas sonu
