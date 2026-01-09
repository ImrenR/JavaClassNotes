package j26_Abstract.abstarct01;

public class Accord extends Honda { // concrete childClass=> Honda abs Class extend edildi
    @Override
    public void motor() { // abs. parent zorunlu implement edilmis concrete method cunku neden bdoysi var
        System.out.println("2.0 turbo cok yakar");
    }

    @Override
    void kapi() {
        System.out.println("2 kapisi var");
    }

    @Override
    void koltuk() { // yesil olanlar ise must be dir
        System.out.println("2 koltugu var");
    }

    @Override
    void sunroof() { //mavi ile olan override lar can be demek alsan olur almasan da olur
        System.out.println("sunroof acmayi unutma");
    }
}
