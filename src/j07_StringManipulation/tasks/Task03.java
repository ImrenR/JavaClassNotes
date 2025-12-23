package j07_StringManipulation.tasks;

public class Task03 {
    public static void main(String[] args) {
        // Task-> "Alamanya" Stringindeki ikinci 'a' caharacterinin indexini print eden code create ediniz


        String str = "Alamanya";

        int firstA = str.indexOf('a');
        System.out.println("firstA = " + firstA);
        int secondA = str.indexOf('a', firstA + 1);

        System.out.println("secondA = " + secondA);
    }
}
