package j07_StringManipulation.tasks;

public class Task08 {
    public static void main(String[] args) {
        /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi print eden code create ediniz.
   String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */
        String harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


char I = harfDepo.charAt(8);
char M = harfDepo.charAt(12);
char R = harfDepo.charAt(17);
char E = harfDepo.charAt(4);
char N = harfDepo.charAt(13);

        System.out.println(""+I+M+R+E+N);

    }
}
