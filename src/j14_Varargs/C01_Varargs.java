package j14_Varargs;




public class C01_Varargs {
    public static void main(String[] args) {// main level
        /*
        VARARGS :diva...  :)
        var----variety: cesitlilik args---arguments
        SYNTAX ->
        mathodName(parametre1,parametre2, dataType... dataName) {
        method body....

        }

	        1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır .CISSS -> Diva en son sahne alır
		    2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :CISS -> diva tek olur.iki diva bir ipte yurumez

           Gunun TRICK'i  köşesinde böyün :
           Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
           ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli...
  */
        int sayi1 =15;
        int sayi2 =35;
        int sayi3 =31;
        int sayi4 =34;



        // task01-> verilen 2 int variable toplamını print eden METHOD create ediniz..
        System.out.println("   ***  task01   ***   ");
        System.out.println("topla22(sayi1,sayi3) = " + topla22(sayi1, sayi3));


        // task02-> verilen 3 int variable toplamını print eden METHOD create ediniz..
        System.out.println("   ***  task02   ***   ");
        System.out.println("topla32(12,sayi1,sayi2) = " + topla32(12, sayi1, sayi2));

        // task03-> verilen 5 int variable toplamını print eden METHOD create ediniz.
        System.out.println("   ***  task03   ***   ");
        System.out.println("topla5(1,3,67,89,sayi4) = " + topla5(1, 3, 67, 89, sayi4));
        System.out.println("topla(45,45,67,45,67,45,34,34) = " + topla(45, 45, 67, 45, 67, 45, 34, 34));

        // task04-> .verilen String variable'rın  en fazal karakter bulunduranı  print eden METHOD create ediniz..
        System.out.println("   ***  task04   ***   ");



    }// main sonu

    private static int topla5(int a, int b, int c, int d, int e) {
        return(a+b+c+d+e);
    }

    private static int topla32(int a, int b, int c) {
        return (a+b+c);
    }

    private static int topla22(int sayi1, int sayi3) {
        return  sayi1 + sayi3;
    }
public static int topla(int... a){
        int toplam =0;
        for (int avuc : a){ // baslangic degerin ve sekronun belli degilse for each kullanilir.
            toplam += avuc;
        }
        return  toplam;
}

}// Class sonu
