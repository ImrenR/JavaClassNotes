package j25_Exceptions.Tasks.Task04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OkulMain {
    static void main() {

Scanner input= new Scanner(System.in);

Clarusway okul= new Clarusway("It School",2);


while(!okul.isOkulDolu()) {


    try{

        System.out.println("Ad : ");
        String ad = input.nextLine();

        System.out.println("Soyad : ");
        String soyad = input.nextLine();

        System.out.println("Yas : ");
        int yas = input.nextInt();
        input.nextLine(); // enter tusunu temizlemek icin



        if(yas>15){
            throw new YasException("Yas 15 ten buyuk olamaz!");
        }

        It ogrenci= new It(ad,soyad,yas);
        okul.ogrenciEkle(ogrenci); // it den gelen ogrenci bilgileri ogrenci metodunudaki array e dolar


    } catch (YasException e) {
        System.out.println("HATA = " + e.getMessage());
        System.out.println("Lutfen tekrar ogrenci giriniz !");
    } catch (Exception e) {
        System.out.println("Gecersiz giris !");
        input.nextLine();
    }


}

  System.out.println("Okul dolu !");
for (It ogrenci: okul.getOgrenciler())
{
    System.out.println(ogrenci);
}

    }

}
