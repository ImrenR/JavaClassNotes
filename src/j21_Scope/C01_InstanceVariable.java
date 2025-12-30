package j21_Scope;

public class C01_InstanceVariable {//Class level

static String kurs= "Clarusway";
// initialize static class variable- gokteki gunes

    static String programLanguage;
    //non- initialized static class variable- gunes

    //fields -obj variable=> non-static

    int yas= 50; // initialized inst. variable
    int tecrube; // non -initialized inst variable
    String name;// non -initialized inst variable
    double boy;// non -initialized inst variable
    char unvan;// non -initialized inst variable
    boolean developerMi; //non-initialized inst. variable


    public static void main(String[] args) {//main level
 /*												INSTANCE VARIABLE

     1) Main method'un ve urettiginiz diger methodlarin disinda  (ustunde veya altinda), class'in icinde
         olusturulan variable'lara non-Static Class level "instance variable" denir.
     2) Instance variable'lar object olusturulurken olusturulur ve her obje'ye bu variable'lar monte edilir.
     3) Instance variable'lara deger atamasi yapsaniz da olur, yapmasaniz da olur.
         Asagida goruldugu gibi "yas" variable'ina deger atamasi yapıldı ama "tecrube" variable'ina yapılmadı
         Note : Bir variable'a deger atamasi yapma "Initialize" olarak adlandirilir.
             "yas" variable'i initialize edildi, digerleri initialize edilmedi.
     4) Initialize edilmeyen "instance variable" lar icin Java "default value" atamasi yapar.
                 byte, short, int, long icin default value 0'dir.
                 float, double --> default value 0.0'dir.
                 char --> default value ' ''dir.
                 boolean --> default value false'dur.
                 String --> default value "null" dir.
 */
       //static int a=31; => Class level haric LOCAL veya MAIN level da static CALL EDILEMEZ:CTE
      int a =34; // => main level de local initialized var create edildi.
      int b; // main level da local create edilmis non initialized variable
      //System.out.println(b); // CTE verir cunku initialized yok
      b=17;
        System.out.println("b = " + b); // atama yaptiktan sonra call edeilebilir
      //System.out.println("yas = " + yas);//  variable obj olmadan call edilemez : CTE
        System.out.println("kurs = " + kurs); // initalized edilmis var obj olmadan call edilebilir cunku statictir.
        System.out.println("programLanguage = " + programLanguage); // non-initial var initialzed olsun olmasin dogrudan call edilebilir : STATIC oldugu icin
      // Static initalized and non initialized dogrudan call edilebilir main localde.


    }//main sonu

}//Class sonu
