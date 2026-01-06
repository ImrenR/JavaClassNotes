package j24_Inheritance.inheritance02;

public class Kedicik extends Mammal {//parent(super) Mammal Class'dan extend edilen child(sub) Class

    int c=2;
    int d=7;

    public Kedicik() {// psiz const
    super(); // parent class psiz const call
    }

    public Kedicik(String str) { //pli const

       this(); // bu classdaki psiz const call.
      //  this("ali"); kendinisi call edemez. recursive const call edilemez.cunku; sonsuz dongu olusuur
        System.out.println("super.c = " + super.c);// parent class c variable call edildi
        System.out.println("Burasi kedicik parametreli constructor call");

    }
}//Class sonu
