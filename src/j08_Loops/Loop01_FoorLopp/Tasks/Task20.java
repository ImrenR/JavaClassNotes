package j08_Loops.Loop01_FoorLopp.Tasks;

public class Task20 {

    public static void main(String[] args) {


//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15   şekli print eden code create ediniz.

// has 5 rows(yukardan asagi) , nested for loops , column increases by 1 2 3 4 5


       int[][] arr= new int[5][5];
       int num=1;

        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                arr[j][i]=num++;

            }

        }

        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(arr[i][j]+ " ");

            }
            System.out.println();

        }

    }
}
