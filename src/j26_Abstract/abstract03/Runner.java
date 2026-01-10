package j26_Abstract.abstract03;

public class Runner {

    public static void main() {

        Sekil d1=new Dikdortgen(4,3);
        System.out.println("d1.cevre() = " + d1.cevre()); //14
        System.out.println("d1.name = " + d1.name); // dikdortgen
        System.out.println("d1.alan() = " + d1.alan()); // 12
        d1.ciz(); // dikdortgen ciziliyor...


        Sekil c1=new Cember(6);
        System.out.println("c1.name = " + c1.name); // cember
        System.out.println("c1.cevre() = " + c1.cevre()); //37
        System.out.println("c1.alan() = " + c1.alan()); // 113
    }
}
