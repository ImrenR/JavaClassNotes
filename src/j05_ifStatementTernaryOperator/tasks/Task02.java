package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
		/*
		Task->
		Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
		“Eşkenar üçgen" yazdırın. Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen"
		yazdırın. Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen" print eden code create ediniz.
		 
		 */
int kenar1 = 30;
int kenar2 =90;
int kenar3 = 60;

        if (kenar3 == kenar1 && kenar2 == kenar3) {
            System.out.println("Eskenar ucgen");
        } else if (kenar3 == kenar1 || kenar2 == kenar3 || kenar2 ==kenar1) {
            System.out.println("ikizkenar ucgen");
        }else System.out.println("cesitkenar ucgen");

    }


}
