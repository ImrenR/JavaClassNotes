package j27_Interface;

public class Sahin extends Tofas implements Lastik,IcDonanim,DisDonanim{ // concrete child class

    @Override
    public void kapi() {
        System.out.println("4 kapilidir bu arkadas");
    }

    @Override
    public void motor() {
        System.out.println("1.6 li motor");
    }

    @Override
    public void yakit() {
        System.out.println("Tup tak cok yakmasin");
    }

    @Override
    public void kaporta() {
        System.out.println("Kaportasi iyidir");
    }

    @Override
    public void koltuk() {
        System.out.println("4 koltugu var");
    }

    @Override
    public void klima() {
        System.out.println("Klimasi vardi");
    }

    @Override
    public void ebat() {
        System.out.println("15 inch ebata sahip");
    }

    @Override
    public void jant() {
        System.out.println("4 kapilidir bu arkadas");System.out.println("janti var");
    }
}
