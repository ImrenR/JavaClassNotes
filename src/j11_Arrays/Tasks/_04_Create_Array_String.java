package j11_Arrays.Tasks;

public class _04_Create_Array_String {

    public static void main(String[] args) {

        /*
        String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"
        Array'daki eleman sayısını yazdırınız.
        Cevap 4 olmalı.
         */

        // Kodu aşağıya yazınız..
String[] city = {"New Jersey", "New york", "Boston", "California"};

int elemanSayisi = 0;

        for (int i = 0; i < city.length; i++) {
            elemanSayisi++; //count : elemanlari saydirma yontemi
        }
        System.out.println(elemanSayisi);
    }
}
