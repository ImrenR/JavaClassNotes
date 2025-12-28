package j14_Varargs;

public class Task13 {
    static void main() {
        //Create a method countByType that accepts varargs of integers and uses a switch statement to count:
        //
        //1 → count as “ONE”
        //
        //2 → count as “TWO”
        //
        //other numbers → ignore
        //
        //Concepts: switch, loop

        countByType(1,2,3,4,1,2,2,1,2,1,8,9);
    }

    private static void countByType(int...numbers) {
        int countNumOne =0;
        int countNumTwo=0;
        for(int x:numbers){
            switch (x){
                case 1:
                    countNumOne++;
                    break;
                case 2:
                    countNumTwo++;
                    break;
                default:
                    break;

            }
        }
        System.out.println("countNumTwo = " + countNumTwo);
        System.out.println("countNumTwo = " + countNumTwo);
    }
}
