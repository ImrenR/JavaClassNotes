package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        // task-> girilen sayının faktöriyelini print code create ediniz
        //falan faktöriyel=1'den falana kadar tamsayıların çarpımı->1*2*3*...*falan
        // 1!=1 . 2!=1*2 3!=1*2*3

               Scanner input = new Scanner(System.in);
               System.out.println("Enter a number");
               int number = input.nextInt();
  int fakt = 1;

        for (int i = 1; i <=number; i++) {
            fakt=fakt*i;

        }
        System.out.print(number + "! =" + fakt);
    }
}
