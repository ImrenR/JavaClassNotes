package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını print eden code create ediniz
		 */
        Scanner input= new Scanner(System.in);
        System.out.println("Bir string giriniz:");
        String word= input.nextLine();

//char ->  tek bir karakteri baz alir
        // char ch = word.charAt(i) ise kelimenin uzunlugu kadar donecek ve toplayacaktir
        int rakamSayisi = 0;
        for (int i = 0; i <word.length() ; i++) {
            char ch =word.charAt(i);
            rakamSayisi++;
        }
        System.out.println("String icindeki rakam sayisi : " + rakamSayisi);
	}
}
