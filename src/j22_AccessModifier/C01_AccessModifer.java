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

private int privateYas=33;
int defaultYas=24; // AccMo yazilmazsa default olarak derlenir.(JVM derler)
    protected  int protectedYas=40;
    public int publicYas = 50;


    private  C01_AccessModifer(){ // private psiz constructor
        System.out.println("Private psiz default const dan selam");

    }
    public   C01_AccessModifer(int a,int b){ // public pli constructor
        System.out.println("Private pli PUBLIC const dan selam");

    }
    protected   C01_AccessModifer(int a,int b,int c){ // protected pli constructor
        System.out.println("Private pli Protected const dan selam");

    }

    private static void privateMethod(){
        System.out.println("Private meth tan selam");
    }

    protected static void protectedMethod(){
        System.out.println("Protected meth tan selam");
    }
    C01_AccessModifer obj =new C01_AccessModifer(); // privatw const call ile obj create kendi Class scope


}//Class sonu
