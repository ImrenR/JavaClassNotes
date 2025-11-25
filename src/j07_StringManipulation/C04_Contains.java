package j07_StringManipulation;

import java.util.Scanner;

public class C04_Contains {
    public static void main(String[] args) {
    /*
        String içersinde istenen stringinin varlığını kontrol eder boolean değer return eder..
        char parametre -> CTE '' bu sekilde yazilamaz string olmak zorunda "".
         */

String cumle = "JAVACAN COK GUZELSIN";
        System.out.println(cumle.contains("JAVA"));

String bootcamp = "Clarusway ile java gayet iyi";
        System.out.println(bootcamp.contains("java"));
          }
}
