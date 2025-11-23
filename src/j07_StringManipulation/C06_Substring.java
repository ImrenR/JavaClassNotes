package j07_StringManipulation;

import java.util.Scanner;

public class C06_Substring {
    public static void main(String[] args) {
           /*
        substring()
        Metin icinde, istenilen araliktaki bir parcasina ya da butunune  String olarak ulaşılmak istenebilir..
        substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
        substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
        indexi'e kadar parçayı return eder
        baslangic indexi ==> inclusive/dahil
        bitis indexi ==> exclusive/haric
         */
String str = "JavaGuzelsin" ;
        System.out.println(str.substring(4)); //Guzelsin , Index 4 ten sonuna kadar
        System.out.println(str.substring(0,4)); // 0 dahil, 4 haric. Java

        // task-> girilen 4 harfli bir kelimenin tersten print eden code create ediniz. -> kale:elak

Scanner input = new Scanner(System.in);
        System.out.println(" enter a word");
        String newWord = input.nextLine();
     String yeniKelime = newWord.substring(3) + newWord.substring(2,3) + newWord.substring(1,2) + newWord.substring(0,1);
        System.out.println(yeniKelime);

    }
}
