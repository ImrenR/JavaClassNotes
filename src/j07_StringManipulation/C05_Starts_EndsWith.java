package j07_StringManipulation;

import java.util.Scanner;

public class C05_Starts_EndsWith {
    public static void main(String[] args) {
            /*
          startsWith()
          Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
          String'in basladigi characteri dogrular
          endsWith()
          Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */
String str = "Hello Java";

//startWith() ornegi
        System.out.println(str.startsWith("Hello"));
        System.out.println(str.endsWith("va"));
        //Task-> girilen e-mail hesabının  @gmail.com içermiyorsa "lütfen gmail hesabı giriniz"
        // @gmail.com ile  bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz print eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email");
        String myEmail= input.nextLine();

    if (!myEmail.contains("@gmail.com")){
        System.out.println("lutfen gmail hesabi giriniz");
    }else if (myEmail.endsWith("@gmail.com")){
        System.out.println("Hesabiniz onaylandi");
    }else {
        System.out.println("Gecerli hesap giriniz");
    }

    }
}
