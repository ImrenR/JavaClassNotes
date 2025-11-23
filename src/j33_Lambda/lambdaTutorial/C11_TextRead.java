package j33_Lambda.lambdaTutorial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class C11_TextRead {
    /*
dosya eklemek icin 2 yol kullanılır
1) Files.lines(Path.of("path")  buradan stream e eklemek icin
Stream <String> satir=Files.lines(Path.of(".........."));
bu bize tekrardan stream tanimlamadan kullanmayi saglar
2) //Files.lines(Paths.get("..........")).  kullanilir
==========================================================
intellj dosya eklemek icin src => new=>file=>text diyoruz ve istedigimiz metni buraya kopyaliyoruz
bu dosyanin path almak icin dosyanin uzerine gelip sag tikliyoruz(burada dosya HalUk)
sonrasinda copy path seciyoruz bundan sonra iki secenek var
1) absolute path seciyoruz yada
2) path from content root seciyoruz
her ikisinde de path kopyalamis oluyoruz

cevirirken EXCEPTION OLUSMASIN DIYE => throws IOException <= EKLEMELIYIZ
buda lines altinda kirmizi uyari veriyor uzerine tiklayinca kendiliginden oluyor.
*/
    public static void main(String[] args) throws IOException {
        //TASK 01 --> haluk dosyasini okuyunuz.(Console'a print eden code create ediniz.)
        System.out.println("\n task 01 --> haluk dosyasini okuyunuz");


        //TASK 02 --> haluk.txt dosyasini map okuyunuz.(Console'a buyuk harflerle print eden code create ediniz.)

        //TASK 03 --> haluk dosyasindaki ilk satiri kucuk harflerle print eden code create ediniz.


        //TASK 04 --> haluk dosyasinda "basari" kelimesinin kac satirda gectiginiz print eden code create ediniz.

    }
}
