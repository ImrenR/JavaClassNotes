package j102_OCA.Q019;

public class Q019 {
    int Q019;//instance
    public void method1(){
        int y=0;
        y++;
    }

    public static void main(String[] args) {
        int x = 0;//local variable
        x++;
        Q019 q=new Q019();
        System.out.println("q.Q019 = " + (++q.Q019));
    }
    /*
    19.	Which three statements are true about the structure of a Java class? (Choose three.)

    A.	A class cannot have the same name as its field.

    B.	A public class must have a main method.

    C.	A class can have final static methods.

     D.	A class can have overloaded private constructors.

    E.	Fields need to be initialized before use.

    F.	Methods and fields are optional components of a class.
*/
}
