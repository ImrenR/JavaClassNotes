package j12_ArrayList.Tasks;

import java.util.ArrayList;

public class Task16 {

    /*
      Task:

    Create 2D ArrayList which can store String ArrayLists
    Create 3D ArrayLists which are Employees, Employers, Companies
    Store this 3 ArrayList in 2D ArrayList
    String ArrayList'leri depolayabilen 2D ArrayList oluşturun
    Çalışanlar, İşverenler, Şirketler olmak üzere 3 DiziListesi oluşturun
    Bu 3 ArrayList'i 2D ArrayList'te saklayın
     */

    public static void main(String[] args) {
        ArrayList<String> calisanlar = new ArrayList<>();
        calisanlar.add("Ali");
        calisanlar.add("Ayse");
        calisanlar.add("Mehmet");

        ArrayList<String> isverenler = new ArrayList<>();
        isverenler.add("ABC Ltd");
        isverenler.add("XYZ Inc");

        ArrayList<String> sirketler = new ArrayList<>();
        sirketler.add("TechCorp");
        sirketler.add("Foodies");

        //  2D ArrayList oluştur ve yukarıdakileri ekle
        ArrayList<ArrayList<String>> ikiDList = new ArrayList<>();
        ikiDList.add(calisanlar);
        ikiDList.add(isverenler);
        ikiDList.add(sirketler);
        //  Yazdır
        System.out.println("2D ArrayList: " + ikiDList);
      //  Örnek: Sadece calisanlar
        System.out.println("Calisanlar: " + ikiDList.get(0));
        // Örnek: Sadece ilk isveren
        System.out.println("Ilk isveren: " + ikiDList.get(1).get(0));
    }
}
