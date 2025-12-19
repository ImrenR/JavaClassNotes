package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {// main level
        //task-> girilen ad ve soyadın ilk harfleri buyuk diğer harflerini küçük print eden METHOD create ediniz



       Scanner input = new Scanner(System.in);
        System.out.println("Bir ad ve soyad girinz :");
        String fullName = input.nextLine(); // if you use next() reads only one word

duzenle(fullName);

    }

    private static void duzenle(String fullName) {
        String result= ""; // to store the final asnwer here
        boolean newWord =true; // the next letter the first letter of a word= true. it s a flag

        for (int i = 0; i <fullName.length() ; i++) {
            char ch =fullName.charAt(i);

            if (ch == ' '){ // is this space ?
                result += " "; // bosluk varsa orda dur ve onu ekle
                newWord = true; // bosluktan sonra ki upper case olacak
        } else if (newWord) { // this word first space of the word, before processing beginning of the word
                result +=Character.toUpperCase(ch);
                newWord = false; // no we are inside the word

            }else {
                result +=Character.toLowerCase(ch);

            }
        }
        System.out.println(result);

}


}// Class sonu
