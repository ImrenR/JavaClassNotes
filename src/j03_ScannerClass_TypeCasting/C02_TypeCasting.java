package j03_ScannerClass_TypeCasting;

public class C02_TypeCasting {
    /*
         Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirme işlemidir.
                       byte < short < int < long < float < double
         Note 1: Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir
         Note 2: Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir.
     */
    public static void main(String[] args) {

        boolean basarili = true;
        System.out.println("basarili = " + basarili);// true
        String success = String.valueOf(basarili);//Wrapper Class method.
        System.out.println("success = " + success);// true
        // success =basarili;//doğal data type uyum olmadıgı  için CTE

        double sayi1 = 31;
        System.out.println("sayi1 = " + sayi1);//31-> AW

        int sayi2 = 35;
        int sayi3 = 20;

        System.out.println("sayi2/sayi3 = " + (sayi2 / sayi3));// 1 -> AW

        /*
        Java'da iki int değer bulunduğunda sonuç mutlaka int verir.
        Yani bolme sonucu ondalıklı olsa bile AW yaparak int casting..
         */
        byte b = 5;
        int num=b;// k-b->AW

        double d=num;//k-b->AW
        double d1=d/sayi2;

        System.out.println("d1 = " + d1);//

        // Trick-> iki farklı data type isleme girerse AW(k-b-> data casting islem sonucu buyuk data type olarak verilir.


        double d3=31.35;
        System.out.println("d3 = " + d3);//31.35

        int num2= (int) d3;//b-k->Expc.Narr casting :( data kaybı yaşanır bad practice
        System.out.println("num2 = " + num2);//31

        double d4=1234.5678;
        long l= (long) d4;//Expc. Narr casting
        System.out.println("d4 = " + d4);// d4 = 1234.5678
        System.out.println("l = " + l);// l = 1234

    }
}
