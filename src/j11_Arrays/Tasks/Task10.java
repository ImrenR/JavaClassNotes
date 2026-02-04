package j11_Arrays.Tasks;

import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir METHOD create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */
int [] sayilar = {1, 2, -3, 4, -5, 6};

      isaretDegistir
              (sayilar);



    }

    private static void isaretDegistir(int[] sayilar) {
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i]= -sayilar[i];

        }
        System.out.println(Arrays.toString(sayilar));
    }
}
