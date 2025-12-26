package j19_Constructor;

import other_files.Bike;

public class C06_Constructor1 {
    static void main() {

Bike bike1 = new Bike(); // default constructirimiz. ancak
                        // pli bir const olusturursak default olani ezecektir.

// cagiramadim cunku access modfierlari yok, public yapariz degerileri bike classinda

        System.out.println("bike1.age = " + bike1.age); // bike claasindaki degerleri public yapinca degerlere ulasabildim
       // deger atamadigim icin default degerine ulastim
bike1.age =15; // atama yapip degistirebiliriz degeri
        System.out.println("bike1.age = " + bike1.age);


        Bike bike2 = new Bike("Red",15,true);
        System.out.println("bike2 = " + bike2);
        Bike bike3 =new Bike("yellow");
        System.out.println("bike3.color = " + bike3.color);

    }
}
