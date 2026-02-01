package j10_MethodCreation.Tasks;

public class Task21 {
    public static void main(String[] args) {
        /*
    task-> girilen bir tamsayının basamak sayısını print eden METHOD create ediniz.
    */
basamakSayisiYazdir(1234);
    }
    public static void basamakSayisiYazdir(int sayi) {
        sayi = Math.abs(sayi);
        int basamakSaysi=0;

        if(sayi == 0) {
            basamakSaysi =1;
        }else {
            while(sayi>0) {
                sayi /=10;
                basamakSaysi++;
            }
        }
        System.out.println("basamakSaysi = " + basamakSaysi);
    }

}
