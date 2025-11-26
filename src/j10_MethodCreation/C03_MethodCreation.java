package j10_MethodCreation;



public class C03_MethodCreation {//Class level->Benim koyum

    public static void main(String[] args) {//main level

        String imren="en guzel JavaCan";
        String haluk="backend developer";
        selamVer(); //kendi koyumun amele meth call edildi..
        System.out.println(imren);
        System.out.println(haluk);
        C03_MethodDepo.gecmeNotu(77); //ClassName ile komsu koyden meth call edildi...

    }//main sonu

    private static void selamVer() {//kendi koyumun amele metodu

        System.out.println("koyumun yagmurlarinda yikasinlar!");
    }


}//Clas sonu
