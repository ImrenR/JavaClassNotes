package j26_Abstract.abstract02;

public class Runner {
    static void main() {
        IdariPersonel a1=new IdariPersonel();
        a1.name="Nikola";
        System.out.println("a1.name = " + a1.name);
        a1.maasBilgisi();
        a1.maasHesapla();


        Isci a2=new Isci();
        a2.name="Imren";
        System.out.println("a2.name = " + a2.name);
        a2.maasBilgisi();
        a2.maasHesapla();
    }
}
