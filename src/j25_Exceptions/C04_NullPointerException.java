package j25_Exceptions;

public class C04_NullPointerException {
    public static void main(String[] args) {
        // NullPointerException -> null ataması yapılan bir String variable length() meth call edildiğinde oluşan RTE
       //null olan bir referans üzerinden method / field / length vb. erişmeye çalıştığında oluşan => RTE
        //“Ortada obje yok ama sen onunla işlem yapmaya çalışıyorsun”

        String str=null;

        try{
            System.out.println("Try calisti");
            System.out.println("str.length() = " + str.length());
        }catch (NullPointerException e){
            System.out.println("Hata yakalndi");
            System.out.println("e.getMessage() = " + e.getMessage());
            //cikti=> e.getMessage() = Cannot invoke "String.length()" because "str" is null
        }finally {
            System.out.println("Her durumda calisti");
        }





        //CIKTI =>NullPointerException
    }
}
