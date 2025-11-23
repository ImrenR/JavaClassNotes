package j102_OCA.Q065;

public class Q065 {
	public static void main(String[] args) {
        float var1 = (12_345.01<= 123_45.00)? 12_456: 124_56;// atama yapıldığı an tam sayı değilse f belirtmek gerekli
        float var2 = var1 + 1024;
        System.out.print(var2);
        float a=23;//  tam sayı ise f,l,d gerekli değil
        float b=23.3f;
        float c=a+b;
        System.out.println("c = " + c);


    }

}
//Answer D
/**
 * What is the result?
A. An exception is thrown at runtime.
B. Compilation fails.
C. 13480.0
D. 13480.02
Answer: C
 */
 
