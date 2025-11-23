package j04_JavaOperators.j03_Comparison_Karsılastırma_Operators;

public class C01_KarsılastırmaOperatoru {
    /*
 Comparator : Karsilastirma islemleri.
 Java'da iki variable'in degeri karlilastirildiginda Java sonuc olarak boolean(true-false) return eder

 ==	    Esit	            x == y
 !=	    Esit degil	        x != y
 >	    buyuk	            x > y
 <	    kucuk	            x < y
 >=	    buyuk esit        	x >= y
 <=	    kücük esit  	    x <= y
Unlem isareti (!) olumsuzluk anlaminda kullanilir.
  */
    public static void main(String[] args) {
 int halukAge = 50;
 int imrenAge = 34;

        System.out.println("halukAge == imrenAge = " +( halukAge == imrenAge)); // false
        System.out.println("halukAge == imrenAge = " +( halukAge != imrenAge)); // true
        System.out.println("halukAge == imrenAge = " +( halukAge > imrenAge)); // true
        System.out.println("halukAge == imrenAge = " +( halukAge < imrenAge)); // false


        /* s1 ve s2 String constant pool içerisinde aynı referans değere (reference) sahiptir.
s1 == s2 , s1 ve s2 'nin hafızadaki adres değerlerini karşılaştırır ve
 String constant pool üzerinde aynı adresi gösterirler.
 Böylece ekrana TRUE yazdırır.
    */
    }
}
