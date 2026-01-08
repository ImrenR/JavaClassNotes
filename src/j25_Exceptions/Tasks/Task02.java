package j25_Exceptions.Tasks;

import java.io.IOException;
import java.util.Scanner;

public class Task02 {






    public static void kontrolHava(int sicaklik) throws IOException {
        if(sicaklik<10){
            throw new IOException("Hava Sicakligi 10 derecenin altinda olamaz!");
        }
    }


    public static void main(String[] args) {
           /*
    Task -> girilen hava sıcaklığı 10'un altında ise IOException hatası tanımlayıp hatayı print eden method create
    edip mainde kontrol ediniz.


            */
Scanner input=new Scanner(System.in);
        System.out.println("Hava sicakigi giriniz : ");
        int havaS=input.nextInt();


       try{
           kontrolHava(havaS);
           System.out.println("Hava sicakligi uygun");
       }catch (IOException e){
           System.out.println("e.getMessage() = " + e.getMessage());
       }

    }//main sonu



}//Class sonu
