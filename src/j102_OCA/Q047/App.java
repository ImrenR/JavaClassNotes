package j102_OCA.Q047;



public class App {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        machine1.start();
        machine1.finih();

        Camera camera1 = new Camera();

        camera1.start();
        camera1.snap();
        camera1.finih();

        Machine machine2= new Camera();//Upcasting --Parent - SubClas
        machine2.start();//override edilmiş
        machine2.finih();// upper class

        // Attempting to downcast
        Camera camera = (Camera) machine2; // Downcasting
        camera.start(); // Calls the overridden method in Camera: "Camera Started"
        camera.snap();
        camera.finih();
    }
}
