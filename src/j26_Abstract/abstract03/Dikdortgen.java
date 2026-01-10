package j26_Abstract.abstract03;

public class Dikdortgen extends Sekil {

    int uzunKenar;
    int kisaKenar;

    public Dikdortgen(int uzunKenar, int kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
        this.name="dikdortgen";
    }

    @Override
    public int alan() {
        return uzunKenar*kisaKenar;
    }

    @Override
    public int cevre() {
        return 2*(uzunKenar+kisaKenar);
    }
}
