package j12_ArrayList.Tasks;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
         /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         print eden code create ediniz.

        */
Scanner input = new Scanner(System.in);
        System.out.println("Kac adet eleman girmek istiyorsunuz :");
        int elemanSayisi = input.nextInt();
        int i=1;
        List<Integer> list = new ArrayList<>();

        while (i<=elemanSayisi) {
            System.out.println(i + ". elemani giriniz");
            list.add(input.nextInt());
            i++;
        } // listeyi elemanlarla oldurduk

        List<Integer> result = tekElemanSayiliListe(list);
        System.out.println("result = " + result);

    }//main sonu

    private static List<Integer> tekElemanSayiliListe(List<Integer> list) {
        List<Integer> sonuc = new ArrayList<>();
        for (int avuc: list) {
            if(avuc%2 != 0){
                sonuc.add(avuc);
            }
    }
return sonuc;
}


}
