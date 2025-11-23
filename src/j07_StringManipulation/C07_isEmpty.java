package j07_StringManipulation;

public class C07_isEmpty {
    public static void main(String[] args) {
          /*
          String IsEmpty
           String tamamen boş mu değil mi onu kontrol ediyor, sonuç true false return eder
          isEmpty Methodundan true aliyorsaniz o String'in icinde hic bir character yok demektir.
          Yani o String'in length() 0 demektir.
          length()==0 demek isEmpty() true verir demektir.
         */

        String str1 = "";
        String str2 = " Hello";
        String str3 = " "; // string with a space

        System.out.println(str1.isEmpty()); // true
        System.out.println(str2.isEmpty()); // false

        System.out.println(str1.length() == 0);

    }
}
