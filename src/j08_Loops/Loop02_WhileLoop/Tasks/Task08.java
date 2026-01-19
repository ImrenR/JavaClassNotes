package j08_Loops.Loop02_WhileLoop.Tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // task->
        // girilen şifrenin asagidaki sartlari kontrol eden code create ediniz.
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" print edin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali


        System.out.println("Enter your password :");
        Scanner input = new Scanner(System.in);
        String sifre= input.nextLine();


        boolean gecerliMi = true;

        if(sifre.length()<10){
            System.out.println("Sifre en az 10 karakter olmali");
            gecerliMi=false;
        }

if(!Character.isLowerCase(sifre.charAt(0))){
    System.out.println("Ilk harf kucuk olmali!");
    gecerliMi= false;
}

if(!Character.isDigit(sifre.charAt(sifre.length()-1))){
    System.out.println("son karakter rakam olmali");
    gecerliMi=false;
}
if(sifre.contains(" ")){
    System.out.println("Sifre bosluk icermemeli");
    gecerliMi=false;
}
if(gecerliMi){
    System.out.println("Sifre basariyla kaydedildi.");
}
    }
}
