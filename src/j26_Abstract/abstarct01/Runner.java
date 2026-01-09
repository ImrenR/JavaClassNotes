package j26_Abstract.abstarct01;

public class Runner {

    static void main() {

        Civic c1=new Civic();
        c1.name="Ahmet";
        System.out.println("c1 = " + c1.name);
        c1.motor();//1.6 motor neyine yetmez
        c1.kapi();//kapi elinde kalmasin
        c1.koltuk();//Koltuklar saglammmm he
        c1.lastikEbat();// 21 inc lastik more than enough

        System.out.println("       ************       ");
        Accord a1=new Accord();
        a1.name="Ayse";
        System.out.println("a1.name = " + a1.name);
        a1.motor();//
        a1.kapi();//
        a1.sunroof();//
        a1.koltuk();//
        System.out.println("       ************       ");

        Crv r1=new Crv();
        r1.name="Hayriye";
        r1.kapi();//
        r1.sunroof();//
        r1.koltuk();//
        r1.motor();//
        System.out.println("r1.name = " + r1.name);


        System.out.println("       ************       ");

    }
}
