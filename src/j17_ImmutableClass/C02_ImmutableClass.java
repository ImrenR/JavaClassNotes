package j17_ImmutableClass;

import java.util.ArrayList;

public class C02_ImmutableClass {
    public static void main(String[] args) {
           /*
		  Boolean, Short, Integer, Long, Float, Double, Char ve String gibi tüm kapsayıcı sınıflar (Wrapper Class)
		  BigDecimal, BigInteger java’da immutable->değişmez sınıflara örnek olarak gösterilebilir.
          StringBuilder, StringBuffer, Arrays ve ArrayList de Mutable (değişebilir) class’lardır.
		 */

       String name = "imren";
        System.out.println(" ********* immutable Class ********");
        System.out.println("Method call oncesi name : " + name); // imren
        name.concat("developer team lead");
        System.out.println("Method call sonrasi = " + name); // imren => passbyvalue oldugu icin degismedi


    }
}
