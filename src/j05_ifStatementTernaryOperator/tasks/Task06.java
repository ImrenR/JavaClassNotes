package j05_ifStatementTernaryOperator.tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan cinsiyetini girmesini isteyin.
		Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
		Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		 */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a gender:");
        String gender= input.nextLine();


        if (gender.equalsIgnoreCase("erkek")) {
            Scanner db = new Scanner(System.in);
            System.out.println("Yasini giriniz :");
            int yasi = db.nextInt();
            if (yasi <= 18) {
                System.out.println("Erkek cocuk");
            }else System.out.println("Adam");

        }else if (gender.equalsIgnoreCase("kadin")) {
            Scanner db = new Scanner(System.in);
            System.out.println("Yasini giriniz :");
            int yasi = db.nextInt();
            if (yasi <= 18) {
                System.out.println("Kiz cocuk");

            }else System.out.println("Kadin");
        }else System.out.println("something went wrong");
    }
}































