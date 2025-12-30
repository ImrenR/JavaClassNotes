package j21_Scope;

public class C03_LocalVariable {//Class level




    public static void main(String[] args) {//main level
int yas=33; // main scope blokda create edilen primitive initilazed var
        System.out.println("yas = " + yas); // ayni scope da action call edilebilir.
        for (int i = 0; i < 10; i++) {
            System.out.println("yas = " + yas+ " "+ i);// main scope yas var loop levela call edildi.
            i+=3; // i loop level variable ayni scope a call ettik.
        }// for loop sonu

       // i=23; // CTE verir => cunku scope disina tastik
        yas=50; // main local yas variable call edilip update edildi
        System.out.println("yas = " + yas);


    }//main sonu
    //yas; CTE verir=> main local level create edilen yas var main disina call edilemez.



}//Class sonu
