package j12_ArrayList.Tasks;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task02_ÖğrtNot {
    public static void main(String[] args) {
          /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */
       Scanner scan = new Scanner(System.in);

       List<Double> notlar = new ArrayList<>();

        System.out.println("Kac ogrencinin notunu gireceksiniz?");
        int ogrenciSayisi = scan.nextInt();

 int i=1;
 while(i<=ogrenciSayisi) {
     System.out.println(i + ". ogrencinin notunu giriniz : ");
     notlar.add(scan.nextDouble());
     i++;
 }

 double ort = getOrtalama(notlar);
        System.out.println("ort = " + ort);

    int ortUstuSayisi=  getOrtUstuOGrenciSayisi(notlar,ort);
        System.out.println("ortUstuSayisi = " + ortUstuSayisi);
    }

    private static int getOrtUstuOGrenciSayisi(List<Double> notlar, double ort) {
        int ortOgrenciSayisi = 0;
        for(double avuc: notlar) {
            if(avuc>ort) {
                ortOgrenciSayisi++;
            }
        }
        return ortOgrenciSayisi;

    }

    private static double getOrtalama(List<Double> notlar) {
       double toplam=0;

        for(double avuc : notlar){
         toplam +=avuc;
        }
        return toplam/notlar.size();
    }


}
