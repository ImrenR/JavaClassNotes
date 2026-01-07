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

        Scanner input =new Scanner(System.in);
        System.out.println("1. sayiyi giriniz: ");
        int num1= input.nextInt();
        System.out.println("2. sayiyi giriniz: ");
        int num2= input.nextInt();


        int bolum=num1/num2;
        System.out.println("bolum = " + bolum);


        System.out.println("Bu print okunuyorsa application calismistir");
    }// main sonu



}//Class sonu
