package j20_StaticKeyword;

import java.util.concurrent.Callable;

public class C01_OgretmenRunner {
    public static void main(String[] args) {

// C01_Ogretmen. nokta eklendiginde sadece statikler gelebilir class ile gelirler => kim bunlar => okul ve maasHesapla

    // digerleri yani static olmayanlar sadece obj ile gelirler


        C01_Ogretmen.okul = "Clarusway"; // Class name ile static var call edildi.
        // artik null degil de Clarusway dir cunku yukarda atama yapildi.
        // direkt okul yazarsan gelmez, ama import edeyim mi diye notification verir

        System.out.println("C01_Ogretmen.okul = " + C01_Ogretmen.okul); // Clarusway

        C01_Ogretmen ogrt1= new C01_Ogretmen("Imren",7);
         //       ogrt1. =? simdi burada object variablelar gelir yani instance variabler

        System.out.println("ogrt1 = " + ogrt1); // ogrt1 = C01_Ogretmen{isim='Imren', tecrube=7}
        System.out.println("ogrt1.tecrube = " + ogrt1.tecrube); // 7
        ogrt1.evlilikYilDonumu(); // yildonumu hesaplama

        C01_Ogretmen ogrt2= new C01_Ogretmen("Haluk",13);

        System.out.println("ogrt2 = " + ogrt2); // ogrt2 = C01_Ogretmen{isim='Haluk', tecrube=13}
        System.out.println("ogrt1.tecrube = " + ogrt1.isim); // ogrt1.tecrube = Imren
        System.out.println("ogrt2.tecrube = " + ogrt2.tecrube); // 13


    }

}

