package j26_Abstract.abstract06;

public class BOA extends Bank{


    public BOA(String name, String phoneNumber, String address, int numEmployee, double balance) {
        super("BOA","345-789-345","RUA DA CONS",2,300);
    }

    @Override
    void openAcoount(String imza, String kimlik) {
        System.out.println("BOA hesabı açmak için gerekli belgeler:");
        System.out.println("1. Kimlik fotokopisi");
        System.out.println("2. İmza sirküleri");
        System.out.println("3. Adres belgesi");
        System.out.println("Hesap açıldı: " + getName());
    }

    @Override
    void closeAccount(String imza, String kimlik, boolean hesapKontrol) {
if(hesapKontrol){
    System.out.println("BOA hesabi kapatildi : " + getName());
}else {
    System.out.println("Boa hesabi kapatilamadi bakiye mevcut");
}
    }
}
