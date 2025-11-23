package j102_OCA.Q100.p1;

public class Test2 extends  Acc{
    public static void main(String[] args) {

        Test2 obj = new Test2();//Sadece child class türündeki obje procted variable ulaşabilir
        obj.r=12;//protect
        obj.s=12;//public
        obj.p=13;//default

        Acc  obj2= new Test2();
        obj.s=13;
        obj2.r=12; //data türü parent class olduğu için ulaşamaz.
        obj.p=13;//default

        Acc obj3=new Acc();
        obj3.s=13;


    }
}
