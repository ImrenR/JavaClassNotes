package j26_Abstract.abstract06;

public class ChaseBank extends Bank{

    public ChaseBank(String name, String phoneNumber, String address, int numEmployee, double balance) {
        super(name, phoneNumber, address, numEmployee, balance);
    }

    @Override
    void openAcoount(String imza, String kimlik) {
        System.out.println("ChaseBank hesabı açmak için gerekli belgeler:");
        System.out.println("1. Kimlik fotokopisi");
        System.out.println("2. İmza sirküleri");
        System.out.println("3. Adres belgesi");
        System.out.println("Hesap açıldı: " + getName());
    }

    @Override
    void closeAccount(String imza, String kimlik, boolean hesapKontrol) {
        if(hesapKontrol){
            System.out.println("ChaseBank hesabi kapatildi : " + getName());
        }else {
            System.out.println("ChaseBank hesabi kapatilamadi bakiye mevcut");
        }
    }
}
