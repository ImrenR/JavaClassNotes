package j29_Collection.p02_Set.Tasks;

import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.TreeSet;

public class Task02 {
    public static void main(String[] args) {
        //interview question : girilen String datanın karakterlerini alfabetik print ediniz-> TreeSet'e atanır ...
        // hashSet ve treeSet tanımlayıp run surelerini karsılastırınız..
        // Trick run suresi için System.currrentTimeMillis() meth. call ediniz...


       String str="javaCAN"; // treeSet ile alfabetk siraya koymanizi istiyor
        // TreeSet otomatik siralar
        // Set tekrar eden karakterleri almaz.
        //Neden TreeSet alfabetik siralar, dublicate karakterleri siler.

// karakterleri treeSet e ekleyelim (alfavetik unique)
TreeSet<Character> isim= new TreeSet<>();

for(char ch: str.toCharArray()){
    isim.add(ch);
}

        System.out.println(isim);

// karakteri hashset e ekleyelim (sirasiz unique)
        HashSet<Character> hashSet=new HashSet<>();
        for(char ch: str.toCharArray()){
            hashSet.add(ch);
        }
        System.out.println("hashSet = " + hashSet);


        // Run time karşılaştırması
        long startTree = System.currentTimeMillis();
        for (char ch : str.toCharArray()) isim.add(ch);
        long endTree = System.currentTimeMillis();

        long startHash = System.currentTimeMillis();
        for (char ch : str.toCharArray()) hashSet.add(ch);
        long endHash = System.currentTimeMillis();

        System.out.println("TreeSet ekleme süresi: " + (endTree - startTree) + " ms");
        System.out.println("HashSet ekleme süresi: " + (endHash - startHash) + " ms");
    }
}
