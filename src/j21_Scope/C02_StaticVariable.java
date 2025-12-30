package j21_Scope;

public class C02_StaticVariable {//Class level

    static String firmaIsim="Clarusway";// initalized edilmis static variable
    static int firmaId;// non initialized static var
    static boolean firmaIT; // non initiliazed static var

    public static void main(String[] args) {//main level
            /*  instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
        ogrenci notlari veya ogretmen branslari gibi bir objeye ait bir variable'in son degerini
         bulmak icin sadece o objeyi dikkate alınır

       Static variabler ise class variable olarak tanimlanir
       ve değeri tum class uyeleri icin sabittir. Okul ismi, okul mudurunun adi gibi
       eger static variable'in degeri degistirilirse herkes icin degisir.-> güneş misali

     */

        System.out.println("firmaId = " + firmaId);//0 default deger gelir cunku atamna yok
        System.out.println("firmaIsim = " + firmaIsim) ;
        System.out.println("firmaIT = " + firmaIT); //false
        firmaIT=true;
        System.out.println("firmaIT = " + firmaIT);//true
        // bad practice
        C02_StaticVariable.firmaId=2023; // Class name ile statii variablee call =>BAD PRACTICE
static_method(); // staci meth dogrudan static bloka (maine) dogrudan call edildi.

    }//main sonu
    public static  void static_method(){ // galaksi-statik mehthof
        System.out.println("update oncesi firmaId = " + firmaId);
        firmaId= 2025;
        System.out.println("update sonrasi firmaId = " + firmaId);
        System.out.println("Agama static-methodtan selamlar");
    }

    public void non_static_method(){ // non-static
        System.out.println("Atama oncesi static firmaIsim = " + firmaIsim);
        firmaIsim="IBM";
        System.out.println("Atama sonrasi static firmaIsim = " + firmaIsim);
        System.out.println("Agama non-static-methodtan selamlar");
        static_method(); // static method non-static blok a dogrudan call edilir.
    }

}//Class sonu
