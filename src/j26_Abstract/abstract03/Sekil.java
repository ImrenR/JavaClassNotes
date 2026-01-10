package j26_Abstract.abstract03;

public abstract class Sekil {

    String name; // taskin 1. sikkinda name fieldi

    public Sekil() { // ve default constructor olan Sekil isimli Abstract acildi

    }

    public abstract int alan(); // zorunlu alanlar alan ve cevre abs metodu acildi

    public abstract int cevre();

    @Override
    public String toString() {  // butun sekiller icin ortak olan davranis parenta tanimlandi, childlar sadece degisken kismini yazsin
        return "Alan" + alan() +
                "Cevre'" + cevre();
    }

    public String getName() {
        return name;
    }

    public void ciz(){
        System.out.println(name + "  ciziliyor ...");
    }
}
