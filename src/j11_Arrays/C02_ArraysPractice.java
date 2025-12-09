package j11_Arrays;

import java.util.Arrays;

public class C02_ArraysPractice {
    public static void main(String[] args) {
        String[] isimArr = {"Muhammed", "Sebnem", "Musa", "Ayse", "Sennur", "Recep"};
        int sayiArr[] = {20, 32, 7, 58, 63, 59, 35, 17, 16, 21};
        //Task01-> sayıArr cift index elemanlarını print eden code create ediniz...
        System.out.println("   ***   task01   ***   ");

        for (int i = 0; i < sayiArr.length; i++) {
            if (i%2 == 0){
                System.out.println(sayiArr[i]);
            }
            
        }
        System.out.println("   ***   task02   ***   ");
        //Task02-> isimArray de 5 karakterden fazla olan elemanları print eden code create ediniz...

        for (int i = 0; i < isimArr.length ; i++) {
            if (isimArr[i].length()>5) {
                System.out.println(isimArr[i]);
            }
        }


        //Task03-> isimArray de 6 karakterden az olan elemanı depolayan(store eden) arrayı print eden code create ediniz..
        System.out.println("   ***   task03   ***   ");

       // 6 karakterden az olan elemanlari depolayacak arrrayin boundu icin ttanimlandi




        }
    }

