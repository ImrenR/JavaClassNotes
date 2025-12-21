package j16_PassByValue;

public class C04_PassByValue {//Class level

  static double etiketFiyat; // gunes variable herkes erisebilir
  static double indirimOrani;
// Herkksin kullanacagi birseyse en tepeye static olarak yazariz
  // => Class level static her gezegen(method) e erisimi olan initial (ilk deger atamasi)yapilmamis variable create edildi.






    public static void main(String[] args) {//main level

         /*
        eger bir method'a yapılan değişiklik kalıcı olsun istenirse
        1.değişiklik  yapılan variable'lar static (gökteki güneş) olarak tanımlanır.
         */
etiketFiyat =100;
indirimOrani =0.1;
        System.out.println("Indirim oncesi etiketFiyat = " + etiketFiyat); // 100.0
        indiirim(); // 90.00
        System.out.println("Indirim sonrasi etiketFiyat = " + etiketFiyat); // 90.0
    }//main sonu

public static void indiirim(){
        etiketFiyat *=(1-indirimOrani);
    System.out.println("indirilmis etiketFiyat = " + etiketFiyat); // 90
}



}//Class sonu
