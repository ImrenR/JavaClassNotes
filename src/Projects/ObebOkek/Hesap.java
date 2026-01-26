package Projects.ObebOkek;

public class Hesap extends Pojo {


    public static void obeb(Pojo obje) {

        int min = Math.min(obje.getSayi1(), obje.getSayi2());
        int enB = 1;

        for (int i = 1; i <= min; i++) {
            if ((obje.getSayi1() % i == 0) && (obje.getSayi2() % i == 0)) {

                enB = i;
            }

        }
        System.out.println("Enbüyük ortak bölünen: " + enB);


    }

    public static void okek(Pojo obje) {
        int max=Math.max(obje.getSayi1(),obje.getSayi2());
        int enK=max;

        for (int i = 1; i <max ; i++) {
            enK=max*i;
            if(enK% obje.getSayi1()==0 && enK% obje.getSayi2()==0){
                System.out.println("enK = " + enK);
                break;
            }
        }


    }
}
