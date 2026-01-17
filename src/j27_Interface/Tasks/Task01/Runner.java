package j27_Interface.Tasks.Task01;

public class Runner {
    static void main() {

        System.out.println("*******  Kare ************** ");
         Kare k1=new Kare(4);
        System.out.println("kare alani = " + k1.alan()); // 16.0
        System.out.println("kare cevresi = " + k1.cevre()); //16.0

        System.out.println("********* Cember ************ ");

        GeometriApp c2=new Cember(4);
        System.out.println("cember alan() = " + c2.alan()); //50.265
        System.out.println("cember cevre() = " + c2.cevre()); // 25.133

        System.out.println(" ********   Dikdortgen ********** ");

        GeometriApp d1=new Dikdortgen(2,3); // polymorphism yaptik burada
        System.out.println("dikdortgen cevre() = " + d1.cevre()); // 10
        System.out.println("dikdortgen alan() = " + d1.alan()); //6
    }
}
