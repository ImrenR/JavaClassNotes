package j14_Varargs;

public class Task01 {
    public static void main(String[] args) {
         /*
        Task -> verilen Stringleri birlestiren concat isimli METHOD create ediniz.

        input : "h", "a", "l", "u", "k";
        output : haluk

        input : "a", "l", "i";
        output : ali

         */
        System.out.print("Print = " + concat("h", "a", "l", "u", "k"));

    }// main sonu

public static String concat(String...x){

        String sonuc="";

        for(String w: x){
           sonuc +=w;
        }

        return sonuc;
}

}// Class sonu
