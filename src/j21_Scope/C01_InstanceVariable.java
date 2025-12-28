package j21_Scope;

public class C01_InstanceVariable {//Class level

static String kurs= "Clarusway";
// initialize static class variable- gokteki gunes

    static String programLanguage;
    //non- initialized static class variable- gunes

    //fields -obj variable=> non-static

    int yas= 50; // initialized inst. variable
    int tecrube; // non -initialized inst variable
    String name;
    double boy;
    char unvan;
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
        int a =31; // main levelda local create edilmis, local variable, main de acilmis cunku
     //  static int a =31; => CTE error alir cunku static mainde not allowed der.
        // static demek butun verilere ulasabilen deger demektir mainde kisitlanir erisilemez. Sadece class da kullanilir "Static"
     int b; // initialize edilmemis local variable
        // local i main blocktur
      //  System.out.println("b = " + b); // CTE verir, eger initalize edilmezse sout edilmez, local de aksyion alamaz.
        b= 17;
        System.out.println("b = " + b); // local variable su an dogrudan cagirilabilir => // 17

       // System.out.println("yas = " + yas); // initial edilmemis variable i cagiramazsin.obje olmadan call edilemez.

        System.out.println("initialized static kurs = " + kurs); //initial static variable obj olmadan dogrudan call edilebilir.

        System.out.println("non-initialized static programLanguage = " + programLanguage); // non initialize olan static default degerini atar.

        static_method(); // static method dogrudan call yani galaksiler arasi astral seyahat
     //   non_static_method(); static blok a (main) non static method dogrudan call edilemez.

    C01_InstanceVariable obj= new C01_InstanceVariable(); // obj create edildi
        obj.non_static_method(); // non-static method obj ile create edildi
        System.out.println("obj.name = " + obj.name);
        System.out.println("obj.boy = " + obj.boy);
        System.out.println("obj.yas = " + obj.yas);
        System.out.println("obj.developerMi = " + obj.developerMi);
        System.out.println("obj.unvan = " + obj.unvan);


    }//main sonu
       public static  void static_method(){ // galaksi-statik mehthof
     System.out.println("Agama static-methodtan selamlar");
 }

    public void non_static_method(){ // non-static
        System.out.println("Agama non-static-methodtan selamlar");
    }
}//Class sonu
