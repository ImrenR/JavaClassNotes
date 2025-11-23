package j04_JavaOperators.j01_AritmeticOperators;

public class C02_IncrementDecrement {
    /*
   Increment-> bir variable'in degerini toplama veya carpma işlemleri ile artırılmasıdır.
   Decrement-> bir variable'in degerini cikarma veya bolme işlemleri ile azaltılmasıdır.
       */
    public static void main(String[] args) {

        System.out.println("   ***   Increment-> Arttırma   ***   ");

        int a = 1;
        System.out.println(a);//1
        System.out.println(a++);//1  önce a print sonra a arttırlır-> a=2

        System.out.println(a);// a son hali -> a=2

        System.out.println(++a);// 3 önce a'yı bir artırır sonra arttırılmış a print edilir -> a=3
        System.out.println(a);//3


        a = 5;
        System.out.println(a++ + ++a);// 5+7=12
        System.out.println(a);//7


        System.out.println("   ***   Decrement-> Azaltma   ***   ");


        int b = 3;

        System.out.println(b);//3
        System.out.println(--b);//2 -> b=2
        System.out.println(b--);//2 ->b=1
        System.out.println(b);//1

        System.out.println("   ***   s1   ***   ");
        int x = 20;
        int y = 15;
        System.out.println(++x + y--);//
        System.out.println("x = " + x);//
        System.out.println(y);//
        System.out.println("   ***   s2   ***   ");
        int k = 5;
        int result=++k + k++ +k++ +--k +k-- +k;
        System.out.println("result = " + result);//

    }
}


