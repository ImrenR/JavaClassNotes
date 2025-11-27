package j08_Loops.Loop01_FoorLopp.Tasks;

public class Task13 {

    public static void main(String[] args) {
         /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli print eden code create ediniz..

        */

// this pattern has 6 column and A=65 in ASCII

        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print((char) ( 65 + i) + " ");
            }
            System.out.println();
        }


    }
}
