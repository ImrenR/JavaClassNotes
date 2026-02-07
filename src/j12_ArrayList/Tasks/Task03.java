package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        // Task ->  bir listte istenen sayının varlığı kontrol edip print eden code create ediniz.

        ArrayList<Integer> sayiList=new ArrayList<>(Arrays.asList(1,3,6,78,94,23,54,4,89,34));
        Scanner input=new Scanner(System.in);
        System.out.println("Bulmak istediginiz sayiyi giriniz :");
        int istenenSayi= input.nextInt();
///  1. cozum :
      //  boolean sayiBulundu = sayiList.contains(istenenSayi);
       // System.out.println(sayiBulundu ?
          //      "Girilen sayi listede var" :"Listede yok");

        ///  2. cozum : Uzun yol
boolean sayiBulundu =false;
        for(int avuc:sayiList) {
            if(avuc == istenenSayi) {
            sayiBulundu=true;
            break;
            }
        }
        if (sayiBulundu) {
            System.out.println("Sayi listede var");
        }else System.out.println("Sayi listede yok");
    }
}
