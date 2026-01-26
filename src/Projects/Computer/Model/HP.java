package Projects.Computer.Model;

import Projects.Computer.Enumlar.Color;
import Projects.Computer.Enumlar.Ram;
import Projects.Computer.Enumlar.Size;

public class HP extends DataAll implements Computer {

    static final String hpModel = "HP";


    @Override
    public String getRam() {
        System.out.println(hpModel+ " Bilgisayarın Ram'ini seçiniz:" + "\n    " +
                "1-32gb" + "\n    2-16gb" + "\n    3-8gb" + "\n    4-Ana Menü");
        String size = scanner.next();
        switch (size) {
            case "1":
                price += 100;
                return Ram.r32gb.name();

            case "2":
                price += 200;
                return Ram.r16gb.name();
            case "3":
                price += 300;
                return Ram.r8gb.name();
            case "4":
                choseMenu();
                break;
        }
        return null;

    }


    @Override
    public String getColor() {
        System.out.println(hpModel+" Bilgisayarın rengini seçiniz:" + "\n    " +
                "1-BLACK" + "\n    2-RED" + "\n    3-ORANGE" + "\n    4-SILVER;" + "\n    5-Ana Menü");
        String color = scanner.next();
        switch (color) {
            case "1":
                price += 100;
                return String.valueOf(Color.BLACK);

            case "2":
                price += 200;
                return String.valueOf(Color.RED);
            case "3":
                price += 300;
                return Color.ORANGE.name();
            case "4":
                price += 400;
                return Color.SILVER.name();
            case "5":
                choseMenu();
                break;
        }
        return null;

    }

    @Override
    public String getSize() {
        System.out.println(hpModel+ " Bilgisayarın boyutunu seçiniz:" + "\n    " +
                "1-MIDDLE" + "\n    2-MIN" + "\n    3-MAX" + "\n    4-Ana Menü");
        String size = scanner.next();
        switch (size) {
            case "1":
                price += 100;
                return String.valueOf(Size.MIDDLE);

            case "2":
                price += 200;
                return String.valueOf(Size.MIN);
            case "3":
                price += 300;
                return Size.MAX.name();
            case "4":
                choseMenu();
                break;
        }
        return null;

    }

    @Override
    public int price() {

        return price;
    }

    public static void setHPModel() {
        System.out.println("Apple Menusüne Hoş Geldiniz");
        HP hp = new HP();
        hp.model=hpModel;
        hp.laptopID = Id++;
        hp.ram = hp.getRam();
        hp.renk = hp.getColor();
        hp.size = hp.getSize();
        System.out.println("Seçtiğiniz ürününün" + "\nModel:  " + hpModel +
                "\nRenk: " + hp.renk + "\nRam :  " + hp.ram + "\nBoyutu:  " + hp.size + "ID:  \n " + hp.laptopID);
        System.out.println("Satın alma islemini onaylıyor musunuz");
        System.out.println("E veya H");
        String s=scanner.next();
        if (s.equalsIgnoreCase("e")){
            computers.put(hp.laptopID, hp);
            System.out.println(computers);
        } else if (s.equalsIgnoreCase("h")) {
            choseMenu();
        }else {
            System.out.println("Hatalı giriş yaptınız");
            setHPModel();
        }
        choseMenu();

    }


}
