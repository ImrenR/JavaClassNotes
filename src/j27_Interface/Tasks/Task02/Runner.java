package j27_Interface.Tasks.Task02;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    static void main() {
        TeslaCar tesla=new TeslaCar("Model T");
        ToyotaPrius toyota=new ToyotaPrius("Model S");
        Bus bus=new Bus("Model B");


//Asagidaknin amaci =>
      //  Bunu yapmamızın sebebi:
    //    Farklı türdeki araçları tek bir ortak tip altında toplayıp,
        //    hepsine aynı şekilde davranabilmek
      List<Vehicle> vehicles = new ArrayList<>(); // ben sadece vehicle olan seyleri listeye koyabilrim.

        vehicles.add(tesla); // IS-A iliskisi vardir tasla is a vehicle
        vehicles.add(bus);
        vehicles.add(toyota);
for(Vehicle v:vehicles){
    System.out.println("v.getClass().getSimpleName() = " + v.getClass().getSimpleName());
}
    }
}
