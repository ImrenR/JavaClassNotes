package j12_ArrayList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.awt.List.*;

public class C01_ArrayList {
    public static void main(String[] args) {

             /*
     Array List genel Tanimi:

            ArrayList<Type> arrayListName  =new ArrayList<Type>();
                 List<Type> arrayListName = new ArrayList<>(); // bos bir array listtir

             1. Type : String, Integer, Double, Long, Byte, Short, Boolean, Object, .... seklinde Class olmalidir
                - ArrayList<int> hatali bir tanimlamadir. Type Wrapper Class gibi object türünden olmalidir


            2.  ONEMLI 1- Arrayler degistirilemez sabit bir .length;'de tanimlanir.
                ONEMLI 2- ArrayList'ler degistirilebilir size(); belirleme zorunlulugu olmadan tanimlanır.


                */

              Integer sayi [] = {1,2,3,4,5};
              List<Integer>listNums=Arrays.asList(sayi); //sayi listesini listNums a atadim.
              // Benim listNums in kaynagi(sayi) Array oldugu icin o da array gibi davranir
        // Dolayisiyla ben bunu yazdirdigim zaman listNums.add() metodu kullanamam

        /*

         3.  Intellij sonda bos biralikan <> yerine <~> seklinde ifade yazabilir bu ifade tanimdaki tür ile ayni anlamindadir.

         List declarations(tanımlama) :

         Array den farki boyut esnekleğidir.Array'lerde length sabittir, degistirilemez. ArrayList'lerde (List) length esnektir.
         eleman ekledikce List size'ini artirir,  eleman sildikce List size'ini azaltir.


         key word: List<Wrapper Class> name=

         List'e assaign etme(atama) :

    List'ler data type olarak primitive'leri kabul etmez. Primitive'lerde data type'ini non-primitive yapmak icin wrapper class'lari kullanilir.
    List<wrapper Class> name = new List<>()      *****yanlışşşşşşş (<> :jenerik wrapper Class dan parametre alır.)
    List<wrapper Class> name = new ArrayList<>() *****doğru
    List<wrapper Class> name = new ArrayList<Wrapper Class>() *****doğru -> BEST PRACTICE
    ArrayList<wrapper Class> name = new ArrayList<>()  ***** doğru

    LISTE ILK DEGER ATAMA !!!!! => (initialize):....

    1.yol : asList();
    ArrayList<Integer> sayı= new ArrayList<>(Arrays.asList(1,2,3)) demek 1,2,3 elemanlarini array olarak al demektir.

    2.yol : Listof();
    ArrayList<String> ulkeler= new ArrayList<String>( List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya") );


    PRINT ETME ARRAYLIST=> ArrayList ler array'lerin aksine direkt olarak ekrana yazdirilabilirler-->  print için:  System.out.println(name);
    PRINT ETME ARRAYLIST=> Array'ler Arrays.toString(arrayAdi); ile print edilir.


    Collections ==> Bir araya getirilmis parcalar anlamına gelir. ArrayList, Set, Vector, Queue ler java collections sınıfı nesneleridir.

 */
        List <String> name= new ArrayList<>(Arrays.asList("hardy", "ashley", "elly" ));
        System.out.println(name);
        name.add("imren");
        System.out.println(name);
        name.add(3,"ali");
        System.out.println(name);
        name.add(0,"olalal"); // hardy i ezdi ve bu isim update oldu
        System.out.println(name);


        //List tanımlama ve değer atama

        ArrayList<Integer> sayiList = new ArrayList<>(); // Integer data store eden bos list declare edildi.

        // 1. yol -> add(); meth

        System.out.println("sayiList.add(12) = " + sayiList.add(12));
        sayiList.add(34);
        sayiList.add(54);
        sayiList.add(34);
        sayiList.add(94);
        sayiList.add(14);
        sayiList.add(304);
        sayiList.add(354);
        sayiList.add(314);
        sayiList.add(324);
        System.out.println(sayiList);

        //2. yol -> Arrays.asList(); meth:Çuval
ArrayList<String> yemekList = new ArrayList<>(Arrays.asList("imambayildi", "tursu"));
        System.out.println(yemekList);

        //3. yol -> List.of(); meth:Çuval
ArrayList<String> countries = new ArrayList<>(List.of("Portekiz","Almanya"));
        System.out.println(countries);

        // list print etme..

ArrayList<Integer> rakamList = new ArrayList<>(){
    {
        for (int i = 0; i < 10; i++) {
            add(i);
        }
    }
};
        System.out.println(rakamList);
    }
}
