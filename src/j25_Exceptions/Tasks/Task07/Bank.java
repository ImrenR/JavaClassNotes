package j25_Exceptions.Tasks.Task07;

import java.util.Scanner;

public class Bank {
    static void main() throws Account.HighWithDrawExceptions {
Scanner input=new Scanner(System.in);
        System.out.println("Bankamiza hosgeldiniz");
        System.out.println("Lutfen login islemi yapiniz");

        Account us1= new Account(100000);
        System.out.println("Account Number = " + us1.getAccountNumber());
        System.out.println("Bakiyeniz = " + us1.getBalance());

        System.out.println("Lutfen yapmak istediginiz islemi seciniz");
        System.out.println("Para cekmek istiyorsaniz 1");
        System.out.println("Para eklemek istiyorasniz 2");
        int secim = input.nextInt();
        switch (secim) {

    case 1:
        System.out.println("Cekmek istediginiz tutari giriniz : ");
        try {
            us1.withdraw(input.nextInt());
        } catch (Account.HighWithDrawExceptions e) {
            System.out.println("HATA = " + e.getMessage());
        }
        break;
    case 2:
        System.out.println("Eklemek istediginiz tutari giriniz :");
        us1.paraEkle(input.nextInt());
    default:
        System.out.println("Gecersiz bir islem!");
        break;
}





    }
}
