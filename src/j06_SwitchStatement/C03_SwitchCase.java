package j06_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {
        // Task-> Girilen ay numarasına göre kaç gün çektiğini print eden code create ediniz...
        Scanner input = new Scanner(System.in);

        System.out.println("Gakkom code cincix DEWAMKEEE :)");
        int ayNo=input.nextInt();

        switch (ayNo) {
            case 1:
                System.out.println("31");
                break;
            case 2:
                System.out.println("30");
                break;
            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("30");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("30");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("30");
                break;
        }
    }
}
