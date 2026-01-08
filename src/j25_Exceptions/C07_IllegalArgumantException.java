package j25_Exceptions;

import java.util.Scanner;

public class C07_IllegalArgumantException {
    public static void main(String[] args) {
           /*
        ahan da TRİCK kosesinde bugun :)

        "throw" - throws" farkları
        1- "throws" -> main method kapanıs parantezi ile method body acılıs parantezi arasına yazılır.
           "throw" -> method body içinde tanımlanır.
        2- "throws" -> keywordden sonra birden fazla exception tanımlanabilir
           "throw" -> keywordden sonra sadece bir tane exception tanımlanır
        3- "throws" -> keywordden sonra sadece exception class name yazılır
            "throw" ->  keywordden sonra exception obj tanımlanır
        4- "throws" -> keyword method ilk satırda sadece bir kez tanımlanır
            "throw" -> keyword istenildiği kadar method body de tanımlanabilir.
         */


        // IllegalargumentException -> kullanılmasını istenmeyen değerlerde pr hata vermesi isteniyorsa bu excp fırlatılıer
        // ornek : yas datası için negatif değer girilidğinde pr kırılmadan run olması ama girilen değer için excp fırlatması için kullanılır..
//if we are trying to illegal values for some methods in java,we will get IAE

 // Thread t=new Thread();
  // t.setPriority(11); // IAE
      //  System.out.println("t = " + t);
        //  System.out.println("t.getPriority() = " + t.getPriority()); // 5 => however I dont want this priority want to change it


        //FIX =>
        int value=0;
try {
    if (value >= 1) {
        throw new IllegalArgumentException("0 is not bigger than 1");
    } else System.out.println("Array size cant be negative");

}catch (IllegalArgumentException e){
    System.out.println("e.getMessage() = " + e.getMessage());
}

    }//main sonu


}
