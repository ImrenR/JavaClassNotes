package j08_Loops.Loop01_FoorLopp.Tasks;

public class Task31 {

    public static void main(String[] args) {
        /*
            1
            1  2
            1  2  3
            1  2  3  4.

         */

        for (int i = 1; i <=4 ; i++) { // satir
            for (int j = 1; j <=i ; j++) { // kolon
                System.out.print(j + " ");
            }
            System.out.println(); //alt satira gecer
        }

    }
}
