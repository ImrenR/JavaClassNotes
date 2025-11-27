package j10_MethodCreation;

public class C06_Practice {

    public static void main() {
//main icinde ise method call yaptik arkadaslar:

        System.out.println("firstAndLastChars(\"Imren\") = " + firstAndLastChars("Imren"));


    } // main sonu

    //Class icinde metodu yazdik.

  public static String firstAndLastChars(String text){

         String firstChar = String.valueOf(text.charAt(0)); // ilk index
         String lastChar = String.valueOf(text.charAt(text.length()-1)); // son index
        return firstChar + lastChar;
  }


}//Class sonu
