package j10_MethodCreation;


import static j10_MethodCreation.C03_MethodDepo.gecmeNotu;

public class C03_MethodCreation {//Class level->Benim koyum

    public static void main(String[] args) {//main level

        String imren="en guzel JavaCan";
        String haluk="backend developer";
        selamVer(); //kendi koyumun amele meth call edildi..
        System.out.println(imren);
        System.out.println(haluk);
        C03_MethodDepo.gecmeNotu(77); //ClassName ile komsu koyden meth call edildi...
        gecmeNotu(93); // farkli classmethodu calss name olmadan import edilebilir.
        gecmeNotu(87); // import edildigi icin direkt geldi
    //C03_MethodDepo.staticOlmayanMeth1(); //CTE sstastic olmayan bir metodu buraya cagiramazsin
    }//main sonu

    private static void selamVer() {//kendi koyumun amele metodu

        System.out.println("koyumun yagmurlarinda yikasinlar!");
    }

//main disina meth call edilemez //gecmeNotu(93);
}//Clas sonu
