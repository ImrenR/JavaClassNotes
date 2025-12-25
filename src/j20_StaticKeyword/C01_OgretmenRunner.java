package j20_StaticKeyword;

import java.util.concurrent.Callable;

public class C01_OgretmenRunner {
    public static void main(String[] args) {

        C01_Ogretmen.okul ="Clarusway"; // Class name ile static variable call edildi.
        System.out.println("C01_Ogretmen.okul = " + C01_Ogretmen.okul);
// staticleri classname ile cagirirsin buna hakkin var.

        C01_Ogretmen ogrt1 = new C01_Ogretmen("imren",7);

        System.out.println("ogrt1 = " + ogrt1);
        System.out.println("ogrt1.tecrube = " + ogrt1.tecrube);
        //ogrt1.okul; => cte verdi => cunku obj ile gunes yani (static) class variable call edilemez.

        ogrt1.evlilikYDonumu(); // obj ile non static call edilebilir.

        ogrt1.maasHesapla(); // bad practice.

        C01_Ogretmen ogrt2 = new C01_Ogretmen("haluk",13);
        System.out.println("ogrt2 = " + ogrt2.name);
        System.out.println("ogrt2 = " + ogrt2);
        System.out.println("ogrt2.tecrube = " + ogrt2.tecrube);
    }

}

