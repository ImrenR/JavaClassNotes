package j10_MethodCreation.Tasks;


import java.sql.SQLOutput;
import java.util.Scanner;


public class Task16_KelimeOyunu01 {

    static  Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        /* Iki kisinin oynayacagi bir kelime oyunu uretelim
         * Kurallar
         * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
         *
         * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
         *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
         *        ve 3.adima gecin
         *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
         *        kazandigini yazip oyunu bitirin
         *
         * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
         *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
         *          basa mi sona mi ekleyecegini sorun
         *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
         *
         *      *   Devam etmek istemezse
         *          "Oyun bitti" yazin
         *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
         */
        String kelime;
        int puan1 = 0;
        int puan2 = 0;
        boolean oyunDevam = true;

        System.out.println("1. oyuncu kelimeyi gir :");
         kelime = input.nextLine();

         boolean oyuncu1Sirada = true;

        while (oyunDevam) {
            System.out.println("kelime = " + kelime);
            System.out.println("2.oyuncu kabul ediyor musun ? (E/H)");
          String  kabul = input.next();
            if(kabul.equalsIgnoreCase("E")){
                System.out.println("2. oyuncu kelimeyi kabul etti");
            }else System.out.println("Kabul edilmedi");


            if(oyuncu1Sirada) {
                System.out.println("1. oyuncu kazandi!");
            }else System.out.println("2.oyuncu kazandi");
            break;
        }

if(oyuncu1Sirada){
    puan1+=kelime.length();
}else {
    puan2 += kelime.length();
}
        System.out.print("Oyuna devam etmek istiyor musunuz? (E/H): ");
        String devam = input.nextLine();

        if (!devam.equalsIgnoreCase("E")) {
            System.out.println("Oyun bitti!");
           
        }

    }
}
