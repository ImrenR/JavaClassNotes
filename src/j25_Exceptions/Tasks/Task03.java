package j25_Exceptions.Tasks;

import java.util.Scanner;

public class Task03 {


    public static double ortalama(int v, int f){
        if(v>100 || f>100 ||  v<0|| f<0){
            throw new ArithmeticException("Notlar 0-100 arasında olmalı");
        }
        return v*0.4 + f*0.6;
    }
    public static void main(String[] args) {
        /*
      int v  - int f  isminde 2 adet parametresi olan 'ortalama' isminde bir method create ediniz.
        int v = vize
        int f = final

        Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
        Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını return edin.
        Diğer durumlarda ise,
        vizenin yüzde 40 ını, finalin yüzde 60 toplayarak ortalama hesplayan pr create ediniz.
        vizeye 120, finale 80 girin.

        Programın çalışmasını sağlayın. (handle edin)
         */
        Scanner input = new Scanner(System.in);
        System.out.println("vizenizi girinizi : ");
        int v = input.nextInt();;
        System.out.println("Finalinizi giriniz : ");
        int f= input.nextInt();

        try{
            double ort =ortalama(v,f);
            System.out.println("ortalama = " + ort);
        }catch (ArithmeticException e){
            System.out.println("Hata = " + e.getMessage());
        }

    }//main sonu

 }//Class sonu



































