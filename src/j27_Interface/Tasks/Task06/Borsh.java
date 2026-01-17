package j27_Interface.Tasks.Task06;

public class Borsh implements Food{

    public void boil(){
        System.out.println("Borsh has been boiled");
    }


    @Override
    public void taste() {
        System.out.println("Taste was sour");
    }

    @Override
    public double ucret() {
        return 34.5 ;
    }
}
