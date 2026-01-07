package j25_Exceptions;

public class C03_ClassCastingException {
    public static void main(String[] args) {
        //ClassCastingException-> Biribirine donusturulemeyen data type'lar donusturme isleminde olusan RTE
// bir objeyi, aslında ait olmadığı bir class türüne zorla çevirmeye (cast etmeye) çalıştığında oluşan RunTime Exception’dır.
        //Yani : Bu nesne bu sınıftan değil ama ben öyleymiş gibi davranayım” dediğinde



        Object obj = "Java Candir"; // String objesi

        try {
            Integer sayi =(Integer) obj;
            System.out.println("sayi = " + sayi);
        }catch (ClassCastException e){
            System.out.println("ClassCastException yakalandi");
            System.out.println("e.getMessage() = " + e.getMessage());

        }

        System.out.println("Program devam ediyor");
        // ClassCastException yakalandi!
        //java.lang.String cannot be cast to java.lang.Integer
        //Program devam ediyor...



    }

}
