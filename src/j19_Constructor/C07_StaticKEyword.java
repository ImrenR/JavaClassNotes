package j19_Constructor;

import other_files.MyClass;

public class C07_StaticKEyword {
    static void main() {

        MyClass myClass1= new MyClass();
        System.out.println("myClass1.number = " + myClass1.number);
        myClass1.number =25;
        System.out.println("myClass1.number = " + myClass1.number);
myClass1.age =25; //buradaki atama herkesi etkiler cunku age static
        System.out.println("myClass1.age = " + myClass1.age);
        MyClass myClass2 =new MyClass();
        System.out.println("myClass2.number = " + myClass2.number); // ilk degeri atar yukaridaki atamadan etkilenmez
        System.out.println("myClass2.age = " + myClass2.age);

    }
}
