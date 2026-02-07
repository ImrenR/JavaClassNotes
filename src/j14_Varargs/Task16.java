package j14_Varargs;

public class Task16 {
    static void main() {
        //Create a method called calculateStats that accepts varargs of integers and prints:
        //Total count of numbers
        //Sum
        //Average (as double)
        //Maximum
        //Minimum

        calculateStats(56,54,9,8,7,45);
    }

    private static void calculateStats(int...x) {
        int toplam=0;
    int maxNum=0;
    int minNum=0;
     for (int avuc: x) {
         toplam+=avuc;
         if(avuc > maxNum) {
             maxNum = avuc;
         }
         if(avuc <minNum) {
             minNum = avuc;
         }
     }
double ortalama = (double) toplam / x.length;
        System.out.println("ortalama = " + ortalama); // Average
        System.out.println("maxNum = " + maxNum); // Max num
        System.out.println("minNum = " + minNum); // Min num
        System.out.println("toplam = " + toplam); // Sum
        System.out.println("x.length = " + x.length); // total count numbers
    }
}
