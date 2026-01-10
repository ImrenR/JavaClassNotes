package j26_Abstract.abstract05;

import java.time.LocalDate;

public class Runner {
    public static void main() {
        try {
            Hayvan k1 = new Kartal("Kartal", 1, false, LocalDate.of(2023, 1, 1));
            k1.setDogumTarihi(LocalDate.of(2030, 1, 1));

        } catch (IllegalArgumentException e) {
            System.out.println("Kartalin dogum tarihi set et = " + e.getMessage());
        }

Hayvan kartal1= new Kartal("Kartal1",2,true,LocalDate.of(2023,1,1));
        System.out.println("kartal1 = " + kartal1);
        Hayvan kedi=new Kedi("Kedi",4,false,LocalDate.of(2020,1,1));
        System.out.println("kedi = " + kedi);
    }
}
