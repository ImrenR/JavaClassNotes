package j11_Arrays.Tasks;

public class _14_String_method_replace {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturunuz.  "Hello World"
        "o" harfleri yerine "K" yerleştiriniz.
        Sonuç bu şekilde olmalıdır:
        HellK WKrld
         */
String word = "Hello World";
char [] chars = word.toCharArray(); //String i chara cevir ki tek tek karakterleri al

        for (int i = 0; i <chars.length ; i++) {
            if (chars[i] == 'o') {
                chars[i] = 'K';
            }

        }
String result = new String(chars);
        System.out.println("result = " + result);
    }
}