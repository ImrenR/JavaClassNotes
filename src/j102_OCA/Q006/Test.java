package j102_OCA.Q006;

class X {
    public void printFileContent() {
        /*code goes here */
     // throw new IOException();

       throw new ArithmeticException();//check exception değil
    //throw new InterruptedException();
        //System.out.println("Me");
    }

}
public class Test {
    public static void main(String[] args)throws Exception {
        X xobj = new X();
        xobj.printFileContent();
        System.out.println("Main bitti");
    }
}

    /* Which two modifications should you make so that
        the code compiles successfully? (Choose two.)
        A. try {
               xobj.printFileContent();
            }
            catch(Exception e)  { }
            catch(IOException e) { }
        B. Replace line 7 with throw IOException(Exception raised);
        C. Replace line 11 with public static void main(String[] args) throws IOException {
        D. At line 14, insert throw new IOException();
        E. Replace line 5 with public void printFileContent() throws IOException {



Answer C E
 */
