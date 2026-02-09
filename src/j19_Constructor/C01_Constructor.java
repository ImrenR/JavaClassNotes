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

    /*
        1- consturctor ismi Calss name ile aynı olmalı.Cons. name Buyuk harf ile başlamalı
        2- constructor create edilirkene name den sonra () {} mutlaka kullanılmalı.
        3- ONEMLI => eger p'li cons. create edilirse java default cons.(p'siz) ezer(siler)
        4- cons. return type olmaz method'dan ayıran en temel  özelliğidir.
        5- Class tanımlandığında java default(p'siz) cons. kendi create eder.
        6- Fields-> obj'nin uretilirken alacagı değer instance variables
        7- bir class'da bir den çok cons. tanımlanabilir.
         */

    // fields-> obj variable => obj değerlerin aldıgı alan özellikler

     String str; // Class level initlaize edilmemis instance(obj) variable create edildi.
    String selam= "Hello"; // initialize edilmis instance(obj) variable create edildi.
   // C01_Constructor obj = new C01_Constructor(); // psiz default const Class levela obj create edildi
    // istedigim yere const yerlestirebilirim.
    // bu const calistirdigimizda error aliriz, atamadigin degeri nasil alicaz demek isrtiyor errorla


    public static void main(String[] args) {//main level


        String maindekiVariable = "mainden selam";

        C01_Constructor obj1 = new C01_Constructor();// psiz default const ile main level a obj create edildi
        C01_Constructor obj2 = new C01_Constructor();// psiz default const ile main level a obj create edildi
        C01_Constructor obj3 = new C01_Constructor();// psiz default const ile main level a obj create edildi
        C01_Constructor obj4 = new C01_Constructor();// psiz default const ile main level a obj create edildi

        obj1.str ="javasu";
        obj1.selam="javaSu selam";

        obj2.selam="JavaTar";
        obj3.selam="JaviDan";

       // selam => instance variable static olmadigi icin maine call edilemez. Fieldta yer aliyor selam
       // maindekiVariable => ama maimdeki inst var acgirabilirsin.


        System.out.println("obj1.selam = " + obj1.selam); //  javasu selam
        System.out.println("obj2.selam = " + obj2.selam);// JavaTar
        System.out.println("obj2.selam = " + obj3.selam); //  Javidan
        System.out.println("obj2.selam = " + obj4.selam); //hello

        System.out.println("obj1.str = " + obj1.str); // javasu
        System.out.println("obj1.str = " + obj2.str); //null
        System.out.println("obj1.str = " + obj3.str);// null

   obj1.nonStaticMethod(); // burada ise nonstatic obj ile call edilir.
        staticMethod();
      //  nonStaticMethod();=> cte verir cunku  method sadece kendi localinde digrudan call edilir
    }//main sonu
 //   maindekiVariable=> locali disinda call edilemez

    public static void staticMethod(){
        System.out.println("static method ");
    }

    public void nonStaticMethod(){
        System.out.println("non-static method ");
    }

}//Class sonu
