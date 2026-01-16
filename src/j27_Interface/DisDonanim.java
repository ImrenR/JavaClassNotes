package j27_Interface;

public interface DisDonanim {

    void kapi(); // abstract method=> abstract default olarak vardir
    public void kaporta(); //public abst method
    // String renk; variable initialize edilmek zorundadir yoksa=> CTE verir
String RENK="lila";
    public default String sisLamp(){ // public default concrete method
        return "sisli havada kullan";
    }

    public static String anten(){ // public static concrete method
        return "anten gereklidir";
    }

    //DisDonanim obj=new DisDonanim(); => interface obj create edilemez.

}
