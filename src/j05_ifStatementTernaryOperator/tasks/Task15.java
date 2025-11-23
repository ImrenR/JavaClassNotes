package j05_ifStatementTernaryOperator.tasks;

import java.beans.EventHandler;
import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        /*
          TASK -> Kullanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını veriniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz
         */
        Scanner input = new Scanner(System.in);

        System.out.println("agam ehliyetin var ise 1 yoğğğ ise 0 giresen : ");

        // char ehliyet = input.nextLine().charAt(0);
        // System.out.println("ehliyet = " + ehliyet);
        int ehliyetVarlıgı = input.nextInt();
        // System.out.println("agam tecrube yılını giresen : ");
        // int tecrubeYil = input.nextInt();
      //  System.out.println("agam km giresen : ");
      //  int km = input.nextInt();
        if (ehliyetVarlıgı == 1) {// ehliyet var olma şartı
            System.out.println("agam tecrube yılını giresen : ");
            int tecrubeYil = input.nextInt();
            if (tecrubeYil >= 7) {// ehliyeti olan en az  7 yıllık  tecrube kontrolu
                System.out.println("agam km giresen : ");
                int km = input.nextInt();
                if (km >= 100000) {// ehliyeti olan tecrubesi enaz 7 yıl olup km enaz 100000 olma sartı
                    System.out.println("AGAM kontak kayırlı olsun tekerine DAŞŞŞ deymesin :) ");
                } else {//enaz 100000 km olmama sartı

                    System.out.println("Agam  kontak alman için  " + (100000 - km) + " daha km yapman  lazım ");
                }
            } else {//en az   7 yıl tecrube olmama sartı
                System.out.println("Agam  kontak alman için  " + (7 - tecrubeYil) + " daha yıla ihtiyacın var ");
            }

        } else if (ehliyetVarlıgı == 0) {// ehliyet var olmama sartı

            System.out.println("AGAM ehliyet olamayan adama kontak verilir .. Alırım alırım anahtarını MAYK....");

        } else {
            System.out.println("agam gelmim adam gibin bi şey giresen :( ");// ehliyet için ne var ne de yok giriş kontrolu
        }
    }
}





















