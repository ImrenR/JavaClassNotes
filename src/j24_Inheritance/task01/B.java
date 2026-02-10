package j24_Inheritance.task01;

public class B extends A {
String bMessage;

    public B() {
        bMessage =A.isim;
    }


    @Override
    public String toString() {
        return "B{" +
                "bMessage='" + bMessage + '\'' +
                '}';
    }
}
