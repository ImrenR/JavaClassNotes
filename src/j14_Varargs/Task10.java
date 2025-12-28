package j14_Varargs;

public class Task10 {
    static void main() {
       // Create a method printUntilZero that prints numbers from varargs until it finds 0, then stops.

        printUntilZero(45,67,34,0,123,456,78,90);


    }

    private static void printUntilZero(int...x) {
        for (int avuc:x){
            if(avuc == 0){
                break;
            }
            System.out.println("avuc = " + avuc);

        }
    }
}
