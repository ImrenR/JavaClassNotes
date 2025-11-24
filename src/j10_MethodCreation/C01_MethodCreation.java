package j10_MethodCreation;

public class C01_MethodCreation {// Class level
 /*
       code okunabilirliği ve sadeliği için sürekli kullanılan aksiyonlar için method create edip
       main method'a call edip run etmek uygulamanın test edilmesi maintanance ve reusable açısından tercih edilir.
       1) Java method'larin sadece name  değil  name + parametre'lere göre run eder
       parametre sayisi, parametre'lerin data tiplerin ve parametrelerin sırası methodu belirler.

       str.endsWith("el");   Bu method'un gorevi gidip kelimenin son kismini kontrol etmek
                             bu method'u kullanmak icin bu method'un kontrol ettikten sonra
                             bana rapor olarak ne getirdigini bilmem lazim (true/false)

       2) Bir method create edildiğinde  method'un aksiyonuna ve aksiyon çıktısı da method içinde create edilir

       3) Bir method olusturulurken  " str.indexOf(String str, int fromIndex) "
          de oldugu gibi
          disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
          deklare edilmeli

          method call edildiğinde  Parametre olarak
          declare edilen data tiplerine uygun value'ler (ARGUMENT)  girilmeli.
   */

    public static void main(String[] args) {//main level

  // topla(); // method call edildi. Toplam : 66 print eder
  // topla1(); // bir metodu yan yana call edebilirsin:
        topla();topla1();
    // topla1().sout;  => return type olmayan void meth south ile kullanilmaz ama meth void oldugu icin sout comutu girilir.
topla2(25, 25);
//topla2("ali",23); CTE verir p1 data type int olmali String olamaz.


    }//main sonu

   public static void topla2(int ebik, int gabik){// 2 int parametreli bir method yaptik return typi void olan bir metottur
       System.out.println(ebik+gabik);
    }

    private static void topla1() {
        int a= 45;
        int b= 45;
        int toplam = a+b;
    }

    private static void topla() { // p siz return type olmayan meth -> void bir ciktisi olmayan
        int a=31;
        int b=35;
        System.out.println("Toplam :" + ( a + b));


    }


}//Class sonu
