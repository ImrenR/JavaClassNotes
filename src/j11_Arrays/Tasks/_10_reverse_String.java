package j11_Arrays.Tasks;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
        Trick-> String split ile arraya atanmalı
         */
        String str = "Hello World";
        String[]arr= str.split(""); // her  bir kelimeyi indexlere ayirdik ve arr dizisine ekledik

        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print( arr[i]);
        }
    }
}