package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN"
        x karakteri girildiğinde "javaTAR" print eden code create ediniz.
        do-while lopp
       */

        Scanner input = new Scanner(System.in);
        System.out.println("x karakteri girilene kadar devamke");
char ch;

        do {
            ch=input.next().charAt(0); // sadece ilk karakteri al

            if(ch == 'x'){
                System.out.println("javaTAR");
            }else System.out.println("javaCAN");
        }while (ch != 'x'); // x girilene kadar devam !
    }
}
