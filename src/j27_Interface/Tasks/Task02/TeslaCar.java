package j27_Interface.Tasks.Task02;

public class TeslaCar extends Vehicle implements Electric,Drive{


    public TeslaCar(String model) {
        super(model, "Electric");
    }

    @Override
    public void changeBattery() {
        System.out.println("Tesla battery changed");
    }

    @Override
    public void drive() {
        System.out.println("Tesla is driving");

    }
}
