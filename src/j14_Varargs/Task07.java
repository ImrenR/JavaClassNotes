package j14_Varargs;

public class Task07 {
   public static void main() {

        //Create a method sumNumbers that takes varargs of integers and returns their sum.

       System.out.println("Result of sumNumbers = " + sumNumbers(45, 34, 34, 56, 234, 56, 78, 12, 1, 2, 3, 9));
//564
   }

    private static int sumNumbers(int...a) {
       int toplam=0;

       for(int hand:a){
           toplam+=hand;
       }

        return toplam;
    }

}
