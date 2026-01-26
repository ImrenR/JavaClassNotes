package Projects.P03_kitapYonetimi02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class islemler {

    static Scanner input = new Scanner(System.in);
    List<Kitap> kitapList = new ArrayList<>();
    boolean flag = false;
    int secilenIslem;

    public void menu() {
        System.out.println("Kitap Yönetimi App'e Hoş Geldiniz\n*** ISLEMLER MENUSU ***" +
                "\n1-KITAP EKLE\n2-NUMARA ILE KITAP GORUNTULE\n3-BILGI ILE KITAP GORUNTULE\n4-NUMARA ILE KITAP SIL" +
                "\n5-TUM KITAPLARI LISTELE\n6-CIKIS\nLutfen yapmak istediginiz islemi seciniz : ");

        secilenIslem = input.nextInt();
        input.nextLine(); // dummy
        switch (secilenIslem) {
            case 1:
                kitapEkle();
                input.nextLine(); // dummy
                break;
            case 2:
                numIleKitapGoruntule();
                input.nextLine(); // dummy
                break;
            case 3:
                bilgiIleKitapGoruntule();
                input.nextLine(); // dummy
                break;
            case 4:
                numIleKitapSil();
                input.nextLine(); // dummy
                break;
            case 5:
                kitaplariListele();
                break;
            case 6:
                cikis();
        }
    }

    private void bilgiIleKitapGoruntule() {
    }

    private void numIleKitapSil() {
    }

    private void kitaplariListele() {
    }

    private void numIleKitapGoruntule() {
    }


    public  void kitapEkle() {
        System.out.println("Eklemek istediginiz kitabin ismi : ");
       // System.out.print(""); // dummy
        System.out.println("Eklemek istediginiz kitabin yazar ismini giriniz : ");
       // System.out.print(""); // dummy
        System.out.println("Kitap Fiyatini giriniz : ");

    

  kitapList.add(new Kitap(input.nextLine(), input.nextLine(), input.nextInt()));
   
        System.out.println("Kitap basariyla eklendi!");
        System.out.println("kitapList = " + kitapList);
        islemeDevamMi();

}
    private void islemeDevamMi(){
        System.out.print("Baska bir islem yapmak istiyor musunuz?(E/H) : ");
        
       if (input.next().equalsIgnoreCase("E")){
           menu();

       }else if(input.next().equalsIgnoreCase("H")){

            cikis();

        }else{

           System.out.println("hatalı giriş yaptınız tekrar deneyiniz...");
           islemeDevamMi();
       }

       }

    public void cikis() {
        System.out.println("Ugradigin icin tesekkurler, yine bekleriz okursever!");
    }

}
