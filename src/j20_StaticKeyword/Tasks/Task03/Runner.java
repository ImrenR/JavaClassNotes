package j20_StaticKeyword.Tasks.Task03;

import java.util.ArrayList;

public class Runner {
    /*
    Task 03 ->
    Lesson Class :  fields : name, credit (1-10 arasında değer almalı) ==> DONE
    Student Class : fields : name, maxCredit,
                            dersleri(Lesson class obj) saklayacak list ==> DONE
                   derslerin toplam kredi miktarını return eden
                   toplamKredisi method   ==> DONE
    Runner Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin alabileceği ve
                       alamayacagı dersleri print eden code create ediniz

     */

    public static void main(String[] args) {

        Lesson matematik = new Lesson("Matematik",4);
        Lesson fizik =new Lesson("Fizik", 4);
        Lesson kimya=new Lesson("Kimya",5);

        Student ogrenci=new Student("Ahmet",10);

        ogrenci.dersEkle(matematik);
        ogrenci.dersEkle(fizik);
        ogrenci.dersEkle(kimya);

        System.out.println("ogrenci.toplamKredisi() = " + ogrenci.toplamKredisi());


    }
}
