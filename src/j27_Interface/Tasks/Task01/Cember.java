package j27_Interface.Tasks.Task01;

public class Cember implements GeometriApp{

    private double yaricap;

    public Cember(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double cevre() {
        return 2* Math.PI * yaricap;
    }

    @Override
    public double alan() {
        return Math.PI * yaricap * yaricap;
    }
}
