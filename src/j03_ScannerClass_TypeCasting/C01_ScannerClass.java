package j03_ScannerClass_TypeCasting;


import java.util.Scanner;

public class C01_ScannerClass {

    //Scanner bir Java Class'idir, bu Class'i kullanabilmek icin "import" edilmeli.
    //Scanner Class'i Java nin util kutuphanesindedir.

    // kullanıcıdan veri almak için şu adım takip edilir
    //1. adım-> Scanner class'dan obj create edilir.

    //  Scanner input = new Scanner(System.in);// Scanner classından input isminde değerini System içinden alan bir obj.

    //  2 adım->Kullanıcıdan istenen veri için bildirimde bulunulur->sout("...");
    //  System.out.print("adınızı giriniz :");

    // 3. adım-> kulanıcının girdigi veri data type'ne göre bir variable atanır.
    public static void main(String[] args) {
        // task-> kullanıcının girdigi değere göre karenin alanını print eden code create ediniz.

        //1 adım Scanner obj
        Scanner input = new Scanner(System.in);
        // 2.adım bildirimde bulunmalı...

        System.out.println("Kare alanı için kenar uzunluğu giriniz : ");
        // 3.adım kullanıcının girişi uygun bir variable ata

        int kenarUzunluk =input.nextInt();

        System.out.println("kare alanı : "+(kenarUzunluk*kenarUzunluk));

        int kareAlanı=kenarUzunluk*kenarUzunluk;

        System.out.println("kareAlanı = " + kareAlanı);

        /*
         Task->
         Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
         Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
         1 seker = 1.7 gr
         Ornek : Input : cay sayisi : 10 seker sayisi :12
                 Output : Yilda 12.41 kg seker kullaniyorsunuz
         */
        System.out.println("Agam günda kaç bardak çay içirsen  : ");
        int cayTuketim=input.nextInt();
        System.out.println("Agam çayına kaç şeker atirsen : ");
        int sekerTuketim=input.nextInt();
      double yıllıkSekerSuketim = ((cayTuketim*sekerTuketim)*1.7*365)/1000;
        System.out.println("yıllıkSekerSuketim = " + yıllıkSekerSuketim+" kg");
    }
}
