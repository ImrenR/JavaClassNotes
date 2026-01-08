package j08_Loops.Loop01_FoorLopp.Tasks;

public class Task32 {
    public static void main(String[] args) {
        /*

        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
        şeklipriint eden code create ediniz

         */

       // ipucu : artis ve azalis kisimlarini 2 ayri nested loop ile yapmalisiniz

        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 3; i >=1; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
