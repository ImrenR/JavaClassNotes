package j11_Arrays.Tasks;

public class _09_array_second_max {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */

        // Kodu aşağıya yazınız..

 int arr []= {15,25,22,18,30};

 int max = arr[0]; //15
int secondMax = arr[0]; //15

        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]>max) {
                secondMax = max; // 15
                max=arr[i]; //25
            } else if (arr[i] > secondMax && arr[i] !=max) {
                secondMax = arr[i];

            }

        }
        System.out.println("secondMax = " + secondMax);

    }
}
