package j22_AccessModifier;

public class C02_AccessModiferRunner {
    public static void main(String[] args) {

// C01_AccessModifer obj1=new C01_AccessModifer(); //CTE=> private call edilemez buraya
        C01_AccessModifer obj1=new C01_AccessModifer(1,3);// public call edildi
    C01_AccessModifer obj2=new C01_AccessModifer(4,6,7); //protected call edildi

        System.out.println("obj1.defaultYas = " + obj1.defaultYas);
        System.out.println("obj1.protectedYas = " + obj1.protectedYas);
        System.out.println("obj1.publicYas = " + obj1.publicYas);
        // ama private yas i getiremezsin

        //obj1.privateMethod(); // getiremzsin CTE verir
        C01_AccessModifer.protectedMethod(); // getirebilirsin


    }
}
