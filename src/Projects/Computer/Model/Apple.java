package Projects.Computer.Model;

import Projects.Computer.Enumlar.Color;
import Projects.Computer.Enumlar.Ram;
import Projects.Computer.Enumlar.Size;
import day31.Ebruhnm.AdresMap;

public class Apple extends DataAll implements Computer {


    static final String appleModel="APPLE";
    public Apple() {
    }



    @Override
    public String getRam() {
        System.out.println(appleModel+" Bilgisayarın Ram'ini seçiniz:" + "\n    " +
                "1-32gb" + "\n    2-16gb" + "\n    3-8gb" + "\n    4-Ana Menü");
        System.out.println("PRICE:  "+price);
        String size=scanner.next();
        switch (size) {
            case "1":
                price+=100;
                return Ram.r32gb.name();

            case "2":
                price+=200;
                return Ram.r16gb.name();
            case "3":
                price+=300;
                return Ram.r8gb.name();
            case "4":
                choseMenu();
                break;
        }
        return null;

    }



    @Override
    public String getColor() {
        System.out.println(appleModel+ "Bilgisayarın rengini seçiniz:" + "\n    " +
                "1-BLACK" + "\n    2-RED" + "\n    3-ORANGE" + "\n    4-SILVER;" + "\n    5-Ana Menü");
        String color=scanner.next();
        switch (color) {
            case "1":
                price+=100;
                return String.valueOf(Color.BLACK);

            case "2":
                price+=200;
                return String.valueOf(Color.RED);
            case "3":
                price+=300;
                return Color.ORANGE.name();
            case "4":
                price+=400;
                return Color.SILVER.name();
            case "5":
                choseMenu();
                break;
        }return null;
    }

    @Override
    public String getSize() {
        System.out.println(appleModel+" Bilgisayarın boyutunu seçiniz:" + "\n    " +
                "1-MIDDLE" + "\n    2-MIN" + "\n    3-MAX" + "\n    4-Ana Menü");
        String size=scanner.next();
        switch (size) {
            case "1":
                price+=100;
                return String.valueOf(Size.MIDDLE);

            case "2":
                price+=200;
                return String.valueOf(Size.MIN);
            case "3":
                price+=300;
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
    public static void setAppleModel(){
        System.out.println("Apple Menusüne Hoş Geldiniz");
        Apple apple=new Apple();
        apple.model=appleModel;
        apple.laptopID=Id++;
        apple.ram= apple.getRam();
        apple.renk= apple.getColor();
        apple.size=apple.getSize();
        System.out.println("Seçtiğiniz ürününün"+"\nModel:  "+appleModel+
                "\nRenk: "+apple.renk+"\nRam :  "+apple.ram+"\nBoyutu:  "+apple.size+"\nID:   "+apple.laptopID);
        System.out.println("PRICE:  "+price);

        System.out.println("Satın alma islemini onaylıyor musunuz");
        System.out.println("E veya H");
        price=1000;
        String s=scanner.next();
        if (s.equalsIgnoreCase("e")){
            computers.put(apple.laptopID, apple);
            System.out.println(computers);
        } else if (s.equalsIgnoreCase("h")) {
            choseMenu();
        }else {
            System.out.println("Hatalı giriş yaptınız");
            setAppleModel();
        }
        choseMenu();

    }
}
