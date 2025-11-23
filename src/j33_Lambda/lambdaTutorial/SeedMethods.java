package j33_Lambda.lambdaTutorial;

public class SeedMethods {

    public static  void intYazdir(int a){// seed->tohum meth...Allahın gundi methodu
        System.out.print(a+" ");// parametredeki int deger bir boşluk ile print edilir
    }
    public static  void strYazdir(String  a){// seed->tohum meth...Allahın gundi methodu
        System.out.print(a+" ");// parametredeki str deger bir boşluk ile print edilir
    }
    public  static boolean ciftMi(int a){
        return a%2==0;
    }
    public  static boolean cift35Kck(int x){


        return x<35 && x%2==0;
    }
    public  static  int kareAl(int t){
        return t*t;
    }

    public  static int minBul(int a,int b){
        return  a<b?a:b;
    }
    public  static boolean tekMi(int a){
        return a%2==1;
    }
}
