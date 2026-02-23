package j33_Lambda.lambdaTutorial;

import java.util.*;
import java.util.stream.Collectors;

public class C10_LambdaObject {
    /*
      TASK :
      fields --> Universite (String)
                 bolum (String)
                 ogrcSayisi (int)
                 notOrt (int)
                 olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
       */
    public static void main(String[] args) {
       //data typleri C01_University dir
        C10_University u01 = new C10_University("Bogazici", "Matematik", 571, 73);
        C10_University u02 = new C10_University("Istanbul", "Matematik", 622, 77);
        C10_University u03 = new C10_University("Marmara", "Hukuk", 1453, 52);
        C10_University u04 = new C10_University("Itu", "uçak muh.", 333, 63);
        C10_University u05 = new C10_University("Yıldız Teknik", "Gemi ", 216, 55);

        List<C10_University> unv = new ArrayList<>(Arrays.asList(u01, u02, u03, u04, u05));

        System.out.println("   Task01  ");
        kontrolNotOrt74tenbyk(unv);
        System.out.println("   task02  ");
     ogrenciSayisi100danKucukOlmadigi(unv);
        System.out.println("   task03  ");
matBolumuVar(unv);
        System.out.println("   task04  ");
        System.out.println(ogrenciSayilariBuyuktenKucge(unv));
        System.out.println("   task05  ");

        System.out.println("   task06  ");

        System.out.println("   task07  ");

        System.out.println("   task08  ");

        System.out.println("   task09  ");
        System.out.println("   task10  ");
        System.out.println("   task11  ");


    }//main sonu



    // Task01-> notOrt'larının 74'den buyuk oldg control eden code create ediniz...

    public static void kontrolNotOrt74tenbyk(List<C10_University> unv){
        System.out.println( unv
                .stream()
                .anyMatch(t -> t.getNotOrt() > 74) ?
                "Not ortalamasi 74 ten buyuk" : "Not ort 74 ten buyuk degil");
    }


    //task02->ogrc sayilarinin   110 den az olmadigini  kontrol eden code create ediniz.

    private static void ogrenciSayisi100danKucukOlmadigi(List<C10_University> unv) {

        System.out.println( unv
                .stream()
                .allMatch(t -> t.getOgrcSayisi() >= 110)
                ? "Ogrenci sayisi 110 dan kucuk olanlar var"
                : "Yok bulunamadi");
    }
//task03->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden code create ediniz.
private static void matBolumuVar(List<C10_University> unv) {
    System.out.println(unv.stream().anyMatch(t -> t.getBolum().contains("Matematik"))
            ? "Matematik bolumu bulunuyor"
            : "Mat bol bulunmadi");
}


//task04->universite'leri ogr sayilarina gore b->k siralayiniz.

    private static List<C10_University> ogrenciSayilariBuyuktenKucge(List<C10_University> unv) {
        return unv
                .stream()
                .sorted(Comparator.comparing(C10_University::getOgrcSayisi).reversed())
                .collect(Collectors.toList()); //akistan cikmak icin birden cok eleman varsa Collectiona ihtiyac var List ya da Array e atadik
    }

//task05-> universite'leri notOrt gore  b->k siralayip ilk 3 'unu print eden code create ediniz...


//j23_Encapsulation.Tasks.task06-> ogrc sayisi en az olan 2. universite'yi  print eden code create ediniz...


//task07-> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print eden code create ediniz...


//task08-> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini print eden code create ediniz...


//task09-> "matematik" bolumlerinin sayisini  print eden code create ediniz...


//task10-> Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu print eden code create ediniz...


//task11-> Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu print eden code create ediniz...

}





















