package j10_MethodCreation;

public class C03_MethodDepo {    // main method olmayan depo Class-> komsu koy


/*
her class main method tanımlama zorunluluğu yoktur.
Belirli action özel Class'lar tanımlanabilir
 */
public static void gecmeNotu(int not){ //int parametreli komsu koy methodu
    if (not > 85){
        System.out.println("Takdir belgesi");
    } else if (not >=70) {
        System.out.println("Tesekkur belgesi");
    } else if (not>=50) {
        System.out.println("gectiniz");
    } else {
        System.out.println("Kaldiniz");

    }

    }
}






