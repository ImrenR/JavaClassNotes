package j14_Varargs;

public class Task06 {

  public  static void main() {

        //Create a method called printNumbers that accepts any number of integers using varargs
        // and prints each number using a for-each loop.

        printNumbers(45,34,56,34,67,354,24,24,67);
    }

    private static void printNumbers(int...a) {

        for(int hand:a){
            System.out.println(hand);
        }


    }


}
