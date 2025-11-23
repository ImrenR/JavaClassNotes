package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Task-> Girilen güne  göre 100 gün sonraki hangi günü print eden code create ediniz.
        //  hafta başlangıcı:pazartesi alınız
// Cozum::
        /*
        Hafta 7 gun oldugu icin 100 gun sonrasi mod 7 ile bulunur.
        100 gun sonrasi = (gun + 100 ) % 7

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Bir gun giriniz:");
        String gun = input.nextLine();
int gunNum= 0;
switch (gun){
    case "pazartesi":
        gunNum =1;
        break;
    case "salı": gunNum = 2; break;
    case "çarşamba": gunNum = 3; break;
    case "perşembe": gunNum = 4; break;
    case "cuma": gunNum = 5; break;
    case "cumartesi": gunNum = 6; break;
    case "pazar": gunNum = 7; break;
    default:
        System.out.println("Geçersiz gün girdiniz!");
        System.exit(0);
}
int gunSonra = (gunNum + 100) % 7;
if (gunSonra == 0 ) gunSonra = 7;

        switch (gunSonra) {
            case 1:
                System.out.println("100 gün sonra: Pazartesi");
                break;
            case 2:
                System.out.println("100 gün sonra: Salı");
                break;
            case 3: System.out.println("100 gün sonra: Çarşamba"); break;
            case 4: System.out.println("100 gün sonra: Perşembe"); break;
            case 5: System.out.println("100 gün sonra: Cuma"); break;
            case 6: System.out.println("100 gün sonra: Cumartesi"); break;
            case 7: System.out.println("100 gün sonra: Pazar"); break;
        }
    }
}

