package j25_Exceptions;

import java.util.Scanner;

public class C01_ArithmeticException {//Class level

    public static void main(String[] args) {//main level
        //  ArithmeticException -> matematksel(Arithmetic) işlemlerde olusan Run Time Exception type'dir.


     /*
            try - catch içinde yapılan işlemlerden sonra mutlaka çalışması gereken block varsa finally  blok tanımlanır.
            hata alınır ama finaly tanımlanırsa catch çalışmasa bile
            pr akışı devam eder.finally block hata olsa da olmasa da calışır.
            Cloud database ortamlarında bağlantı kesmek için kullanılır.cloud ile connection yazdıgınızda code
//            başarılı bir şekilde çalışırsa işlem bitiiğinde finally block ile connection kapanmazsa maliyet pahalı olur :(
//             */
/*
    1- try-catch kullanıldıgında try block hatasız çalışırsa catch block asla çalışmaz.catch block try block exception yakalarsa calışır
    2- try block catch veya finally block olmadan CTE verir. try block'tan sonra birden fazla catch block tanımlanabilir.
       aynıa anda  sadece bir catch block çalışabilir hiç bir catch block çalışmaya da bilir
    3- parent - child ilişkisi olan catch'lerde child önce yazılmalı aksi halde CTE

     */

        Scanner input =new Scanner(System.in);
        System.out.println("1. sayiyi giriniz: ");
        int num1= input.nextInt();
        System.out.println("2. sayiyi giriniz: ");
        int num2= input.nextInt();


       try{ // hatanin olma ihtimaliniin oldugu kisim
           int bolum=num1/num2;
           System.out.println("bolum = " + bolum);
           System.out.println("Try calisti hem de catch e hic girmeden :) ");
       }
       catch (ArithmeticException e){ // try blockda denenen istisnai durum gerceklesirsa handling block
           System.out.println("1.catch = Sayi 0 ile bolunemez num2 ye baska bir deger veriniz" + e.getMessage());
           // getmessage() metoidu ile / by zero bize cikti da geldi
           // cikti =>  Sayi 0 ile bolunemez num2 ye baska bir deger veriniz/ by zero
       } catch (ArrayIndexOutOfBoundsException ebik){
           System.out.println("2. catch= almayan aray elemani istiyorsun" + ebik.getMessage());
       }catch (Exception falan){ // Exception class => grand Parent (tum exceptionlari kapsayan exception class => Tavsiye edilmez bad practice
           System.out.println("3.catch" + falan.getStackTrace()); // tum exception aciklama referansini verir
       }// hata ya da istisna yakalandiginda aksiyon alacak.


        finally {
           System.out.println("finally den selam");

           /*
    try - catch içinde yapılan işlemlerden sonra mutlaka çalışması gereken block varsa finally  blok tanımlanır.
    hata alınır ama finaly tanımlanırsa catch çalışmasa bile
    pr akışı devam eder.finally block hata olsa da olmasa da calışır.
    Cloud database ortamlarında bağlantı kesmek için kullanılır.cloud ile connection yazdıgınızda code
    başarılı bir şekilde çalışırsa işlem bitiiğinde finally block ile connection kapanmazsa maliyet pahalı olur :(
     */
       }
// Ben nerden bilicem hangi exception oldugunu nasil tahmin edicem ?
        // Exception son ctachdeki hepsini kapsar
        // Spesifik data kullanmak application i hizlandirir. yani ArithmeticExpcetions gibi bunlar spesific datalardir.
        // sondaki catch i de garanti olsun diye yaptik bilemedigimizden





    }// main sonu


    public static class C09_CheckedExceptionCreate1 {


















    }
}//Class sonu
