package j02_DataTypes_WrapperClass;

public class C04_WrapperClass {
    /*
           Note: Java primitive lere method'lar ekleyerek yeni bir
                 yapi olusturdu, bu yapiya "Wrapper Class"
                 Primitive         Wrapper
                    byte     ==>    Byte
                    short    ==>    Short
                    ** int   ==>    Integer
                    long     ==>    Long
                    float    ==>    Float
                    double   ==>    Double
                    boolean  ==>    Boolean
                    ** char  ==>    Character
        */
    public static void main(String[] args) {
        /*
        Java'da vir değişkenin data type için getClass() meth kullanılır.Bu meth o nesne(obj)
        hangi class'dan uretildiğini verir
         */
        String str = "javaCAN";
        int yas = 48;
        double pi = 3.14;

        System.out.println(str.getClass());//class java.lang.String->str'nin tanımlandiği Class
        // System.out.println(yas.getClass());// CTE -> yas primitive oldg için class'ı yoktur
        // System.out.println(pi.getClass());// CTE -> pi primitive oldg için class'ı yoktur.
        /*
        Integer.valueOf(yas) veya Double.valueOf(pi) ifadeleri kullanılarak ilkel veri tipleri
        Wrapper class'a dönüştürülerek Class meth kullanılabilir
         */
        String isim = "Mustafa";
        System.out.println(isim);//Mustafa
        System.out.println(isim.toUpperCase());//MUSTAFA

        /*
        non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
ancak primitive data turlerinin boyle bir ozelligi yoktur
primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
ara çözüm imkanı sunmuştur.
         */

// task-> id ve tc String değerlerini toplamını print code create ediniz..
        String id = "1453";
        String tc = "1234567";
        System.out.println(id + tc);//14531234567 != 1453+1234567

        Integer yeniID = Integer.valueOf(id);// String olan id integere cevirilir
        System.out.println("yeniID = " + yeniID);//yeniID = 1453
        Integer yeniTc = Integer.valueOf(tc);//String olan tc integere cevirldi
        System.out.println("yeniTc = " + yeniTc);//yeniTc = 1234567
        System.out.println(yeniTc + yeniID);//aritmetik toplama : 1236020

        String okuNo = "3435a";
        // int okulno=3435a;
        //  int yeniOkulNo=Integer.valueOf(okuNo);//okulNo integere atandı->Run Time Exception çalışma sırasında oluşan hata
        //  System.out.println("yeniOkulNo = " + yeniOkulNo);//
        System.out.println("Agam bu çıktıyı okuduysan code cincix dewamkeee");

        // task-> byte short int data type max ve min değerlerini print eden code create ediniz.
        Byte bytMaxDeger = Byte.MAX_VALUE;
        Byte bytMinDeger = Byte.MIN_VALUE;
        System.out.println("bytMaxDeger = " + bytMaxDeger);//127
        System.out.println("bytMinDeger = " + bytMinDeger);//-128

        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);//  32767
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);// -32768

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);// 2147483647
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);// -2147483648
        int a = 5;
        System.out.println("a = " + a);// 5
        System.out.println(5);// 5

    }
}
