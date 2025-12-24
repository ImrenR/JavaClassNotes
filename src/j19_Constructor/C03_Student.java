package j19_Constructor;

public class C03_Student {//Class level
    //fields -> instance(object) variable


    String ad;
    String soyAd;
    int sinif=9;
    double ortalama;
    int okulNo;
    boolean takdirBelgesi;




    public static void main(String[] args) {//main level
        /*
    Task-> fields: ad, soyad, sınıf, ortalama, okulNo, takdirBelgesi olan 2 farklı obj ile
    mezuniyet(ortalama 50 üstü ise mezun oldunuz) sosyalFaaliyet methodlarını  print eden code create ediniz.
     */
C03_Student ogr1 = new C03_Student();
C03_Student ogr2 = new C03_Student();

mezuniyet(23.31);


ogr1.ad ="imren";
ogr1.soyAd="basarili";
ogr1.okulNo=1354;
ogr1.sinif=12;
ogr1.takdirBelgesi=true;
ogr1.ortalama=85.77;

mezuniyet(ogr1.ortalama);


    }//main sonu
    @Override
    public String toString() {
        return "C03_Student{" +
                "ad='" + ad  +
                ", soyAd='" + soyAd +
                ", sinif=" + sinif +
                ", ortalama=" + ortalama +
                ", okulNo=" + okulNo +
                ", takdirBelgesi=" + takdirBelgesi ;
    }
    private static void mezuniyet(double not) {

        if (not >50) {
            System.out.println("Gectiniz");
        }else System.out.println("Kaldiniz");
    }


}//Class sonu
