package j27_Interface.Tasks.Task02;

public class ToyotaPrius extends Vehicle implements Electric,Gas,Drive{

    public ToyotaPrius(String model) {
        super(model, "Hybrid");
    }

    @Override
    public void changeBattery() {
        System.out.println("Prius battery changed");
    }

    @Override
    public void changeOil() {
        System.out.println("Prius oil changed");
    }

    @Override
    public void drive() {
        System.out.println("Prius is driving");
    }
}
