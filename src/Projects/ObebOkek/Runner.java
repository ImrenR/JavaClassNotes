package Projects.ObebOkek;

public class Runner {

    public static void main(String[] args) {
        Pojo obje = new Pojo();
        obje.setSayi1(20);
        obje.setSayi2(36);


        Hesap.obeb(obje);
        Hesap.okek(obje);
    }
}
