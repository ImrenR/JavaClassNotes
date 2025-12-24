package j19_Constructor;

import j01_Variables.C01_HelloWord;

public class C01_Constructor {//Class level
    /*
    N e D e N  --> OOP <--  k U l L a N ı L ı R...
     Nesne Yönelimli Programlamanın(oop) Faydaları
     1- Obj oluşturma bir Class içerisinde toplanır ve tüm projelerde kullanılabilirliğe imkan sağlar.
     2- Class'ların 1 kez oluşturulması sayesinde uzun kodları tekrardan yazmak yerine kısa kodlamalar ile çalıştırılabilir.
     3- Uzun kodların tekrar yazılmasının engellenmesi sayesinde geliştirme süreci kısalır.
     4- Object'ler birbirinden bağımsız olduğundan data güvenliği konusunda avantaj sağlar.
     5- Class'lar sayesinde tüm projelerde değişiklik yapmak yerine tek bir Class'da değişiklik yapılıp tüm projelerde çalışması sağlanır.
    Bu zaman kaybını büyük ölçüde azaltır.
     */
    // fields-> obj variable => obj değerlerin aldıgı alan özellikler

    /*
        1- consturctor ismi Calss name ile aynı olmalı.Cons. name Buyuk harf ile başlamalı
        2- constructor create edilirkene name den sonra () {} mutlaka kullanılmalı.
        3- ONEMLI => eger p'li cons. create edilirse java default cons.(p'siz) ezer(siler)
        4- cons. return type olmaz method'dan ayıran en temel  özelliğidir.
        5- Class tanımlandığında java default(p'siz) cons. kendi create eder.
        6- Fields-> obj'nin uretilirken alacagı değer instance variables
        7- bir class'da bir den çok cons. tanımlanabilir.
         */

    String str; // deger atanmamis instance (obj) create edildi.
    String selam="selam javaCan imren"; // initilaze edilmis variable create edildi.
   // C01_Constructor obj =new C01_Constructor(); // parametresiz default constructer ile obj create ettim class levela.


    public static void main(String[] args) {//main level

String maindekiVariable = "main Javanazdan selam";
        C01_Constructor obj1 =new C01_Constructor(); // psiz default const ile main lvela obj create edildi.
        C01_Constructor obj2 =new C01_Constructor(); // psiz default const ile main lvela obj create edildi.
        C01_Constructor obj3 =new C01_Constructor(); // psiz default const ile main lvela obj create edildi.
        C01_Constructor obj4 =new C01_Constructor(); // psiz default const ile main lvela obj create edildi.

        obj1.str="javaNur"; // deger atadim
        obj1.selam="JavaSu"; // selam i degistirdim

        obj2.selam ="JavaTar";
        obj3.selam ="java";
        //selam => instance variable static olmadigi icin maine call edilemez..
        System.out.println("maindekiVariable = " + maindekiVariable); // bunu cagirabilirim cunku mainde create edildi.

        System.out.println("obj1.selam = " + obj1.selam); // JavaSu
        System.out.println("obj2.selam = " + obj2.selam); //JavaTar
        System.out.println("obj3.selam = " + obj3.selam); //  java
        System.out.println("obj4.selam = " + obj4.selam);//  selam javaCan imren

        System.out.println("obj1.str = " + obj1.str); //  javaNur
        System.out.println("obj2.str = " + obj2.str); // = null
        System.out.println("obj3.str = " + obj3.str); //= null

        obj1.nonStaticMethod(); // nonStatic method obje ile call edilir.
        staticMethod();  // static meth static blok olan main ile dogrudan call edilir.
      //  nonStaticMethod(); // CTE nonStatic method sadece kendi localine dogrudan call edilir.
    }//main sonu

public static void  staticMethod(){ // psiz static (Gunes) => her gezegene erisim sunan method
    System.out.println("Agana staticMethod tan selam");
}

    public void  nonStaticMethod(){ // p.siz non static => sadece localinde erisilebilen method
        System.out.println("Agana nonstaticMethod tan selam");
    }

}//Class sonu
