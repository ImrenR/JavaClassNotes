package j14_Varargs;

public class Task05 {
    public static void main(String[] args) {
        /*
        Bir okuldaki ogrencilerden ders secmesi isteniyor.
        Alınann ders saati sayısının 12'yi gecmemesi isteniyor.
        Buna gore;
        Asagida ders saatleri verilen derslerden istenildiği kadar seçildiğinde
         ders saatleri toplamı 12'yi gecerse "AGAM Limiti astiniz";
        12'yi gecmezse "AGAM gayet başarılı :)" print eden METHOD create ediniz
        Matematik :4 saat
        Geometri : 2 saat
        Fizik : 3 saat
        Kimya : 3 saat
        Biyoloji : 3 saat
        Edebiyat : 2 saat
        Tarih : 2 saat
        Cografya : 2 saat

         */
        int matematik =4;
        int geometri=2;
        int fizik=3;
        int kimya=3;
        int biyoloji=3;
        int edebiyat=2;
        int tarih=2;
        int cografya=2;

basari(4,2,3,3,3,2,2,2);

    }

    public static void basari(int...x){
        int toplam=0;
        for (int avuc:x) {
            toplam += avuc;
        }

        if (toplam>12){
                System.out.println("Agam limiti astiniz");
            }else System.out.println("gayet basarili");


    }

}
