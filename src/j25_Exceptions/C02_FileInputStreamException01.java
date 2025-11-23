package j25_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException01 {
    /*
             Dosya okuma/yazma işlemi bu işlemlerde hata ihtimali yüksek olduğu için  hata kontrolü zorunlu tutuluyor.
             bu yüzden try-catch e alınması bu kodun zorunlu tutuluyor. bu gibi surunlara karşılk gelen hatalara Checked Exception denir
             Özellikle IO(input output) işlemleri CHECKED EXCEPTİON dur.


            Bir code create edilirken olasi exception'lar ongorulup exception olustugunda Java'nin ne yapmasini istedigimiz
            belirtilmelidir.


                     1) FileNotFoundException, ustunde calisilicak bir dosyaya ulasma ile ilgili problemlerde
                 kullanilir. Bir dosyaya ulasmada iki temel problem olabilir; a) Path yanlistir. b) Dosya silinmistir.

                     2) IOException, input ve output ile alakali tum problemlerde kullanilir. IOException,
                 FileNotFoundException'in yaptigi tum aksiyonları yapabilir dolayısıyla IOException kullanildiginda
                 FileNotException'in kullanilmasina gerek yoktur. IOException FileNotFoundException
                 Class'inin parent class Hz.Adem
         */
   // public static void main(String[] args) throws FileNotFoundException {//main meth signature level exception(throws) zorunlu tanımlandı
    public static void main(String[] args) throws IOException {//main meth signature level exception(throws) zorunlu tanımlandı

    }
}
