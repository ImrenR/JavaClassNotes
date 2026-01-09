package j26_Abstract.abstarct01;

public class Civic extends Honda{
    @Override
    public void motor() {
        System.out.println("1.6 motor neyine yetmez");
    }

    @Override
    void kapi() {
        System.out.println("kapi elinde kalmasin");
    }

    @Override
    void koltuk() {
        System.out.println("Koltuklar saglammmm he");
    }
}
