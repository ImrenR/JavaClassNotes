package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;

public class Task15 {

    /* TASK :
    100 den kucuk asal sayilari print eden  code create ediniz.
     */
    public static void main(String[] args) {

        System.out.println("100 den kucuk asal sayilar : ");

        for (int i = 2; i < 100; i++) { // 2 den baslariz

            if(isAsal(i)){
                System.out.println("i = " + i);
            }
        }
    }

    private static boolean isAsal(int n) {
        if(n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if(n % i == 0) {
                return false;
            }

        }
        return true;
    }
}
