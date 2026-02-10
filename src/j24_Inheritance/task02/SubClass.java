package j24_Inheritance.task02;

public class SubClass extends SuperClass{

    int sayi=17;

    @Override
    public String ebikGabik() {
        return "Agam subclasstan selamlarrrr :))";
    }

    public void JavaCAN (){
        System.out.println("super.ebikGabik() = " + super.ebikGabik());
        System.out.println("this.ebikGabik() = " + this.ebikGabik());
        System.out.println("super.sayi = " + super.sayi);
        System.out.println("this.sayi = " + this.sayi);

    }

    @Override
    public String toString() {
        return "SubClass{" +
                "sayi=" + sayi +
                ", sayi=" + sayi +
                '}';
    }
}
