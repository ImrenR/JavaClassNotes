package j102_OCA.Q095;

import java.util.ArrayList;
import java.util.List;

class Product {
    int id;
    String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Shop {
    public static void main(String[] args) {
        List<Product> lst = new ArrayList<>();
        lst.add(new Product(10, "IceCream")); //lst deil 1st. hata verince lst cevirdim.
        lst.add(new Product(11, "Chocolate"));
        Product p1 = new Product(10, "IceCream");
        System.out.println(lst.indexOf(p1));
        List<String> list2 = new ArrayList<>();
        list2.add("IceCream"); //lst deil 1st. hata verince lst cevirdim.
        list2 .add("Chocolate");
        list2.add(new String("IceCream"));
        String s=new String("IceCream");
        String s2=new String("IceCream");
        list2.add(s2);
        System.out.println(list2.indexOf(s));





//        //lst.add(p1);
//        System.out.println(lst.indexOf(p1));
//        System.out.println(lst.indexOf(new Product(10, "IceCream")));
//        System.out.println(lst.indexOf(new Product(11, "Chocolate")));

        System.out.println(lst);
    }
}



/*
 *What is the result?
		A. true
		B. false
		C. -1
		D. 0
		Answer: C
 */