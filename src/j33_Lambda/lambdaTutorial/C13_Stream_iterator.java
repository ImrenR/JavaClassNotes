package j33_Lambda.lambdaTutorial;

import java.util.stream.IntStream;

public class C13_Stream_iterator {
    public static void main(String[] args) {
        System.out.println("TASK01--> amele topla : " + ameleTopla(10)); // 55
        System.out.println("   ***   ");

        System.out.println("TASK01--> cincix topla : " + cincixCode(10)); // 55
        System.out.println("   ***   ");

        System.out.println("TASK02--> cincix çift topla : " + ciftTopla(10)); //30
        System.out.println("   ***   ");

        System.out.println("TASK03--> cincix ilk 10 çift topla : "  + ilkCiftTopla(10));// 110
        System.out.println("   ***   ");

        System.out.println("TASK04--> cincix ilk 10 tek topla : " + ilkTekTopla(10));// 100
        System.out.println("   ***   ");

        System.out.println("TASK05-->" );
        ilk2XKuvvetPrint(10);
        System.out.println("   ***   ");

        System.out.println("TASK 06 -->");
        istenenIlkXKuvvetPrint(3,7); //3 9 27 81 243 729 2187
        System.out.println("   ***   ");

        System.out.println("TASK 07 -->");
        System.out.println("   ***   ");

        System.out.println("task08 -- > : ");


    }

    ///

    //TASK 01 --> Structured Programming(lambda olmayan) ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir code create ediniz.

    //Structured Programming(Amele coding...)

    // main disinda oldugumuz icin methoda yaptiricaz
    public static int ameleTopla(int x) {
        int toplam = 0;
        for (int i = 0; i <= x; i++) {
            toplam += i;
        }


        return toplam;
    }

    //Functional Programming(cincix code...)

    public static int cincixCode(int a) {
        return IntStream // integerlari akit
                // .range(1,a+1) // end is exclusive with range
                .rangeClosed(1, a) // both inlusive  with rangeClosed
                .sum();
    }
//range(startInclusive,endExclusive);->
// 1'lik artımlı bir adımla startInclusive'den (dahil) endExclusive'e (hariç)
// kadar sıralı bir IntStream return eder.

    //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir code create ediniz

    public static int ciftTopla(int a) {
        return IntStream // integerlari akit
                // .range(1,a+1) // end is exclusive with range
                .rangeClosed(1, a) // 1 den a ya kadar tamsayilar akisa alindi (1 den 10 kadar olan cift sayilari topladik)
                .filter(SeedMethods::ciftMi)
                .sum();
    }


        //TASK 03 --> Ilk x pozitif cift tam sayiyi toplayan code  create ediniz.

    public static int ilkCiftTopla(int a) {
        return IntStream
                .iterate(2,t->t+2) //  iterate tekrar demek = 2 den baslyaip surekli 2 arttiran tekrar tanimlandi
                .limit(a)
                .sum();
//iteratordeki seed baslangic degerdir limite 5 dediysek 5.elemanda duracak
    }

 //TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.

    public static int ilkTekTopla(int a) {
        return IntStream
                .iterate(1,t->t+2) //  iterate tekrar demek = 1 den baslyaip surekli 2 arttiran tekrar tanimlandi
                .limit(a)
                .sum();

    }

        //TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran code  create ediniz.

    public static void ilk2XKuvvetPrint(int a) {
      IntStream
                .iterate(2,t->t*2) //
                .limit(a)
                .forEach(SeedMethods::intYazdir);

    }

    //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini print eden code  create ediniz.

    public static void istenenIlkXKuvvetPrint(int istenenSayi, int kuvvet) {
        IntStream
                .iterate(istenenSayi,t->t*istenenSayi) //
                .limit(kuvvet)
                .forEach(SeedMethods::intYazdir);

    }

        //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan code  create ediniz.



 //TASK 08 --> Istenilen bir sayinin  x. kuvvetini print eden code  create ediniz.










    } //  class sonu
