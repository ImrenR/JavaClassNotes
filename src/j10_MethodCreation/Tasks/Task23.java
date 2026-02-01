package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task23 {

    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /*
        Task-> vucüt kitleendexini print eden METHOD create ediniz
        vki->kg(mt*mt)
     18,5 kg/m2 ve daha düşük değerler = Zayıf.
     18,5 ve 24,9 kg/m2 arasındaki değerler = Normal ağırlıkta.
     25,0 ve 29,9 kg/m2 arasındaki değerler = Kilolu.
     30,0 ve üstü =  obezite.

         */


vucutKitleInxsi(34.7);
       double sayi= input.nextInt();
    }//main sonu

public static void vucutKitleInxsi(double sayi){

        if(sayi>0 && sayi <= 18.5) {
            System.out.println("Zayif");
        } else if (sayi >=18.5 && sayi<= 24.9) {
            System.out.println("Normal agirliktadir");

        } else if (sayi>=25.0 && sayi<=29.9) {
            System.out.println("Kilolusunuz");
        } else if (sayi >= 30.0) {
            System.out.println("Obezsiniz");
        }
}


}
