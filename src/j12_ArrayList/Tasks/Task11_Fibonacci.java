package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task11_Fibonacci {
    /* Task->
    Girilen bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    1-1-2-3-5-8-13-21-34....
    */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int n = input.nextInt();

        List<Integer> fibonacci = new ArrayList<>();

        if (n >= 1) {
            fibonacci.add(1);
        }
        if (n >= 2) {
            fibonacci.add(1);
        }

        int i = 2;
        while (true) {
            int next = fibonacci.get(i - 1) + fibonacci.get(i - 2);
            if (next > n) {
                break;
            }
            fibonacci.add(next);
            i++;
        }

        System.out.println(fibonacci);



    }
}
