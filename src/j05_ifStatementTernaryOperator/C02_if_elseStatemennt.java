package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C02_if_elseStatemennt {
    public static void main(String[] args) {
        // task-> girilen yasın 18 den buyulugunu kontrol eden code create ediniz..

 Scanner input = new Scanner(System.in);
        System.out.println("yas gir:");
int yas = input.nextInt();

if(yas>18){
    System.out.println("yasi buyuk");
}else {
    System.out.println("yasi kucuk");
}

    }
}
