package j33_Lambda.lambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C04_Reduce {
       /*
        reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
        kullanımı yaygındır pratiktir.
        Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
        bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılımlı bir hesaplama süreci elde edilmiş olmaktadır.
        reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
        reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
        İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.

        */

    public static void main(String[] args) {
       // List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 58, 17, 54, 33, 3, 13, 35, 65, 18, 61, 46, 25, 16, 6));
         List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 58, 17, 35, 34, 25, 16, 6));

        System.out.println("   *** task01 ***   ");

        System.out.println("\n   *** task02 ***   ");

        System.out.println("\n   *** task03 ***   ");

        System.out.println("\n   *** task04 ***   ");

        System.out.println("\n   *** task05 ***   ");


    }//main sonu

    //Task01-> list çift elemanlarının karelerinin en buyugunu print code create ediniz...

    //Task02-> list elemanlarının toplamını  print code create ediniz...


    //Task03-> list'in çift elemanlarının çarpımını  print code create ediniz...

    //Task04-> list elemanlarının en küçüğünü  print code 4 farklı code create ediniz...



    // Task05-> List elemanlarının 58'den buyuk en kucuk tek elemanını print eden code create ediniz...

}




















