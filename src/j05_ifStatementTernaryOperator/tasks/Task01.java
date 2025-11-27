package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
         Task->
         Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore print eden code create ediniz.
        0 - 4 => bebek
        5 - 12 => cocuk
        13 - 20 => genc
        21 - 30 => yetiskin
        Tanimlanmamis evre
         */

Scanner input = new Scanner(System.in);
        System.out.println("Bir yas giriniz : ");
        int age = input.nextInt();

        String result = (age>=0 && age<=4) ? "bebo" :
                     (age>=5 && age<=12) ? "cocuk" :
                      (age>=13 && age<=20) ? "genc" :
                      (age>=21 && age<=30) ? "yetiskin" : "tanimlanmamis evre";

        System.out.println("Result :" + result);
    }
}