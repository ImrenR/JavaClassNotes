package j10_MethodCreation.Tasks;

public class Task24 {

    public static void fibonacciYazdir(int sayi) {
        int a =0;
        int b= 1;

        System.out.println("Fibonacci : ");

        while(a<=sayi) {
            System.out.println(a + " ");
            int c = a +b; // 3c = 1 a+ 2b
            a=b; // a yi 2 ye atadim
            b=c; // b yi de 3 e atadim
        }
    }
    public static void main(String[] args) {
        fibonacciYazdir(8);
/*
       task-> girilen sayıya kadar olan Fİbonacci dizisi elemalarını print eden METHOD create ediniz.
       Fibonacci dizisi :0, 1, 1, 2, 3, 5, 8, 13, 21, 34
*/








    }
}
