package j09_Break_Continue;

import java.util.Scanner;

public class C04_PinControl {
    public static void main(String[] args) {
        // Task -> Girilen String data type bir
        // pin datasının 3 giriş hakkında kontrol eden code create ediniz.

       String dogruPin= "12345";
       int girisHakki= 3;

       Scanner input= new Scanner(System.in);

       while (girisHakki>0) {
           System.out.println("Bir pin kodu giriniz : ");
           String pin = input.nextLine();
            if(pin.equals(dogruPin)) {
                System.out.println("Giris basarili");
                break;
            }else {
                girisHakki--;
                System.out.println("Yanlis pin, kalan hak" + girisHakki + "tekrar deneyiniz");

            }
       }

       if(girisHakki==0){
           System.out.println("Kartiniz bloke edildi");
       }
    }
}
