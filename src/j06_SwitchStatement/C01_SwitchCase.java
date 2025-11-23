package j06_SwitchStatement;

import java.util.Scanner;

public class C01_SwitchCase {

    public static void main(String[] args) {
        /*
    Switch-Case yapısı  if statement'e benzer action alır.
    Çok sayida if statement bloklari code okunabilirliği ve clean code olarak tavsiye edilmez. Bir app actionda sabit bir degeri
    çoklu durum ile karsilastirmak için switch-case blok kullanılır. Switch-case blok'da  degiskene göre bir
    çok durumdan değişkene uyan durum gerçeklesir.

    if statement blok ile  switch-case blok birlikte tanımlanabiir.
    Coklu koşul içeren durumlarda switch-case blok if statement'e göre app. hızı açısından daha avantajlıdır.(Best Practice)
     Switch-Case ile if statement arasında önemli bir performans farklılığı yoktur.

      ahan da CISSS TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ..

      Switch de sadece int, byte, short, char, String data type  kullanilabilir
      Eger 3 den fazla durum varsa switch() tercih edilir.
 */

        // Task-> verilen bir rakamın harf karakteri ile print eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.print("Gakkom ele bi rakam gir : ");
        int rakam = input.nextInt();

        System.out.println("   *** if-statement   ***   ");

        System.out.println("   *** switch-case   ***   ");

switch (rakam){
    case 1:
        System.out.println("one");
            break;

    case 2:
        System.out.println("two");
        break;

    case 3 :
        System.out.println("three");
        break;
    case 4:
        System.out.println("four");
        break;
    case 5:
        System.out.println("five");
        break;
    case 6:
        System.out.println("six");
        break;
    case 7:
        System.out.println("seven");
        break;
    case 8:
        System.out.println("eight");
        break;
    case 9:
        System.out.println("nine");
        break;
    default:
        System.out.println("Not a digit (0–9)");

}






    }
}
