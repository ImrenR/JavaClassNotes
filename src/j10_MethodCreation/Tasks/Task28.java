package j10_MethodCreation.Tasks;

import java.util.Random;
import java.util.Scanner;

public class Task28 {
    /*
    task->
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
     */

    public static void main(String[] args) {

        int max=100;
        int randomNumber= randomNum(max);
        System.out.println("randomNumber = " + randomNumber);

    }

    public static int randomNum(int max){
        Random random =new Random();
        return random.nextInt(max + 1);
    }
}
