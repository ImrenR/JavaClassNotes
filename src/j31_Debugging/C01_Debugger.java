package j31_Debugging;

public class C01_Debugger {
    /*
 Debug yapiyorsan, kodu anlamadin demektir.
 Debug yaparken kodu anlamiyorsan, nasil debug yapilir, onu anlamadin demektir.
 Debug yaparken kodu anladigini dusunuyorsan, aslinda debuga ihtiyacin olmadigini anladin demektir.
 Debug etmek kodun mental bir modelinin eksikligine isarettir...


 İki durumda debugger gerekli olabilir:
 *  Mevcut kod devralındığında.
 *  Yeni kod yazıldığında.
 her iki durumda da debugger çalıştırmamaya dikkat edilmeli.
 Amac sıfır debug aktivitesi ile uygulamayı istenilen seviyeye getirebilmek.
 */
static int ebikgabik =17;
    public static void main(String[] args) {
method01();
    }//main sonu

    public static void method01() {
        for (int i = 0; i < 10 ; i++) {
            System.out.println(" **** method-01 START **** "); // meth entry
ebikgabik++;
            int a=0;
            System.out.print(i + " ");
            a+=2*i;
        }


        System.out.println(); // dumy
        System.out.println(" **** method-02 CALL EDILDI **** ");
        method02();
        System.out.println(" **** method-03 CALL EDILDI **** ");
        method03();
        System.out.println(" **** method-01 FINISHED **** "); // meth exit
    }

    public static void method02() {
        for (int x = 0; x < 7 ; x++) {
            System.out.println(" **** method-02 START **** ");
            ebikgabik++;
            System.out.println(x + " ");
        }
        System.out.println(); // dumy
        System.out.println(" **** method-02 FINISHED **** ");
    }

    public static void method03() {
        for (int y = 0; y < 5 ; y++) {
            System.out.println(" **** method-03 START **** ");
            ebikgabik--;
            System.out.println(y + " ");
        }
        System.out.println(); // dumy
        System.out.println(" **** method-03 FINISHED **** ");
    }
} // class sonu















