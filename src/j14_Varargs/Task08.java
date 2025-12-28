package j14_Varargs;


public class Task08 {
    static void main() {
        //Create a method findMax that accepts varargs of
        // integers and returns the largest number.
        System.out.println("MaxNumber of int = " + findMaxNum(56, 78, 90, 123, 1234, 2, 3));
//1234

    }

    private static int findMaxNum(int...x) {

        int maxNumber = 0;
        for (int avuc:x){
            if (avuc>maxNumber){
                maxNumber=avuc;  //once maxNumber i yazariz cunku esittirden sonraki var maxNumber a atanir.
                                 // avuc = maxNumber yazmak maxNumber degerini avuca atamak demektir. Logic hatasi olur
            }

        }
        return maxNumber;
    }


}

