package j25_Exceptions;

public class C05_ArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        // ArrayIndexOutOfBoundException-> array'lerde olmayan index elemanı ile işlem yapıldıgında oluşan  RTE
//“Array’de olmayan bir index’i istiyorsun”

        int []arr={10,20,30,40};

        try{
            System.out.println("once");
            System.out.println(arr[5]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("e.getMessage() = " + e.getMessage());
            //cikti => e.getMessage() = Index 5 out of bounds for length 4

        }

        //System.out.println("sonra"); // cikti => ArrayIndexOutOfBoundsException try catch kullanmadan alinan sonuc
    }
}
