package j26_Abstract.abstract06;

public abstract class Bank {

private String name;
private String phoneNumber;
private String address;
private int numEmployee;
protected double balance;

    public Bank(String name, String phoneNumber, String address, int numEmployee, double balance) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.numEmployee = numEmployee;
        this.balance = balance;
    }

    abstract void openAcoount(String imza, String kimlik);
abstract void closeAccount(String imza,String kimlik,boolean hesapKontrol);

public String withDraw(double amount){ // havale yapilan hesap
if(amount>balance){
   return amount + "Bakiye yetersiz : Paraniz => " + balance;
}else {
    balance =+amount;
    return "Kalan paraniz" + balance;
}
}
public  String deposit(double amount){
    balance +=amount;
    return amount + "Paraniz eklenmistir toplam prainz :" + balance;
}

public void loan(){
    System.out.println("Krediniz gerceklesti");
}

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public int getNumEmployee() {
        return numEmployee;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumEmployee(int numEmployee) {
        this.numEmployee = numEmployee;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", numEmployee=" + numEmployee +
                ", balance=" + balance +
                '}';
    }
}

