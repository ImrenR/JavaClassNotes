package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task13 {


static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

    /*
    Task-> girilen iki String'den ikincisi, birincisinin son harflerine eşitse, true,
     diğer durumda false return eden METHOD create ediniz

    Örnekler:
   ("abc", "bc") ➞ true
   ("abc", "d") ➞ false
   ("samurai", "zi") ➞ false
   ("feminine", "nine") ➞ true
   ("convention", "tio") ➞ false
    */
        System.out.println("Ilk stringi giriniz:");

        String x = input.nextLine();//"feminine";
        System.out.println("ikinci string i giriniz: ");
        String y = input.nextLine(); //"nine";
        //String z = "tio";

        System.out.println("sonHarfler esittir = " + sonHarfKontrol(x, y));
//endsWith kullaniriz , true false dondurecek o zaman void yerine boolean yazariz

    }//main sonu

    private static boolean sonHarfKontrol(String x, String y) {

        return x.endsWith(y);
    }


}//Class sonu
