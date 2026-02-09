package j19_Constructor;

public class C05_Arac {//obj kalıphane

    //fields->obj-inst variable
    //Fields-> obj'nin uretilirken alacagı değer variables bir class'da bir den çok cons tanımlanabilir
/*
  Fields-> obj'nin uretilirken alacagı değer variables bir class'da bir den çok cons tanımlanabilir
  1) Constructor icinden baska bir Constructor cagirmak icin "this()" kullanılır.This() keyword mutlaka ilk satira yazmalisiniz.
          Aksi takdirde CTE verir
        2) Bir Constructor icinden sadece bir tane Constructor call  yapılır.Cunku iki tane cagri yaprsaz
        birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
        */
String model;
int maxHiz;

//Constructerlar

    public C05_Arac(int maxHiz) {
       this(99,"haci murat");
        this.maxHiz = maxHiz;
        maxHiz=maxHiz; //p den gelen maxhiz value ins variable degil yine ayni parametre atandi.
        System.out.println("Agam bu yaziyi okuduysan tek prtli const call edildi");
    // this () =CTE cons body icinde bir kez call edilir yoksa CTE verir
    }

    public C05_Arac(int maxHiz, String model) {
        this.maxHiz = maxHiz;
        this.model = model;
        System.out.println("Agam bu yaziyi okuduysan tumparametreli const call edildi");
    }

    public C05_Arac() {//  psiz const
        System.out.println("Agam bu yaziyi okuduysan fasfakirsin");

   }

//toString()
    @Override
    public String toString() {
        return
                "model='" + model +
                ", maxHiz=" + maxHiz
                ;
    }
}
