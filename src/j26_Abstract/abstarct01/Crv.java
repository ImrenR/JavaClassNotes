package j26_Abstract.abstarct01;

public class Crv extends Honda{
    @Override
    public void motor() {
        System.out.println("2.4 super turbo motor");
    }

    @Override
    void kapi() {
        System.out.println("Kapilar kale gibi");
    }

    @Override
    void koltuk() {
        System.out.println("Aynen deri koltuk iyidir");
    }
}
