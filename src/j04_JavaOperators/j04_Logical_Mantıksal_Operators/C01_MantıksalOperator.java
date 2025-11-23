package j04_JavaOperators.j04_Logical_Mantıksal_Operators;

public class C01_MantıksalOperator {
    /*
 -------- && - and - (ve)---------

      True   &&    True    -->  True
      True   &&    False   -->  False
      False  &&    True    -->  False
      False  &&    False   -->  False


     -------- ||- or - (veya)---------

      True   ||    True    -->  True
      True   ||    False   -->  True
      False  ||    True    -->  True
      False  ||    False   -->  False
 */
    // && ile & arasindaki fark
    //&& de boolean sonuc 3 te bir tane false bulunca durur tum satırı kontrol etmeye calısmaz.
    // Ancak & tum satırı kontrol eder ondan sonra durur.
    //sonucta fark yok sadece biri ilk hatayı buldugunda durur dığeri sonuna kadar gider.&& tekliye gore daha hizli calisir

    //and->ve or->veya


    public static void main(String[] args) {



        boolean b1 = 10 < 23; // true
        boolean b2 = 31>35; // false
        int c = 20;
        int d= 34;

        System.out.println("b1 && (d< c) = " + (b1 && (d < c))); //  false
        System.out.println("b1 && (d< c) = " + (b1 && (d == c))); // false
        System.out.println("b1 && (d< c) = " + (b1 || (c < d))); //true
        System.out.println("b1 && (d< c) = " + (b1 || (d == c))); // true


    }
}
