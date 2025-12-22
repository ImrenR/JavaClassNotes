package j17_ImmutableClass;

public class C01_ImmutableClass {
    public static void main(String[] args) {

    String name1 = "imren"; // initial edilmis imren value yapilmis name1 variable stringPool create edildi.
    String name2 ="imren";// initial edilmis imren value yapilmis name2 variable stringPool create edildi.
    String name3 =new String("imren"); // initial edilmis imren value yapilmis name3 obj (heap memory) create edildi.
    String name4 =new String("imren"); // initial edilmis imren value yapilmis name4 obj (heap memory) create edildi.
    String  name5= name1;
        System.out.println("name1==name2 = " + name1.equals(name2)); // / true=> ayni havuz referansi oldugu icin, hem degerine bakar hem de referasn degerine bakar
        System.out.println("name1==name2 = " + name1 == name2);// false
        System.out.println("name1.equals(name3) = " + name1.equals(name3));//t
        System.out.println("name5==name3 = " + name5 == name3);// false
        System.out.println("name3==name4 = " + name3 == name4); // false
        System.out.println("name3.equals(name4) = " + name3.equals(name4)); // true

    }
}
