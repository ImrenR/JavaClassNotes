package j27_Interface;

public interface DisDonanim {
    void kapi(); // public abstract method
    public void kaporta();
    //String renk; initalize edilmeyen var CTE
    String RENK="Kirmizi";
    public default String sisLamp(){ // public default concrete method
        return "Sislamp sisli havada kulanilir";
    };

    //public  static void main(){ => bad practice interface main blok tanimlanabilir ama runner da yapariz

   // }
public  static void anten(){
    System.out.println("Anten var");
}

}
