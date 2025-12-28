package j14_Varargs;

public class Task09 {
    static void main() {
        //Create a method countEvenNumbers that accepts varargs
        // and returns how many numbers are even.

        System.out.println("countEveNumber(23,45,67,44,22,89,66,12,2,4,8) = " + countEveNumber(23, 45, 67, 44, 22, 89, 66, 12, 2, 4, 8));
    } // 7

    private static int countEveNumber(int...a) {
        int totalEvenNumbers=0;
        for (int hand:a){
            if(hand%2 == 0){
                totalEvenNumbers++; // eger bir kosulda istenilen sayilarin kac tane oldugunu istiyorsa count++ yapilir
            }
        }
        return totalEvenNumbers;
    }
}
