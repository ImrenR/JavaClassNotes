package j11_Arrays;

import java.util.Arrays;

public class C04_Arrays_split {
    public static void main(String[] args) {
        // String data type dataları Arrays'e elaman olarak cevirmek için split() meth kullanılır.


        String str = "javaNAZ'lara bolcana selamkeee. taskları çözmeyenin klayveyisi bozulsun ekranı mavi caksın :( ";
        // task-> str'nin kelime ve harf sayısını print eden code create ediniz.
        // saymak nedir: count , count ta bir sart saglayacak ya if -> bos bir array a atarim
        // ama her bir kelimede bir eleman olacagina gore birden cok elemani arrray a depolayacagima gore
        // -> bos bir array atayacagim,array in eleman sayisini nasil bulacagim , saydirmam lazim
        //-> ama boundunu(length) bilmiyorum cunku boundu soruluo, dolayisiyla bua
        //->bos bir array tanimlayamam[] x
        // print etmek : sout

        String kelimeArr[] = str.split(" ");
        System.out.println("str = " + str); //->cikti : javaNAZ'lara bolcana selamkeee. taskları çözmeyenin klayveyisi bozulsun ekranı mavi caksın :(
        System.out.println("Arrays.toString(kelimeArr) = " + Arrays.toString(kelimeArr));
        // cikti-> [javaNAZ'lara, bolcana, selamkeee., taskları, çözmeyenin, klayveyisi, bozulsun, ekranı, mavi, caksın, :(]
        System.out.println("kelimeArr.length = " + kelimeArr.length); // 11 elemanli bir array

        String harfSayisi[]=str.split("");
        System.out.println("Arrays.toString(harfSayisi) = " + Arrays.toString(harfSayisi)); //cikti -> [j, a, v, a, N,  .. seklinde
        System.out.println("harfSayisi.length = " + harfSayisi.length); // 94
    }
}