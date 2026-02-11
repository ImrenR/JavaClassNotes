package j25_Exceptions.Tasks.Task07;

public class Account {

    // custom exceptions
    public static class HighWithDrawExceptions extends Exception{

        public HighWithDrawExceptions(String message){
            super(message);
        }
    }

    // fields
    private static int counter=1345;
    private double balance;
    private int accountNumber;
    // constructor

    public Account(double balance) {
        this.balance = balance;
        this.accountNumber=counter++;


    }


    //methods

     public void paraEkle(int eklenecekTutar) {
        if(eklenecekTutar>0){
            balance+=eklenecekTutar;
            System.out.println("balance = " + balance);
        }else {
            System.out.println("Gecersiz Tutar!");
        }

     }


     public void withdraw(int cekilecekPara) throws HighWithDrawExceptions{
         if(cekilecekPara>5000) {
             throw new HighWithDrawExceptions("Gunluk limiti astiniz!");
         } else if (cekilecekPara<=0) {
             System.out.println("Gecersiz tutar!");
         } else if (cekilecekPara>balance) {
             System.out.println("Yetersiz bakiye");
         }
balance-=cekilecekPara;
         System.out.println("Islem basarili bakiyeniz = " + balance);
     }
    //getter setter

    public int getAccountNumber() {
        return accountNumber;
    }



    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    //toString
}
