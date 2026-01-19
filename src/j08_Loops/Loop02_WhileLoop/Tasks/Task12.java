package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop

          Metindeki karakterleri tek tek kontrol etmeliyiz.
          Başta i=0 (indeks)
          Her adımda i++
          i < metin.length() olduğu sürece devam

		 */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir metin giriniz :");
        String metin = input.nextLine();

        int harf=0;
        int rakam=0;
        int ozel=0;

        int i=0;


        do {
            char ch=metin.charAt(i);

            if (Character.isLetter(ch)){
                harf++;
            } else if (Character.isDigit(ch)) { // ch nin ilk harfindan son harfineen kadar rakam kontrolu yapar
                rakam++;

            }else {
                ozel++;
            }
            i++;
        }while (i<metin.length()); // metin bitene kadar devam et do dongusunde

        System.out.println("Harf sayısı: " + harf);
        System.out.println("Rakam sayısı: " + rakam);
        System.out.println("Özel karakter sayısı: " + ozel);


     }

}
