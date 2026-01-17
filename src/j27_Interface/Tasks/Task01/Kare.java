package j27_Interface.Tasks.Task01;

public class Kare implements GeometriApp{

private double kenar;

    public Kare(double kenar) {
        this.kenar = kenar;
    }
// Constructor açmamızın sebebi:
    //Objeyi oluştururken karenin kenar değerini zorunlu
    // ve kontrollü şekilde vermek.

    @Override
    public double cevre() {
        return 4*kenar;
    }

    @Override
    public double alan() {
       return kenar*kenar;
    }
}
