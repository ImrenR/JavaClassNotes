package j24_Inheritance.inheritance02;

import j24_Inheritance.inheritance01.Hayvancik;

public class Mammal extends Hayvancık {//garnd-parent(super) Class Hayvancık'tan extend edilen parent (super) Class -> Baba Class

    int m=1;
    int c=4;

    public Mammal() {// psiz constructor
        this('$'); // bu classtaki paratli const call edildi
        System.out.println("pliconst call edildi");
    }

    public Mammal(char x) {
        super(99); //parent(super) Class pli const call.
        System.out.println("Pli constructor call");
    }
    public void mC(){
        System.out.println("Mammal class meth call edildi");
    }


}//Class sonu
