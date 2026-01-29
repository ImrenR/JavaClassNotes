package j08_Loops.Loop03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        //task-> kullanıcıdan alınan bir cümlenin büyük harfle başlayıp nokta ile
        // bittiğini kontrol eden code create ediniz.

// COZUM icin puf noktalar =>>
        /*
        * cumle.chart(0) => cumlenin ilk harfi
        * Character.isUpperCase(...) => buyuk mu kucuk mu
        * cumle.charAt(cumle.lenght()-1) == '.' => cumlenin sonu . ile bitiyor mu
        *
        *
        * */
        Scanner input = new Scanner(System.in);
        String cumle;
        char ch;
       char nokta;

        do{
            System.out.println("bir cumle giriniz : ");
            cumle =input.nextLine();
            ch = cumle.charAt(0); // cumlenin ilk harfi
            nokta= cumle.charAt(cumle.length()-1);
            if(Character.isUpperCase(ch) && nokta == '.') {
                    System.out.println("cumleniz : " + cumle);
                    break; // cumle dogruysa donguden cik
                }else System.out.println("Cumleniz buyuk harfle baslamiyor ya da nokta ile bitmiyor");


        }while (true);


    }
}
