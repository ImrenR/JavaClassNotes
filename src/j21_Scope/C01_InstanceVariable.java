package j21_Scope;

public class C01_InstanceVariable {//Class level


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



    }//main sonu


}//Class sonu
