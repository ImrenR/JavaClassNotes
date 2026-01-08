package j25_Exceptions;

public class C09_CheckedExceptionCreate {
    /*
       Convention Named -> Class name sonuna "Exception" kullanılır.
       "checked exception“ create etmek için , "Exception" class’ına extends edilmeli.
       "String" parametreli olan bir constructor’ın ilk satırına super(); create edilmeli
         Java’da exception’lar ikiye ayrılır:

  ==> Unchecked Exception → RuntimeException’dan türeyenler. Örnek: NullPointerException, IllegalArgumentException.
Bunları try-catch kullanmadan atabilirsin. Compiler zorlamaz.

  ==>  Checked Exception → Exception sınıfından türeyenler ama RuntimeException dışındaki.
Bunları method signature’da ya throws ile bildirmek ya da try-catch ile yakalamak zorundasın.
Örnek: IOException, SQLException.

EnrolIdException adında yeni bir exception sınıfı yarattık.
extends Exception → Bu sınıf checked exception olur. Yani Java bunu “kontrol et” der.

        */

    //Custom exception
    static class EnrolIdException extends Exception {
    public EnrolIdException(String message){
     super(message); // Ust sinif olan Exception a mesaj gonderildi
 }


    }

    //Method
 public static void enrollStudent(int id) throws EnrolIdException {
        if(id<=0){
            throw new EnrolIdException("ID negatif veya sifir olamaz");
        }
     System.out.println("Ogrenci basariyla kayit oldu " + id);


 }

    static void main() {
        try{
            enrollStudent(0);
        } catch (EnrolIdException e) {
            System.out.println("Message 1 icin = " + e.getMessage());
        }
        try {
            enrollStudent(5); // dneedi ve catch e gitmeden => Ogrenci basariyla kayit oldu 5 ciktisini aldik
        } catch (EnrolIdException e) {
            System.out.println("Message 2 icin= " + e.getMessage());
        }

    }
}


