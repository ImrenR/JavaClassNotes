package j02_DataTypes_WrapperClass;

public class C01_VariableCreate {//Class level
           /*Variable
          bellekte (memory) ayrilmis olan alanin (reserved area) adidir.
          Variable icinde deger saklayan bir container'dir
          bir variable oluştururken içerisine koyacağimiz datanın değer alabileceği değerlere uygun bir data türü seçmeliyiz
         örneğin bir okulun öğrenci sayısı için variable data türü String,boolean,char veya double alınmamalı.
         geriye kalan tamsayı  turlerınden okulun öğrenci sayısını içine alabilecek büyüklükte bir data turu secilir
         *** genelde tam sayılar için int ondalıklı sayılar için double kullınılır..
         */

    public static void main(String[] args) {//main level
        // variable create(değişken oluşturmak) için...
        // 1- Data type(değişken türü)     2-VariableName(değişken ismi) '=' value(değişken değeri) ';'
        int halukYas = 48;// memory'de int type halukYas adında 48 değerinde variable(değişken)
        // declaration(tanımlama)                                         = assaigmnent(Atama)

        // java'da '=' atama operatoru  olarak tanımlanmıştır
        // 'Assaignment(atama) operator'(=) -> sağdaki değeri soldaki variable tanımlamaya atar..


        // 1. yol -> best practice (Recommended : tavsiye edilen)
        int yas = 33;
        int maas = 100000;
        System.out.println(yas);//33
        System.out.println("yas");//yas

        System.out.println("halukYas = " + halukYas);// halukYas = 48
        System.out.println("feride hanım maası :" + maas);//feride hanım maası :100000
        // 2.yol
        int boy; // int data type boy adında bir variable tanımlandı -> declaration
        //  System.out.println(boy);// CTE-> değer atanmamış variable herhangi bir action alamaz
        boy = 190;// öncesinden declaration(tanımlanan) variable 190 değeri atandı-> assaignment
        System.out.println("boy uzunluğunuz: "+boy);//boy uzunluğunuz: 190

        // 3. yol
        int yevmiye, kilo, tecrube;// birden çok aynı data type variable tanımlandı-> declaration
        yevmiye=400;
        kilo=99;
        tecrube=7;// öncesinden decleration(tanımlanan) variable  değerleri atandı-> assaignment

        // cincix->
        int gunluk=550,agırlık=88,experiance=10;// birden çok aynı data type hem tanımlandı hemi de değeri atandı
        System.out.println("gunluk ödemeniz : "+gunluk +" etiniz budunuz : " +agırlık +" tecrube yılınız : "+ experiance);//
        // Cısss -> öncersinden tanımlana bir variable tekrara tanımlanamaz... CTE
      //  int yas=37;// CTE-> already exists daha önceden tanımlanmış
        yas=55;// tanımlanmış varible'a yeni değer ataması yapıldı-> deper değiştirildi

    }//main sonu
}//Class sonu
