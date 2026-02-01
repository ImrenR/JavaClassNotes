package j10_MethodCreation.Tasks;

public class Task19 {

    public static void main(String[] args) {
        /*
   task->
   INTERVIEW SORUSU !!!
   1'den 100'e kadar hic rakam  kullanmadan sayilari print eden METHOD create ediniz

    */

printEt();


    }

    private static void printEt(){


        char one = 'a' / 'a'; // 1
        char two = (char) (one + one); // 2
        char three = (char) (one + two); // 3
        char four = (char) (two + two); // 4
        char five = (char) (two + three); // 5
        char six = (char) (five + one); // 6
        char seven = (char) (five + two); // 7
        char eight = (char) (five + three); // 8
        char nine = (char) (five + four); // 9
        char ten = (char) (five + five); // 10



        // 1'den 100'e kadar sayıları yazdırıyoruz
        for (int i = one; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }
}
