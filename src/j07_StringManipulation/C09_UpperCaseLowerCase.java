package j07_StringManipulation;

import java.util.Locale;

public class C09_UpperCaseLowerCase {
    public static void main(String[] args) {
          /*
        toUpperCase()-> verilen string'i tum harflerini BUYUK harfe çevirir.
       toLowerCase()-> verilen string'i tum harflerini kucuk harfe çevirir.
       ignoreCase()-> verilen string'i BUYUK-kucuk harf duyarlılığını kaldırır.
         */
String str = "Java Can";
String upperStr = str.toUpperCase();
        System.out.println(upperStr);
String str1 = "JAVa Can";
String lowerCase = str1.toLowerCase();
        System.out.println(lowerCase);


        String str2 = "JAVA";
        String str3 = "java";

        System.out.println(str2.equals(str3)); // case sensetive
        System.out.println(str2.equalsIgnoreCase(str3)); // true ignores cases
    }
}
