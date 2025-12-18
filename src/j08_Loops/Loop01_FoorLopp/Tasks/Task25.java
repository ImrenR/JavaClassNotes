package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task25 {

    /*
           TASK  :
           Bir String içindeki tüm karakterleri en fazla bir kez print eden code create ediniz.
           Test Data:
           input: "aabbcccccddddaaa"
           output: abcd
        */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir string giriniz:");
        String str = input.next();

        String result =""; // this will store characters we have already printed.

        // ch = 'a'
        // ""+ch => "a" this converts char to string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // gives us as char 'a'
            if (result.contains("" + ch)) { // is this character already inside my box ?
                continue; // already exits -> skip
            }
            result +=ch ; // first time -> add // for example if already store a and second ch is a, asking is this contains a yes then skip
        }
        System.out.println(result);
    }
}
