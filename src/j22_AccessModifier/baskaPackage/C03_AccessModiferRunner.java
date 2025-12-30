package j22_AccessModifier.baskaPackage;

import j22_AccessModifier.C01_AccessModifer;

public class C03_AccessModiferRunner {


    private String privateName = "private JavaCan";

    protected String protectedName = "J protected avaCan";

    String defaultName = "default JavaCan";

    public String publicName = "public JavaCan";

    public static void main(String[] args) {

        C01_AccessModifer obj3 = new C01_AccessModifer(1, 2); // public geldi

        System.out.println("obj3.publicYas = " + obj3.publicYas);
        //protected e erisemedim cunku farkli dosyalarda
        // default a zaten erisemem cunku farkli apartmanlardayim
        // sadece public e erisebilirim burada
        C03_AccessModiferRunner obj4 =new C03_AccessModiferRunner();
        System.out.println("obj4.defaultName = " + obj4.defaultName); // ayni packagetan cagirdik o yuzden geldiler
        System.out.println("obj4.privateName = " + obj4.privateName);
        System.out.println("obj4.protectedName = " + obj4.protectedName);
    }
}