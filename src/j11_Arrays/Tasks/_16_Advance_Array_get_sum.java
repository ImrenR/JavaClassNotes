package j11_Arrays.Tasks;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */

        //Kodu aşağıya yazınız.
String sayilar = "$12 $23 $10 $2 $5 $2";
// oncelikle sayilari bir arraya atadim ve split ettim.

String [] arr = sayilar.split(" "); // Split by space
// sayilarin toplamini alacagim icin bir variable olusturdum.
        int sum = 0;

        for (int i = 0; i < arr.length ; i++) {
            //remove $
            int number =Integer.parseInt(arr[i].replace("$","")); // Stringi integer e cevirdim.

            // Add to sum
            sum +=number;
        }
        System.out.println("sum = " + sum);
    }
}