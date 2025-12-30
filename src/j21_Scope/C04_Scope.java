package j21_Scope;

import j20_StaticKeyword.C03_StaticKeyword;

public class C04_Scope {//Class level


    public static void main(String[] args) {//main level

        C01_InstanceVariable obj1= new C01_InstanceVariable(); // istenilen classtan const call ile obj create edildi.
        // obj1. ile C01 classindaki butun int variable lar buraya gelir. yani diger classtan cagri yapildi.
        System.out.println("obj1.tecrube = " + obj1.tecrube);
        C01_InstanceVariable.kurs="Google";// class name ile scope disindan static yani galaksi atama islemi yapildi=> static call edildi.



    }//main sonu


}//Class sonu
