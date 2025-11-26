package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        /* task ->
        girilen bir ifadenin istenen harf sayısını print eden code create ediniz

        input : selam javaCAN'lar
        output : a sayısı :3
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Bir string giriniz:");
        String word=input.nextLine();

        System.out.println("Hangi harfi saymak istiyorsunuz:");
        char harf = input.next().charAt(0);

        int sayac = 0;
        for (int i = 0; i <word.length() ; i++) {
            if (word.charAt(i)== harf){
                sayac ++;
            }

        }
        System.out.println(harf + "harfi" + sayac + "kez geciyor.");

    }
}
