package j27_Interface;

public class Sahin extends Tofas implements Lastik,DisDonanim,IcDonanim{
    @Override
    public void kapi() {
        System.out.println("Arabanin 4 kapisi var");
    }

    @Override
    public void motor() {
        System.out.println("1.6 motoru mevcut");
    }

    @Override
    public void yakit() {
        System.out.println("Tup tak");
    }

    @Override
    public void kaporta() {
        System.out.println("Kaportasi var");
    }

    @Override
    public void koltuk() {
        System.out.println("4 koltugu var");
    }

    @Override
    public void klima() {
        System.out.println("Klimasi var");
    }

    @Override
    public void ebat() {
        System.out.println("15 inc lastik ebati var");
    }

    @Override
    public void jant() {
        System.out.println("Burasi jant alani :)");
    }
}
