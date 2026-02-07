package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        //Task-> Girilen  VIP (Very Important Person)
        // kisaltmasindaki harflerin anlamini print eden code create ediniz

Scanner input = new Scanner(System.in);
        System.out.println("VIP de ogrenmek istediginiz harf acilimini giriniz");
        String harf = input.next();

        switch (harf) {
            case "V":
                System.out.println("Very");
                break;
            case "I" :
                System.out.println("Important");
                break;
            case"P":
                System.out.println("Person");
                break;
            default:
                System.out.println("GEcersiz bir harf girdiniz");
                break;
        }
    }
}
