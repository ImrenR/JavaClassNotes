package j14_Varargs;

public class Task11 {
    static void main() {
        //Create a method printPositiveNumbers that prints only positive numbers from varargs.

        printPositiveNumbers(-45, -67, 67, 89, 34, -1, -2);
    }

    private static void printPositiveNumbers(int... x) {

        for (int hand : x) {
            if (hand > 0) {


                System.out.println("hand = " + hand); // post sayilari print eder
            }

        }
    }
}
