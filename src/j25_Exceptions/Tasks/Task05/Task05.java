package j25_Exceptions.Tasks.Task05;

import java.util.Scanner;

public class Task05 {


    public static void  randomSayi(int a,int b) throws Exception {
        int toplam = a+b;
        if(toplam <12){
            throw new Exception("sayi 12 den kucuk ise hata verir");
        }
    }

    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Random1 giriniz:");
        int a= input.nextInt();;
        System.out.println("Random2 yi giriniz:");
        int b= input.nextInt();


        try{
            randomSayi(a,b);
            System.out.println("Sayilarin toplami 12 veya daha buyuk");
        }catch (Exception e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }
}
