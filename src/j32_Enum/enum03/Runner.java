package j32_Enum.enum03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    static void main() {
        // Bir kitap class i create ediniz, fields : name ve kategori(ENUM)
        // KitapKategori adinda bir enum olsturunuz Klasik Roman Fantazei Tarih
        // uc kitap tanimlayiniz bir arrayliste atiniz
        // Bir kategoriye listeleyiniz

   Kisi k1 = new Kisi();
   k1.name= "Imren";
   k1.kategori=Kategori.ROMAN;


        Kisi k2 = new Kisi();
        k2.name= "ali";
        k2.kategori=Kategori.FANTEZI;

        Kisi k3 = new Kisi();
        k3.name= "tulin";
        k3.kategori=Kategori.CLASSIC;

        List<Kisi> kutuphane = new ArrayList<>(Arrays.asList(k1,k2,k3));

        for (Kisi avuc: kutuphane){
            if(avuc.kategori == Kategori.ROMAN ) {
                System.out.println(avuc.name);
            }
        }
    }
}
