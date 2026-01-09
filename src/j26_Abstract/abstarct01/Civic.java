package j26_Abstract.abstarct01;

public class Civic extends Honda{
   // public class abstract Civic extends Lastik extends Honda {} CTE verir cunku abs birden fazla extends edemez
    // concrete Class abs method create edemez. 6. satirdaki ornekte aciklandi
    //public abstract void absMethod();


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
