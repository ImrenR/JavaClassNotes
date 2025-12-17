package j16_PassByValue;

public class C02_PassByValue {
    public static void main(String[] args) {
        //  task -> verilen fiyat için %11 %22 ve %33  indirimli  fiyatı print eden
        //  return type METHODlar  create ediniz.
double fiyat = 100;
        System.out.println("Meth oncesi fiyat = " + fiyat);

        System.out.println("indir11(fiyat) = " + indir11(fiyat));
        System.out.println("indir21(fiyat) = " + indir21(fiyat));
        System.out.println("indir31(fiyat) = " + indir31(fiyat));
        System.out.println(" Meth sonrasi fiyat = " + fiyat); // 100 fiyat giderken degeri gitti fiyat degil
    }//main sonu

    private static double indir31(double a) {
        return  a*0.67;
    }

    private static double indir21(double a) {
        return a*0.78;
    }

    private static double indir11(double a) {
        return a*0.89;
    }


}//Class sonu
