package j25_Exceptions.Tasks.Task04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OkulMain {
    static void main() {

        Scanner scanner = new Scanner(System.in);
Clarusway okul= new Clarusway("It School",3);


while (!okul.isOkulDolu()) {
    try{
        System.out.println("Ad giriniz:");
        String ad = scanner.nextLine();

        System.out.println("Soyad giriniz: ");
        String soyad= scanner.nextLine();

        System.out.println("Yas  giriniz : ");
        int yas = scanner.nextInt();
        scanner.nextLine(); // buffer temizleme

        if(yas>15){
            throw new YasException("Yas 15 ten buyuk olamaz");
        }

        It ogrenci = new It(ad,yas,soyad); // It classindaki constructor sirasi onemlidir
        okul.ogrenciEkle(ogrenci);


    }catch (YasException e){
        System.out.println("HATA = " + e.getMessage());
    }catch (Exception e){
        System.out.println("Gecersiz giris");
        scanner.nextLine();
    }
}


        System.out.println("Okul dolu!");
        System.out.println("Eklenen ogrenciler : ");

        for(It ogrenci : okul.getOgrenciler()) {
            System.out.println(ogrenci);
        }


    }

}
