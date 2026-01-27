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
printCiftElKareMAx(sayiList);  // 1.cozum
        System.out.println("2.cozum= " + printCiftElKareMAx1(sayiList));
        System.out.println("3. cozum = " + printCiftElKareMAx2(sayiList));

        System.out.println("\n   *** task02 ***   ");
printToplaEl(sayiList);
        System.out.println("returnlu sonuc= " + printToplaEl1(sayiList));
        printToplaEl2(sayiList); // voidli Optinalli cozum
        System.out.println("\n   *** task03 ***   ");

        System.out.println("\n   *** task04 ***   ");

        System.out.println("\n   *** task05 ***   ");


    }//main sonu


    //Task01-> list çift elemanlarının(filtrele) karelerinin(map) en buyugunu(reduce islemi) print code(intyazdir metodunu kullanicam demek) create ediniz...
/// 1.cozum
    private static void printCiftElKareMAx(List<Integer> sayiList) {
        System.out.println("Sonuc\n  = " + sayiList.stream()
                .filter(SeedMethods::ciftMi)
                .map(SeedMethods::kareAl)
                .reduce(Math::max));// reduce bir terminate fonksiyonudur o yuzden foreach gelmez.

    }
    /// 2.cozum
    private static Optional<Integer> printCiftElKareMAx1(List<Integer> sayiList) {
          return sayiList.stream()
                .filter(SeedMethods::ciftMi)
                .map(SeedMethods::kareAl)
                .reduce(Math::max);// reduce bir terminate fonksiyonudur o yuzden foreach gelmez.

    }
    ///  3.cozum
    private static Optional<Integer> printCiftElKareMAx2(List<Integer> sayiList) {
     Optional<Integer>maxSayi = sayiList.stream()
                .filter(SeedMethods::ciftMi)
                .map(SeedMethods::kareAl)
                .reduce(Math::max);// reduce bir terminate fonksiyonudur o yuzden foreach gelmez.
return maxSayi;
    }

    //Task02-> list elemanlarının toplamını  print code create ediniz...

    public static void printToplaEl(List<Integer> sayiList){
        System.out.println("Voidli sonuc  = " + sayiList
                .stream()
                .reduce(Integer::sum));
    }
    public static Optional<Integer> printToplaEl1(List<Integer> sayiList){
       return sayiList
                .stream()
                .reduce(Integer::sum);

    }
    public static void printToplaEl2(List<Integer> sayiList){
        Optional<Integer>toplamSayi = sayiList
                .stream()
                .reduce(Integer::sum);
        System.out.println("toplamSayi = " + toplamSayi);
    }

    //Task03-> list'in çift elemanlarının çarpımını  print code create ediniz...




    //Task04-> list elemanlarının en küçüğünü  print code 4 farklı code create ediniz...



    // Task05-> List elemanlarının 58'den buyuk en kucuk tek elemanını print eden code create ediniz...





}




















