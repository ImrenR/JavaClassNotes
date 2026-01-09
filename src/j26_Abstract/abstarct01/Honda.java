package j26_Abstract.abstarct01;

public abstract class Honda { // => Abstract  => parent class

    public abstract void motor(); // bstract metod => zorunlu implement=> bodsiz method (soyut)

    abstract void kapi();
    abstract  void koltuk();
     void sunroof() { //  concrete metod => bodyli somut metod=> can be
         System.out.println("Bodyli concrete metod");
    }
    // abs. class concrete variable create eder mi = > evet eder. => onunde abstract yazmayan her sey somuttur

    String name="Imren";
     //abs. class abs. variable create eder mi => hayir
    // abstract String name="Haluk";
    // final void finaleMethod(); final bodysiz meth create edilemez
    // final abstract void finalAbsMEthod(); => final abs method create edilemez.
    // private abstract void privateMEthod(); => private abs meth create edilemez.

    //  staatic void staticMetod(); static concrete meth body siz olamaz
    // static abstract void staticAbstract (); => static abs meth olamaz

    //Honda h1=new Honda(); => abs class obj create edemez=> melekler doguramaz

}
