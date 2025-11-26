package j08_Loops.Loop01_FoorLopp.Tasks;

public class Task05 {
    public static void main(String[] args) {
          /*
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        şekli print eden code create ediniz
         */

// Sesli dusunelim : 5 kez sutun da yazdirilmis
        // 6 kez de satirda bir yazdirma var.

        for (int i = 1; i <=6; i++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.print("# "); // yanyana yazdirmak icin ln silinir
            }
            System.out.println(); // satir atlama
        }

    }
}
