package j27_Interface.Tasks.Task01;

public class Dikdortgen implements GeometriApp{

    private double uzunKenar;
    private double kisaKenar;

    public Dikdortgen(double uzunKenar, double kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    @Override
    public double cevre() {
        return (uzunKenar+kisaKenar)*2;
    }

    @Override
    public double alan() {
        return uzunKenar*kisaKenar;
    }
}
