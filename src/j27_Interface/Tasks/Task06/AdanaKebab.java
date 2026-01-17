package j27_Interface.Tasks.Task06;

public class AdanaKebab implements Food{

    public void marinade(){
        System.out.println("marinade edilmis adana kebap");


    }

    public void grill(){
        System.out.println("grill edilmis adana kebap");
    }
    @Override
    public void taste() {
        System.out.println("Fantastic, salty");
    }

    @Override
    public double ucret() {
        return 10.5;
    }
}
