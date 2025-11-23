package j02_DataTypes_WrapperClass;

public class C03_Concatenation {// Class level

    /*
     Not: char variable'lari matematiksel islemlerde   ASCII degerleri kullanir.
          Ornegin; System.out.println('A' + 'C'); console AC yerine 132 print eder.
     Note: Java'da "+" sembolunun
             i)Toplama islemi
             ii)Birlestirme Islemi(Concatenation)
           Java "+" sembolu  once toplama yapmaya calisir, yapamazsa birlestirme islemi yapılır aksi halde CTE verir.
  */
    public static void main(String[] args) {        String ad = "Furkan ";
        String soyad = "Ekinci";
        /*
        Birden çok string variable ile farklı data btype variable'lar + ile işlem alınırsa
        java toplama değil birleştirme(Concatenation) yapar.
        Trick-> javada String güçlü bir Class'dır.Bir + işlemi için String varsa işlem önceleğine göre
        (mürekkep) concatenation(birleştirme) yapar.
         */
        System.out.println(ad + soyad);//Furkan Ekinci
        int a = 17;
        int b = 61;
        System.out.println(ad + soyad + a + b);//Furkan Ekinci1761
        System.out.println(a + ad + soyad + b);//17Furkan Ekinci61
        System.out.println(a + b + ad + soyad);//78Furkan Ekinci
        System.out.println(a + b);//78
        System.out.println(" " + a + b);// 1761
        System.out.println(ad + soyad + (a + b));//Furkan Ekinci78
        System.out.println((a + b) + ad + soyad);//78Furkan Ekinci
        System.out.println(ad + (a - b) + (a + b));//Furkan-4478
        System.out.println(ad + ((a - b) + (a + b)));//Furkan34

        char ch = '1';//1 ascii:49
        System.out.println(ad + ch);//Furkan 1
        System.out.println(a + ch + ad);//66Furkan
        System.out.println(ad + (ch + b));//Furkan 110
        System.out.println(a + ad + ch);//17Furkan 1
/*
hanimiş trick -> char data type işleme alındığında variable type'ne göre farklı çıktı verir
yani cahr int ile ascci değer  toplama String ile  concat edilir.
 */
    }
}//Class sonu
