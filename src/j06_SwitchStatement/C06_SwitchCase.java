package j06_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
        // TASK-> Girilen haftanın gününü hafta içi veya sonu oldugunu print eden code create ediniz..
        Scanner input = new Scanner(System.in);
        System.out.println(" Merhaba gunlerden bir gun giriniz :");

        String gun = input.nextLine();

        switch (gun){
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case"cuma":
                System.out.println("Hafta ici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Hafta sonudur");
                break;

        }

    }
}
