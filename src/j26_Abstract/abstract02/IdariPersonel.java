package j26_Abstract.abstract02;

public class IdariPersonel extends Personel {
    @Override
    public void maasHesapla() {
        System.out.println("Idarei personelin maasi hesaplandi");
    }

    @Override
    public void maasBilgisi() {
        System.out.println("idari personelin maasi 3000 eurodur");
    }

    @Override
    public void sigorta() {
        System.out.println("idari personelin sigoratsi yapilmistir");
    }
}
