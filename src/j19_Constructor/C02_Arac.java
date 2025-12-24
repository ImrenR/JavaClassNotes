package j19_Constructor;

public class C02_Arac {//Class level
    //fields... ins. variable->obj variable

    String marka;
    String model;
    int km;
    double motor;
    boolean vitesAuto;
    boolean sHand;
    int yil;



    public static void main(String[] args) {//main level
            /*
        Task-> fields: marka,model,km,motorHacim,vitesAotu,ikinciEl,yıl olan
         3 obj  create ederek fields print eden code create ediniz.
         */

        C02_Arac arac1 = new C02_Arac();
        C02_Arac arac2 = new C02_Arac();
        C02_Arac arac3 = new C02_Arac();

        arac1.marka ="BMW";
        arac1.model="X5";
        arac1.km=12000;
        arac1.motor=2.5;
        arac1.vitesAuto=true;
        arac1.sHand=true;
        arac1.yil=2023;

        System.out.println("arac1 = " + arac1); //j19_Constructor.C02_Arac@27716f4=> obje non primitive yani referatif data oldugu
        // icin referans degeri ile heap memory de store edilir.
        System.out.println("arac1= " + arac1.marka + " " + arac1.model + " "); // BMW X5
        System.out.println("arac1 = " + arac1);

    }//main sonu

    @Override
    public String toString() { //sag tik generate=> toString() => obj ile secilen field lari string e cevirir.
         return "C02_Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motor=" + motor +
                ", vitesAuto=" + vitesAuto +
                ", sHand=" + sHand +
                ", yil=" + yil +
                '}';
    }
}//Class sonu
