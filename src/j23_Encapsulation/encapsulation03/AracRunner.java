package j23_Encapsulation.encapsulation03;

public class AracRunner {
    public static void main(String[] args) {

   Arac araba1=new Arac("BMW","black",45,500,8);

   Arac araba2=new Arac("Kirmizi","Fiat");
        Arac araba3=new Arac();
// araba 3 icin

        System.out.println("araba3.getYil() = " + araba3.getYil());
        System.out.println("araba3.getMotorHacmi() = " + araba3.getMotorHacmi());
        araba3.setYil(9000);
        araba3.setMotorHacmi(2000);
        System.out.println("Atama yaptiktan sonra araba3 = " + araba3);

        // print :
        //Hatali bir yil girdiniz
        //araba3.getYil() = 0
        //araba3.getMotorHacmi() = 0
        //Hatali bir yil girdiniz
        //Motor hacmi 1000 cc ve alti olmalidir!
        //Atama yaptiktan sonra araba3 = model='null, renk='null, yil=0, motorHacmi=0

        System.out.println(" araba 2 icin ********************");

// araba 2 icin

        System.out.println("araba3.getYil() = " + araba2.getYil());
        System.out.println("araba3.getMotorHacmi() = " + araba2.getMotorHacmi());
        araba2.setYil(2021);
        araba2.setMotorHacmi(1002);

        System.out.println(" Atama yaptiktan sonra araba2 = " + araba2);
//print :
        //araba3.getYil() = 0
        //araba3.getMotorHacmi() = 0
        //Motor hacmi 1000 cc ve alti olmalidir!
        // Atama yaptiktan sonra araba2 = model='Fiat, renk='Kirmizi, yil=2021, motorHacmi=0
        // araba1 icin:
        System.out.println(" araba 1 icin ********************");
        
        System.out.println("araba3.getYil() = " + araba1.getYil());
        System.out.println("araba3.getMotorHacmi() = " + araba1.getMotorHacmi());


        araba1.setYil(1956);
        araba1.setMotorHacmi(99);

        System.out.println(" Atama yaptiktan sonra araba2 = " + araba1);
    // print
       // araba3.getYil() = 0
        //araba3.getMotorHacmi() = 500
        //Hatali bir yil girdiniz
        //Atama yaptiktan sonra araba2 = model='BMW, renk='black, yil=0, motorHacmi=99

    }



}


