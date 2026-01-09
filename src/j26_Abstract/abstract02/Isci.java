package j26_Abstract.abstract02;

public class Isci extends Personel{
    @Override
    public void maasHesapla() {
        System.out.println("Iscinin massini hesapla");
    }

    @Override
    public void maasBilgisi() {
        System.out.println("iscnin maasi 2000 eurodur");
    }

    @Override
    public void sigorta() {
        System.out.println("iscinin sigortasi vardir");
    }
}
