package j10_MethodCreation;

public class C03_MethodDepo {    // main method olmayan depo Class-> komsu koy


/*
her class main method tanımlama zorunluluğu yoktur.Belirli action özel Class'lar tanımlanabilir
 */

public static void gecmeNotu(int not){ // int parametreli komsu koy methodu
    if(not>85){
        System.out.println("Takdir belgesi kazandiniz");

    } else if (not>=70) {
        System.out.println("Tesekkur belgesi kazandiniz");
    } else if (not>=50) {
        System.out.println("Gecmis olsun belgesi kazandiniz");

    }else System.out.println("hicbisi kazanmadiniz");


}

   public void staticOlmayanMeth1(){
       System.out.println("static yok  alamazsin bu sayfadan disariya") ;
}
}



