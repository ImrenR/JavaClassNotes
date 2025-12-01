package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        /*
          TASK -> girilen bir karakterin harf  olup olmadığını  kontrol eden code create ediniz..

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir kelime giriniz :");
        String harf = input.nextLine();

        char ch =harf.charAt(0);
        if (Character.isLetter(ch)) {
            System.out.println("Evet harftir");
        }else System.out.println("Harf degildir");
    }
}
