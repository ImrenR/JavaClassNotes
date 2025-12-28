package j14_Varargs;

public class Task12 {
    static void main() {
        //Create a method joinStrings that accepts varargs of String and
        // prints them as one sentence.

        joinStrings("Selam", "Ben","artik","bir","developerim");
    }

    private static void joinStrings(String...x) {
        String cumle ="";
        for (String avuc:x){
            cumle+=avuc + " ";

        }
        System.out.println("cumle = " + cumle);
    }
}
