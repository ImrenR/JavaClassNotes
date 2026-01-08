package j25_Exceptions;

import java.util.Scanner;

public class C09_CheckedExceptions1 {

    /*Bir sınıf oluştur: AgeException (Checked Exception) DONE
Eğer kullanıcı yaşı 18’den küçükse exception fırlatsın.
Eğer yaş geçerliyse “Kayıt başarılı” yazsın.

 AgeException sınıfı Exception sınıfından extend edilecek. DONE
 Mesaj alan bir constructor olacak: "Yaş 18’den küçük olamaz!" gibi.
 registerUser(int age) isimli bir method yaz, yaş kontrolü burada olacak.
 main method’da hem hatalı hem doğru değerler için test et.

    */
    static class AgeException extends Exception{

       public AgeException(String message){
           super(message);
    }

public static void registerUser(int age) throws AgeException {
           if(age<18){
               throw new AgeException("Yas 18 den kucuk olamaz !" + age);
           }else System.out.println("Kayit basarili : " + age + " yasindaki kullanici");
}

        static void main() {
            try{
                registerUser(20);
            } catch (AgeException e) {
                System.out.println("e.getMessage() = " + e.getMessage());
            }

            try {
                registerUser(5);
            } catch (AgeException e) {
                System.out.println("e.getMessage() = " + e.getMessage());
            }
        }
    }































}
