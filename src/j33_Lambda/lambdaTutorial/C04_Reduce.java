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
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 58, 17, 54, 33, 3, 13, 35, 65, 18, 61, 46, 25, 16, 6));
        // List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 58, 17, 35, 34, 25, 16, 6));

        System.out.println("   *** task01 ***   ");
printCiftElKareMAx(sayiList);  // 1.cozum
        System.out.println("2.cozum= " + printCiftElKareMAx1(sayiList));
        System.out.println("3. cozum = " + printCiftElKareMAx2(sayiList));

        System.out.println("\n   *** task02 ***   ");
printToplaEl(sayiList);
        System.out.println("returnlu sonuc= " + printToplaEl1(sayiList));
        printToplaEl2(sayiList); // voidli Optinalli cozum
        printToplaEl3(sayiList);
        System.out.println("\n   *** task03 ***   ");
        printCiftElCarpim(sayiList); //sonuc 189312
        System.out.println("\n   *** task04 ***   ");
printElMinSayi(sayiList);

        System.out.println("\n   *** task05 ***   ");
        System.out.println("printTek58ByMin(sayiList) = " + printTek58ByMin(sayiList));

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

    public static void printToplaEl3(List<Integer> sayiList){
        System.out.println(" Reduce in js teki gibi hali= " + sayiList
                .stream()
           /// .reduce(Math::addExact) => metod referance app yavaslatir=> bad practice
                .reduce(0, (a, b) -> a + b)); /// spesific data old icin app i hzili calisir => Best practice
        /*
        a: ilk değerini her zaman  atanan identity değerden alır. yani 0
        b: değerini her zaman Stream()'den alır
       a: ilk değerden sonraki değerini action(işlem body)'den alır
       */
    }

    //Task03-> list'in çift elemanlarının çarpımını  print code create ediniz...

    private static void printCiftElCarpim(List<Integer> sayiList) {

        System.out.println("Reduce ile sonuc void= " + sayiList.stream()
                .filter(SeedMethods::ciftMi)
                ///.reduce(Math::multiplyExact);
                .reduce(1, (a, b) -> (a * b)));

    }



    //Task04-> list elemanlarının en küçüğünü  print eden 4 farklı code create ediniz...



public static void printElMinSayi(List<Integer> sayiList ){
    /// 1.yol Math ile
    System.out.println("Min sayi Math ile " + sayiList.stream().reduce(Math::min)); // 6
/// 2.yol integer  ile
    System.out.println("Min sayi Math ile " + sayiList.stream().reduce(Integer::min)); // 6
/// 3. seed ile olan yol
    System.out.println("Min sayi Math ile " + sayiList.stream().reduce(SeedMethods::minBul)); // 6
    /// 4. identity ile olan yol
    System.out.println("Min sayi Math ile " + sayiList.stream().reduce(sayiList.get(0),(a,b)->a < b ? a : b)); // 6
// sayiList,get(0) ile 0. indeksi alir almali ki ilk elemanla diger sayilari kiyaslar ve en kucuk elemani getirir
}


    // Task05-> List elemanlarının 58'den buyuk en kucuk tek elemanını print eden code create ediniz...

    private static Optional<Integer> printTek58ByMin(List<Integer> sayiList) {
        return sayiList
                .stream()
            //    .filter(SeedMethods::tekMi && SeedMethods::den58By ) // CTE -> expression meth referance ayni parametrede tanimlanamaz
                .filter(t-> t%2==1 && t>58 )

                .reduce(SeedMethods::minBul);// reduce bir terminate fonksiyonudur o yuzden foreach gelmez.
// Optional.empty => 58 den buyuk bir sayi olmadigi icin olsaydi verirdi
        // yukardaki listeyi actim => sonuc 61 verdi
    }



}




















