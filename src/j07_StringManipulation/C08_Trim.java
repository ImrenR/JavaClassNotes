package j07_StringManipulation;

public class C08_Trim {

    public static void main(String[] args) {

           /*
  trim()-> İstediğimiz String’in başında veya sonunda varolan boşluk (space)’leri temizler.
  Does not remove spaces between words.
  Does modify the original string
Only removes spaces at the start and end of the string.
         */
String str1 = "   Hello World   ";
String str2 = "Java    ";

String trimmedStr1 = str1.trim();
String trimmedStr2 = str2.trim();
        System.out.println(trimmedStr2);
        System.out.println(trimmedStr1);

    }
}
