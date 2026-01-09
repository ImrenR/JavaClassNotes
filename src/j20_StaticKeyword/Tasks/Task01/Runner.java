package j20_StaticKeyword.Tasks.Task01;

public class Runner {
     /*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan değelerini print eden code create ediniz.
    */


    public static void main(String[] args) {

Rectangle r1=new Rectangle(5,10);

        System.out.println("r1.alanHesapla() = " + r1.alanHesapla());
        System.out.println("r1.cevreAlan() = " + r1.cevreAlan());
    }
}
