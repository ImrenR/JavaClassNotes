package j08_Loops.Loop02_WhileLoop;

import java.util.Scanner;

public class C01_WhileLopp {
    public static void main(String[] args) {
  /*
        Başlangıç bitiş ve değişim değerleri net  bilinen tekrarlarda for loop ama adım sayısı değişim değeri
        net bilinmeyen belli bir şarta(durum-boolean) bağlı olan tekrarlara while loop kullanılır.
         */
        //Task01-> 3'den 20'ye kadar olan tamsayıları print eden code create ediniz.
        // System.out.println("   ***   Task01   ***   ");
        for (int i = 3; i < 21; i++) {
            System.out.print(i + " ");

        }

        System.out.println();
        int basla=3;

        while (basla<= 20){
            System.out.println("basla = " + basla);
            basla++;
        }



        // task02-> 7 kere javaCAN print eden code create ediniz
        // System.out.println("   ***   Task02   ***   ");


        // task03->2 basamaklı tek sayıları print eden code create ediniz
        //   System.out.println("   ***   Task03   ***   ");

        // task04->bir basamaklı sayma sayılarını aynı satırda print eden code create ediniz
        // System.out.println("   ***   Task04   ***   ");

        // task05->girilen ifadeyi tersten  print eden code create ediniz
        // System.out.println("   ***   Task05   ***   ");

Scanner input = new Scanner(System.in);
        System.out.println("String giriniz");
        String str = input.nextLine();
         int harfSayisi = str.length();

        while(harfSayisi>0) { // str nin karakter sayisi kadar tekrar taniimlandi loop
            System.out.print(str.charAt(harfSayisi-1)); // looptaki str nin son harfini verir.

            harfSayisi--;


        }












        // task06->girilen pozitif  tamsayıya kadar sayıların toplamını  print eden code create ediniz
        // System.out.println("   ***   Task06   ***   ");


    }
}
