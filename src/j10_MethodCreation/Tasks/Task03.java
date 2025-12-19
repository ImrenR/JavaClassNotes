package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task03 {


    static Scanner input = new Scanner(System.in);//herkeşler erişsin(Güneş gibin) diye method üstü class level'a tanımlandı

    public static void main(String[] args) {
        //task-> girilen Saati saniyeye mil'i km'ye kg'yi gr'a çeviren METHOD create ediniz.






        cevir();

    }

    private static void cevir() {
        System.out.println("Bir saat girinz");
        int saat = input.nextInt();
        int saniye = saat*3600;
        System.out.println("saniye : " + saniye);


        System.out.println("Bir mil giriniz:");
        double mil = input.nextDouble();
        double km = mil* 1.6;
        System.out.println("Km =" + km);

        System.out.println("bir kg giriniz");
        int kg = input.nextInt();
        int gram =kg*1000;
        System.out.println("Gram =" + gram);

    }
}// Class sonu
