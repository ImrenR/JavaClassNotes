package j22_AccessModifier;

public class C01_AccessModifer {//Class level

    /*
     1)public
     2)protected
     3)default
     4)private
             1) "private" class member'lar sadece icinde bulunduklari class'lardan erişilebilir.
                Diğer class'lardan "private" class member'lara erişilemez

             2) Diğer package'lerden   olusturulan object için class'i import edilmeli

             3) Diğer package'lerden default class memberlara erişilemez.
               "default"  "package private" sağlar

             4) public class member'lara herkes her yerden erişebilir.(farkli java projesi disinda).

             5) "protected" class member'lara ayni package'dan erişilebilir. Farkli package
              için : a)Child class erişebilir. 	b)Child class degil ise erişilemez.

             6) Class'lar için  sadece "public" ve "default" access modifier kullanilir.
              Class tanımlanırken "private" veya "protected" access modifier kullanilmaz.

     */

    private int privateYas = 33;
    int defaultYas=24; // AccMo yazilmazsa default olarak derlenir.(JVM derler)
    protected  int protectedYas=40;
    public int publicYas=50;

    private C01_AccessModifer (){ //private psiz const.
        System.out.println("Agam private psiz PRIVATE const. devamkee ");
    }
   public C01_AccessModifer (int a,int b){ //public psiz const.
        System.out.println("Agam private psiz PUBLIC const. devamkee ");
    }
    protected C01_AccessModifer (int a){ //PROTECTED psiz const.
        System.out.println("Agam private psiz PROTECTED const. devamkee ");
    }

    private static void privateMethod(){
        System.out.println("Agama PROTECTED  method selami caktik");
    }

    protected  static void protectedMethod(){
        System.out.println("Agama PROTECTED method selami geldiiiiii");
    }

}//Class sonu
