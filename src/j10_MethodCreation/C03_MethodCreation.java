package j10_MethodCreation;


import static j10_MethodCreation.C03_MethodDepo.gecmeNotu;

public class C03_MethodCreation {//Class level  ->Benim koyum

    public static void main(String[] args) {//main level

String imren="en hakiki JavaCan";
String haluk = "lololooo";
selamVer();// kendi koyumden method call edildi.
        System.out.println(imren);
        System.out.println(haluk);
gecmeNotu(96);
gecmeNotu(95); // farkli class meth. class name olmadan import edilir
        // C03 methodDepodaki staticOlmayanMethodu cagiramazsin, farkli classlar ve static degildir.
     // => veeee ayni classta olsa bile static olmayan metod cagiralamaz.
    }//main sonu

    private static void selamVer() {

        System.out.println("Helloooo there !");

    }
    public void staticOlmayanMeth2(){
        System.out.println("static yok  alamazsin bu sayfadan disariya") ;
    }

}//Clas sonu
