package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task15_UcusProject01 {

    /*
    A şehrinden uçmak isteyen bir yolcu
    B şehrine 500km
     C şehrine  700km
      D şehrine  900 km mesafededir.

    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyata %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bir app create ediniz
     */
    static Scanner sc = new Scanner(System.in);//güneşimiz tüm gezegenler için ortak erişimde

    public static void main(String[] args) {

int secim;



do{
    System.out.println("Nereye gitmek isteidginizi seciniz : ");
    System.out.println("A sehrinden B sehrine gitmek itiyorsanz : 1");
    System.out.println("A sehrinden C sehrine gitmek itiyorsanz : 2");
    System.out.println("A sehrinden D sehrine gitmek itiyorsanz : 3");
    System.out.println("Cikis icin : 0");

    secim= sc.nextInt();

    switch (secim) {

        case 1:


            totalfiyat(500);
            break;
        case 2 :

            totalfiyat(700);
            break;
        case 3:
            totalfiyat(900);
            break;
        case 0:
            System.out.println("Programdan cikiliyor...");
            break;
        default:
            System.out.println("Yanlis bir islem yaptiniz");
            break;
    }

}while (secim !=0);
    }

    private static void totalfiyat(double km) {
        double birimFiyat = km *0.10;
        double toplamFiyat = km*birimFiyat;

        System.out.println("yasinizi giriniz");
        int yas= sc.nextInt();

        if (yas > 0 && yas < 12) {
            toplamFiyat *= 0.5;   // %50 indirim
        } else if (yas >= 12 && yas <= 24) {
            toplamFiyat *= 0.9;   // %10 indirim
        } else if (yas >= 65) {
            toplamFiyat *= 0.7;   // %30 indirim
        }


        System.out.println("Birim gidis-donuc mu ?(1-Evet -2-Hayir)");
        int yon = sc.nextInt();

        if(yon==1){
            toplamFiyat *=0.8;
        }

        System.out.println("toplamFiyat = " + toplamFiyat);
    }


}

