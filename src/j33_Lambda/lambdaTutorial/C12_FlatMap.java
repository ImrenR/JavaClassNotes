package j33_Lambda.lambdaTutorial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C12_FlatMap {
    public static void main(String[] args) throws IOException {
       /*
   Stream.flatMap, adıyla tahmin edilebileceği gibi, bir map ve flat işleminin birleşimidir.
    Bu, ilk önce elemanlarınıza bir
   fonksiyon uyguladığınız ve daha sonra düzleştirdiğiniz anlamına gelir.
   Stream.map yalnızca akışı düzleştirmeden bir işlevi uygular.

   Bir akışın düzleştirme'in neyi içerdiğini anlamak için, "iki seviye" olan [ [1,2,3],[4,5,6],[7,8,9] ] gibi bir yapı düşünün.
   Bunun düzleştirilmesi, "bir seviye" yapısında dönüştürülmesi anlamına gelir: [ 1,2,3,4,5,6,7,8,9 ].
   flatMap yöntemi, bir akışın her bir değerini başka bir akışla değiştirmenizi sağlar
   ve ardından oluşturulan tüm akışları tek bir akışa birleştirir.

 */

        Path erişilecekDosya = Path.of("/Users/imrenrahbay/IdeaProjects/JavaClassNotes/src/j33_Lambda/lambdaTutorial/HalUk");//erişilecek dosya yolu tanımlandı
        Stream<String> dosyaAkısı = Files.lines(erişilecekDosya);//erişilen dosya dataları satır olarak akısa alındı

        //TASK 05 -> HalUk dosyasindaki farkli kelimeleri  print ediniz..
        System.out.println("Task 05 = HalUk dosyasindaki farkli kelimeleri  print ediniz" );
Files.lines(erişilecekDosya)
        .map(t->t.split(" ")) // akistaki her bir satirin space e gore parcalayip (kelime kelime) akisa aldi
        .flatMap(Arrays::stream)
        .distinct()
        .forEach(System.out::println);


        //TASK 06 -> HalUk dosyasindaki tum kelimeleri natural order  print ediniz..
        System.out.println("TASK 06 -> HalUk dosyasindaki tum kelimeleri natural order  print ediniz" );
        Files.lines(erişilecekDosya)
                .map(t->t.split(" ")) // akistaki her bir satirin space e gore parcalayip (kelime kelime) akisa aldi
                .flatMap(Arrays::stream)
                .sorted() //once buyuk harfleri sonra kucuk harfleri siralar
                .forEach(System.out::println);

        //TASK 07 -> HalUk dosyasinda "basari" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız print ediniz.
        System.out.println("TASK 07 -> HalUk dosyasinda \"basari\" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız print ediniz" );
        System.out.println(Files.lines(erişilecekDosya)
                .map(t -> t.split(" "))
                .flatMap(Arrays::stream)
                .filter(t -> t.equalsIgnoreCase("basari"))
                .count());
///  output => 2

        //TASK 08 -> HalUk dosyasinda "a" harfi gecen kelimelerin sayisini print eden  programi create ediniz.
        System.out.println("TASK 08 -> HalUk dosyasinda \"a\" harfi gecen kelimelerin sayisini print eden  programi create ediniz." );
        System.out.println(Files.lines(erişilecekDosya)
                .map(t -> t.split(" "))
                .flatMap(Arrays::stream)
                .filter(t -> t.contains("a"))
                .count());

/// OUTPUY => 15

        //TASK 09 -> HalUk dosyasinda icinde "a" harfi gecen kelimeleri print ediniz.
        System.out.println("TASK 09 -> HalUk dosyasinda icinde \"a\" harfi gecen kelimeleri print ediniz." );
    Files.lines(erişilecekDosya)
                .map(t -> t.split(" "))
                .flatMap(Arrays::stream)
                .filter(t -> t.contains("a"))
                .forEach(System.out::println);

        //TASK 10 -> HalUk dosyasinda kac /farklı harf kullanildigini print ediniz.
        System.out.println("TASK 10 -> HalUk dosyasinda kac /farklı harf kullanildigini print ediniz." );
        System.out.println(Files.lines(erişilecekDosya)
                .map(t -> t.replaceAll("\\W", "").split(""))// butun harfleri ayirir
                .flatMap(Arrays::stream)
                .distinct() // benzersi yap
                .count());

        // Kelime harici harf harici her seyi replace all \\W ile hic et ""
///  OUTPUT = 29 farkli harf kullanildi


        //TASK 11 -> HalUk dosyasinda kac farkli kelime kullanildigini print ediniz.
        System.out.println("TASK 11 -> HalUk dosyasinda kac farkli kelime kullanildigini print ediniz." );
        System.out.println(Files.lines(erişilecekDosya)
                .map(t -> t.replaceAll("[.!,:)\\-]", "").split(" "))// butun harfleri ayirir
                .flatMap(Arrays::stream)
                .distinct() // benzersi yap
                .count());
///  OUTPUT = 22 farkli kelime kullanmisiz

        //TASK 12 -> HalUk dosyasinda  farkli kelimeleri print ediniz.
        System.out.println("TASK 12 -> HalUk dosyasinda  farkli kelimeleri print ediniz." );
       Files.lines(erişilecekDosya)
                .map(t -> t.replaceAll("[.!,:)\\-]", "").split(" "))// butun harfleri ayirir
                .flatMap(Arrays::stream)
                .distinct() // benzersi yap
                .forEach(System.out::println);
    }
}
