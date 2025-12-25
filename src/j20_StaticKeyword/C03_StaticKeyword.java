package j20_StaticKeyword;

public class C03_StaticKeyword {//Class level

    int ogrenciId; // instance obj variable
    static int ogrncSayisi; // static class variable

    public C03_StaticKeyword(){
        ogrncSayisi++; // bu const her call edildiginde yani obj create edildiginde =>
                       // =>ogrSayisi stattic variable kalici olarak 1artitirilir.
        ogrenciId =1; // bu const her call edildiginde yani obj create edildiginde =>
                          // =>ogrenciId create edilen obj icin gecici olarak 1 artitirilir.
    }

    public static void main(String[] args) {//main level
        System.out.println("obj a oncesi = " + ogrncSayisi);
               C03_StaticKeyword a = new C03_StaticKeyword(); // a objsi create edildi
        System.out.println("a bj sonrasi = " + ogrncSayisi);
               C03_StaticKeyword e; // data type ve name girilmis dec edilmis ama assignment edilmemis
        // e obj icin constructer call edilmez.
        C03_StaticKeyword b= new C03_StaticKeyword();
        C03_StaticKeyword c= new C03_StaticKeyword();
        C03_StaticKeyword d= new C03_StaticKeyword();
        System.out.println("obj abcd sonrasi ogrncSayisi = " + ogrncSayisi); //4
        System.out.println("a.ogrenciId = " + a.ogrenciId); //1
        System.out.println("b.ogrenciId = " + b.ogrenciId);    //1
        System.out.println("c.ogrenciId = " + c.ogrenciId);       //1
        System.out.println("d.ogrenciId = " + d.ogrenciId);          //1
    }//main sonu
}//Class sonu
