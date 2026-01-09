package j20_StaticKeyword.Tasks.Task01;

public class Rectangle {

   int width;
   int length;

    public Rectangle(int width, int length) { // fieldlara ilk degeri verebilmek icin constructor acmak zolrundasin
        this.width = width;
        this.length = length;
    }

    public int alanHesapla(){ // static method kullanmadik cunku obje ile cagirilmak istendi
        return width *length;
    }
    public int cevreAlan(){ // normal method ile cagirdik cunku obj ile call et dendi
        return 2* (width+length);
    }
}
