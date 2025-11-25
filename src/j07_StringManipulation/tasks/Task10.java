package j07_StringManipulation.tasks;

        import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        /* TASK :
         * Girilen  isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olmasını control eden code create ediniz
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String name= input.nextLine();

        String result = (name.length() == 3)
                ? ((name.charAt(0) != name.charAt(1) &&
                        name.charAt(0) != name.charAt(2) &&
                        name.charAt(1) != name.charAt(2))
                ? "All letters are unique"
                : "Letters are not unique")
                : "Name must be exactly 3 letters";


    }
}