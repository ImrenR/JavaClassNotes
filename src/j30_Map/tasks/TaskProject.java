package j30_Map.tasks;

import java.util.HashMap;
import java.util.Scanner;

public class TaskProject {
    static HashMap<String, String> kisi = new HashMap<>();
    static Scanner input = new Scanner(System.in);
	              /* Task->
                     Girilen tc kimlik numarasini(4 haneli), tam isim(ad-soyad), adres, telefon bilgilerini

                     tc ile diğer bilgileri depolayan kayıt();
                     tc ile diğer bilgileri okutan goster();
                     tc ile diğer bilgileri silen  sil();

                     methodları create edip kullanıcı sonlandırana kadar tercihli run eden pr yazınız.
               */

    public static void main(String[] args) {
        secim();

    }

    private static void secim() {
        System.out.println("Agam\n cıkıs - > 0 \n kayıt - > 1 \n göster - > 2 \n sil - > 3 \n seçiniz    ");

        switch (input.nextInt()) {

            case 0:
                cıkıs();
                break;

            case 1:
                kayıt();
                break;
            case 2:
                göster();
                break;
            case 3:
                sil();
                break;
            default:
                System.out.println("hatalı giriş yaptınız tekrar deneyiniz ");
                secim();

        }
    }

    private static void sil() {
        System.out.print("agam 4 haneli tc giresen : ");
        String silinecekTC = input.next();
        if (kisi.containsKey(silinecekTC)) {//kisi mep'de tc varsa
            System.out.println("aradıgınız silinecek kisi  : " + kisi.remove(silinecekTC));
            secim();

        } else System.out.println("aradınız tc kayıtlarda yok ");
        sil();
    }


    private static void göster() {
        System.out.print("agam 4 haneli tc giresen : ");
        String gösrterilecekTC = input.next();
        if (kisi.containsKey(gösrterilecekTC)) {//kisi mep'de tc varsa
            System.out.println("aradıgınız kisi : " + kisi.get(gösrterilecekTC));
            secim();

        } else System.out.println("aradınız tc kayıtlarda yok ");
        göster();
    }

    private static void kayıt() {

        System.out.print("agam 4 haneli tc giresen : ");
        String tc = input.next();
        if (kisi.containsKey(tc)) {//kisi mep'de tc varsa 

            System.out.println("agam var olan tc kaydı yapıyorsunuz :( ");
            kayıt();
        } else {
            System.out.println("Agam adını giresen :");

            System.out.println("Agam soyadını giresen :");

            System.out.println("Agam tel No giresen :");

            System.out.println("Agam adres giresen :");

            kisi.put(tc, (input.next() + " " + input.next() + " " + input.next() + " " + input.next()));
            System.out.println("tc girisiniz yapılmıstır \n   ***    ");
            secim();
        }

    }

    private static void cıkıs() {
        System.out.println("cıksınız yapılmıştır selametle ...");
    }
}
