package j23_Encapsulation.Tasks.Task07;

public class Bankaccount {

    private String ownerName;
    private double balance;

    public Bankaccount(double balance, String ownerName) {

        this.ownerName = ownerName;
        if (balance < 0) {
            System.out.println("initial balance can not be negative");
            this.balance=0;

        }else
            this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }

    //deposit method
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }else System.out.println("must be positive!");
    }
//withdraw method

    public void withdraw(double amount){
        if(amount>0 && amount<= balance){
            balance-=amount;
        } else if (amount>balance) {
            System.out.println("insufficient amount");

        }else {
            System.out.println("withdraw amount must be positive!");
        }
    }

    @Override
    public String toString() {
        return "Bankaccount{" +
                "ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
class BanckaccountRunner{

    static void main() {
        Bankaccount acc=new Bankaccount(10000,"Ali");
        acc.deposit(400);
        System.out.println("acc.getBalance() = " + acc.getBalance());

        acc.withdraw(800);
        System.out.println("acc.getBalance() = " + acc.getBalance());
    }






}