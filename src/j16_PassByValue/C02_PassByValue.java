package j16_PassByValue;

public class C02_PassByValue {
    public static void main(String[] args) {


   //  task -> verilen fiyat için %11 %22 ve %33  indirimli  fiyatı print eden return type METHODlar  create ediniz.

        double fiyat = 100; // double data type primitive variable create edildi
        System.out.println("Method call oncesi = " + fiyat); // 100.0
        System.out.println("indir11(fiyat) = " + indir11(fiyat)); // indir11(fiyat) = 89.0
        System.out.println("indir22(fiyat) = " + indir22(fiyat)); // indir22(fiyat) = 78.0
        System.out.println("indir33(fiyat) = " + indir33(fiyat)); //  indir33(fiyat) = 67.0
        System.out.println("M Call sonrasi fiyat = " + fiyat); // 100.0
    }//main sonu

    private static double indir33(double a) {
       return a*0.67;
    }

    private static double indir22(double a) {
        return a*0.78;
    }

    private static double indir11(double a) {
        return a*0.89;
    }



}//Class sonu
