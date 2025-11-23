package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Task-> Girilen hafta, gün sayısına karşılık gelen gün adını print eden code create ediniz.
        // 1.gün Pazartesi olsun

        Scanner input = new Scanner(System.in);
        System.out.println("Sayiyi giriniz:");
        int gunSayisi = input.nextInt();

        switch (gunSayisi) {
            case 1:
                System.out.println("Pazartesi");
                break;

            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Geçersiz gün numarası! Lütfen 1-7 arası giriniz.");
        }
    }
}