package j16_PassByValue;

public class C05_PassByValue {
    public static void main(String[] args) {
          /*
        eger bir method'a yapılan değişiklik kalıcı olsun istenirse  2 .değişklik  yapılan variable'lara atama tanımlanır.
         */
        double etiketFiyat= 100; // primitive main level(scope) initial edilmis local variable
        double indirimOrani= 0.1; // primitive main level(scope) initial edilmis local variable

        System.out.println("Indirim oncesi EtiketFiyat = " + etiketFiyat); // 100
        System.out.println("indirim(etiketFiyat,indirimOrani) = " + indirim(etiketFiyat, indirimOrani)); // 90
        System.out.println("Indirim sonrasi etiketFiyat = " + etiketFiyat); // 100
    }

    static public double indirim(double fiyat,double oran){
       return fiyat *= (1-oran); // burada yukardaki variablelarla alakali bir atama yok o yuzden son tahlilde etiketFiayti degismez

    }

 }
