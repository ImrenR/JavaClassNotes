package j08_Loops.Loop03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        //task-> bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz.
        //             24.5673 ==>    5+6+7+3 = 21


        Scanner input = new Scanner(System.in);
        System.out.println("Ondalik bir sayi giriniz :");
        double sayi=input.nextDouble();

        String sayiStr = String.valueOf(sayi); // sayiyi stringe cevir
        int noktaIndex = sayiStr.indexOf('.'); // noktanin indexi
        int toplam=0;

        for (int i = noktaIndex; i < sayiStr.length(); i++) {
            toplam  += Character.getNumericValue(sayiStr.charAt(i));

        }
        System.out.println("toplam = " + toplam);
    }
}
