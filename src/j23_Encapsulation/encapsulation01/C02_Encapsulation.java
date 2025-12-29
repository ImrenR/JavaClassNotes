package j23_Encapsulation.encapsulation01;

public class C02_Encapsulation {//pojo Class-> obj kalıphane
    /*
   Java'da POJO, "Plain Old Java Object" kısaltmasıyla bilinen, temel bir Java sınıfıdır.
   Bu sınıflar, verileri ve onların işlemlerini tutmak için kullanılır ve genellikle bir
   veritabanı veya bir dosya gibi dış kaynaklardan veri almak veya onlara veri yazmak için
   kullanılır. POJO'lar, sadece getter ve setter metodları ile erişilen özelliklere sahip
   basit bir data objesi olabilirler. POJO'lar, genellikle diğer objeler veya bileşenlerle
    işbirliği yapmak için kullanılırlar ve bu nedenle data aktarım objeleri (DTO) olarak da adlandırılabilirler.
    */

//fields => private olmali cunku encap yapiyoruz

   String name="imren gunes";
   private int id =1001;
  private   String mail="ebikgabik@gmail.com";
    String surname = "Jovanovic";
    // constructor

    public C02_Encapsulation(String name, int id, String mail, String surname) {
        this.name = name;
        this.id = id;
        this.mail = mail;
        this.surname = surname;
    }

    public C02_Encapsulation() { //  psiz constructor
    }

//getter setter methodlari


}
