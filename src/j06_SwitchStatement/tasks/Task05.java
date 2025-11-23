package j06_SwitchStatement.tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/*
		TASK :
		Girilen note değerinin  aşağıdaki kurallara göre karşılığını print eden code create ediniz.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Lütfen gecerli not giriniz" print ediniz
		
		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.

		 */
        Scanner input = new Scanner(System.in);
        System.out.println("Bir not giriniz");
        int note = input.nextInt();

        if (note >= 0 && note< 50) {
            System.out.println("D");
        } else if (note >= 50 && note < 60) {
            System.out.println("C");
        } else if (note >= 60 && note <= 80) {
            System.out.println("B");
        } else if (note > 80 && note <= 100) {
            System.out.println("A");
        } else {
            System.out.println("Lütfen geçerli not giriniz");
        }



    }


}
