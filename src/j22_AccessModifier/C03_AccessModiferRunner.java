package j22_AccessModifier;

public class C03_AccessModiferRunner {


    private String privateName="private JavaCan";

    protected String protectedName="J protected avaCan";

     String defaultName="default JavaCan";

    public String publicName="public JavaCan";

    public static void main(String[] args) {

        C01_AccessModifer obj3 = new C01_AccessModifer(1, 2); // public geldi

        System.out.println("obj3.publicYas = " + obj3.publicYas);


    }



}
