package j27_Interface.Tasks.Task06;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Food> orders = new ArrayList<>();

        boolean devam = true;

        while (devam) {
            System.out.println("\nMenuden bir urun seciniz : ");
            System.out.println("1- Adana Kebab");
            System.out.println("2- Lahmacun");
            System.out.println("3- Borsh");
            System.out.println("4- Palov");
            System.out.println("0- Tamam");

            int secim = input.nextInt();
            Food secilenYemek = null;

            switch (secim) {
                case 1:
                    secilenYemek = new AdanaKebab();
                    break;

                case 2:
                    secilenYemek = new Lahmacun();
                    break;

                case 3:
                    secilenYemek = new Borsh();
                    break;

                case 4:
                    secilenYemek = new Palov();
                    break;

                case 0:
                    devam = false;
                    System.out.println("Siparis alimi tamamlandi");
                    continue;// dongunun geri kala4nini atla

                default:
                    System.out.println("Hatali secim!");
                    continue;
            }

            // Seçilen yemeği siparişe ekle
            orders.add(secilenYemek);

            // Anında ücretini sor ve ekrana yazdır
            System.out.println(secilenYemek.getClass().getSimpleName() + " fiyatı: " + secilenYemek.ucret() + " TL");
        }

        // Toplam ücreti hesapla
        double total = 0;
        for (Food food : orders) {
            total += food.ucret();
        }

        System.out.println("\nToplam Ucret: " + total + " TL");
    }
}
