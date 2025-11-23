package j04_JavaOperators.j01_AritmeticOperators;

public class C03_MathMethods {
    /*
         Math.abs(a)
         Girilen degerin mutlak degerini verir.

        Math.max(a, b)
        Girilen iki degerden buyuk olani verir.

        Math.min(a, b)
        Girilen iki degerden kucuk olani verir.

        Math.round(a)
        Girilen degerin en yakin tamsayiya yuvarlar.

        Math.sqrt(a)
        Girilen degerin karekokunu verir.

        Math.pow(a, b)
        Girilen a ve b degerini a uzeri b olarak verir.

        Math.ceil(a) 3.1 => 4
        Girilen bir ondalikli sayiyi bir sonraki en yakin tam sayiya yukseltir.

        Math.floor(a) 3.7 => 3
        Girilen bir ondalikli sayiyi bir onceki en yakin tam sayiya indirger.
         */
    public static void main(String[] args) {

        //task-> 81'in karekokunu print eden code create ediniz
        System.out.println(Math.sqrt(81));// 9.0
        //Math.abs
        System.out.println(Math.abs(-55));//55
        //Math.max
        System.out.println("Math.max(1905,1907) = " + Math.max(1905, 1907));//  1907
        // Math.min
        System.out.println("Math.min(24,13) = " + Math.min(24, 13));//  13
        //Math.round
        System.out.println("Math.round(19.03) = " + Math.round(19.03));//19
        System.out.println("Math.round(19.03) = " + Math.round(20.51));//21
        //Math.ceil
        System.out.println("Math.ceil(19.58) = " + Math.ceil(19.58));//20.0
        System.out.println("Math.ceil(19.07) = " + Math.ceil(19.07));//20.0
        //Math.floor
        System.out.println("Math.floor(19.58) = " + Math.floor(19.99));//19.0
        System.out.println("Math.floor(19.07) = " + Math.floor(19.01));//19.0
        // Math.pow
        System.out.println("Math.pow(2,3) = " + Math.pow(2, 3));// 8
        System.out.println("Math.pow(3,2) = " + Math.pow(3, 2)); // 9
        //Math.random-> rastgele 0-1 arası double sayı verir
        System.out.println("Math.random() = " + Math.random());// 0.23531183034422132
        // task -> 0 ile  100 arası rastgele bir int sayı print eden code create ediniz
        int rastgeleSayı = (int) (Math.random()*100);
        System.out.println("rastgeleSayı = " + rastgeleSayı);//
    }
}
