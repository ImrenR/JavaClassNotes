package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task04AtmMethod {//amele köyü
    static int bakiye = 1000;// herkeşler erişsin diye gökteki güneş yapıldı
    static Scanner input = new Scanner(System.in);// herkeşler erişsin diye gökteki güneş yapıldı

    public static void anaMenu() {
        int secimSenin;
do {
    System.out.println("Yapmak istediginiz islemi seciniz =");
    System.out.println("1. Para cekimi ");
    System.out.println("2- Para yatirma");
    System.out.println("Cikis yapmak icin 0 a basiniz ");
   secimSenin=input.nextInt();

    switch (secimSenin) {
        case 1:
           paraCekimi();
            break;
        case 2:
           paraYatirma();
           break;
        case 0:
            System.out.println("Cikis islemi yapildi");
            break;
        default:
            System.out.println("GEcersiz bir islem yaptiniz");
    }
}while (secimSenin !=0);

    }

    private static void paraYatirma() {
        System.out.println("Yatirmak istediginiz parayi giriniz");
      int  yatirilanPara = input.nextInt();
        bakiye += yatirilanPara;
        System.out.println("Para yatirma isleminiz gerceklesmistir, total bakiyeniz " + bakiye);
    }

    private static void paraCekimi() {
        System.out.println("NE kadar para cekmek istiyorsunuz");
     int   cekilenPara = input.nextInt();
        if (bakiye > cekilenPara) {
            bakiye -= cekilenPara;
            System.out.println("Kalan bakiyeniz : " + bakiye);
        } else System.out.println("Bakiyeniz yetersizdir");
    }

}
