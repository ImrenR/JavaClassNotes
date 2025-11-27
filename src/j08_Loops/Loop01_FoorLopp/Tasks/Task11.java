package j08_Loops.Loop01_FoorLopp.Tasks;

public class Task11 {
    public static void main(String[] args) {

        /*
        A               //1. satıra 1 harf
        A B             //2. satıra 2 harf
        A B C           //3. satıra 3 harf
        A B C D
        A B C D E
        A B C D E F
        şekli print eden code create ediniz.  65=A'nın ascıı değeri

        */
        int harf=65;
       // i =1 -> sadece A -> j=0
        //i =2 -> j=0,1 -> A, B
        // char -> sayiyi harfe cevirir bu yuzden (char) kullandik ! A + 1 = B - A +2 = C

        for (int i = 0; i <=6; i++) { // satirlar
            for (int j = 0; j <=i; j++) { // her satirda hac harf yazilacak
                System.out.print((char) (harf +j) + " ");
            }
            System.out.println(); // alt satira gecis
        }



    }
}
