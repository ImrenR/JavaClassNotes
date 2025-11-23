package j102_OCA.Q010;

public class TestScope {
    static int var1 = 200;
    public static void main(String[] args) {
        TestScope t1=new TestScope();
        t1.doCalc();

      // prints the returned var fromdoCalc method
        System.out.print(" " + var1);
        // prints the local var
    }
    int doCalc() {
        var1 = var1 * 2;
        System.out.println(var1);
        return var1;
    }

}
//What is the result?
//A.	400 200
//B.	200 200
//C.	400 400
//D. Compilation fails.











// Cevap C





// Cevap A