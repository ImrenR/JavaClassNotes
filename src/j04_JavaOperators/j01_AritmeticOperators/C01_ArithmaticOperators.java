package j04_JavaOperators.j01_AritmeticOperators;

public class C01_ArithmaticOperators {
    public static void main(String[] args) {
        /*
		 Islem Onceligi:
		  1)üs ve Parantez ici islemler
		  2)Carpma ve bolmeler
		  3)Toplama ve cikarmalar
		 */
        int a = 31;
        int b = 35;
        int c = 20;
        System.out.println("(a+b*c) = " + (a + b * c));//731
        System.out.println("(c/a) = " + (c / a));//0
        System.out.println("((b+(c-2*a))/2) = " + ((b + (c - 2 * a)) / 2));//-3
        System.out.println("((c-a/(b-c))+a*b) = " + ((c - a / (b - c)) + a * b));//1103


        int d = 23;
        double e = 32.32;
        float f = 23.12f;
        System.out.println("(d/e) = " + (d / e));//0.7116336633663366
        System.out.println("(d+e) = " + (d + e));//55.32
        System.out.println("(e/d) = " + (e / d));//1.4052173913043478
        System.out.println("(f/d) = " + (f / d));//1.0052174
        // Trick ->  farklı data type aritmetic yapılınca output buyuk data type atanır...
        int g = 2;
        int h = 3;
        String s = "javaCAN";
        //Task-> g h s variable kullanarak 61javaCAN-1 print eden code create ediniz...
        System.out.println(""+(g * h) + (h - g) + s + (g - h));// 61javaCAN-1

    }
}
