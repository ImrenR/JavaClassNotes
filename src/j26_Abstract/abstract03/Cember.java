package j26_Abstract.abstract03;

public class Cember extends Sekil{
int yariCap;

    public Cember(int yariCap) {
        this.yariCap = yariCap;
        this.name="Cember";
    }

    @Override
    public int alan() {
        return (int) (Math.PI * yariCap * yariCap);
    }

    @Override
    public int cevre() {
        return (int) (Math.PI * 2* yariCap);
    }
}
