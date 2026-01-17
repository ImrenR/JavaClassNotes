package j27_Interface.Tasks.Task02;

public class Bus extends Vehicle implements Deisel,Drive{

    public Bus(String model) {
        super(model,"Diesel");
    }

    @Override
    public void changeDeisel() {
        System.out.println("Bus diesel filled");
    }

    @Override
    public void drive() {
        System.out.println("Bus is driving");

    }
}
