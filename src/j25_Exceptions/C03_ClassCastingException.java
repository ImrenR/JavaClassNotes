package j25_Exceptions;

public class C03_ClassCastingException {
    public static void main(String[] args) {
        //ClassCastingException-> Biribirine donusturulemeyen data type'lar donusturme isleminde olusan RTE
// bir objeyi, aslında ait olmadığı bir class türüne zorla çevirmeye (cast etmeye) çalıştığında oluşan RunTime Exception’dır.
        //Yani : Bu nesne bu sınıftan değil ama ben öyleymiş gibi davranayım” dediğinde

// When we are trying to convert one type of obj into another obj.
try{
    Object s=new String("hello world");
    System.out.println((Integer) s); // When we run this whtout trycatch will have => ClassCastException.
    System.out.println("Try runned");
}catch (ClassCastException e){
    System.out.println("Message= " + e.getMessage());
    System.out.println("Catch yakaladi");
}

// string is a child object is parent.





    }

}
