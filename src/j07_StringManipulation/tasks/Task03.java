package j07_StringManipulation.tasks;

public class Task03 {
    public static void main(String[] args) {
        // Task-> "Alamanya" Stringindeki ikinci 'a' caharacterinin indexini print eden code create ediniz


        String str = "Alamanya";

        int ilkHarf = str.indexOf('a');
        System.out.println(ilkHarf); // 2
        System.out.println(str.indexOf('a', 3)); // 4

    }
}
