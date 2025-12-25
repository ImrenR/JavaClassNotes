package j19_Constructor;

//import static j19_Constructor.C04_Teacher.maasHesapla;

public class C04_Teacher_Runner {//lokomotif-> motor olan runner  Class

    public static void main(String[] args) {

C04_Teacher ogrt1=new C04_Teacher("imren","JavaCan","Developer",1354,7,5000,false);

        System.out.println("ogrt1 = " + ogrt1);
   C04_Teacher ogrt2= new C04_Teacher();
        System.out.println("ogrt2 = " + ogrt2);//ogrt2 = ad='null, soyad='null, brans='null, id=0, tecrube=0, maas=0.0, emekli=false atama yapilmadi cunku parametre vermedim

    } // main end



}// Class end
