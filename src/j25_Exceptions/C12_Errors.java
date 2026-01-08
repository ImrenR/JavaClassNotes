package j25_Exceptions;

public class C12_Errors {

    //==> ERROR ORNEGI

    public static void recurse(){
        recurse(); // StackOverFlowError verir
    }
    public static void main(String[] args) {
       // System.out.println(20/0);// RTE->ArithmeticException : unchecked excp
       // String  str="Haluk;// CTE -> checked excp.
        // Error ->handle dilemeyen checked,  code ile çözülemeyen sistem kaynaklı(donanım hard ware pc mimari)
        // buyuk hatalardır. öngörülemez ancak gerçekleştiğinde stop axecutşon yapar app. durur

        /*
* Exception → Trafik kazası gibi. Plan yapabilir, handle edebilirsin (try-catch).
*Error → Deprem gibi. Önceden önlem alabilirsin ama gerçekleşince durduramazsın.
* */


        //==> ERROR

        recurse();
        System.out.println("Bu satir calismaz");
        // ==> EXCEPTION ORNEGI
int a =10;
int b=0;

try{
    System.out.println("a/b = " + a / b);
}catch (ArithmeticException e){
    System.out.println("e.getMessage() = " + e.getMessage()); // = / by zero
}
        System.out.println("program devam ediyor");

    }
}
