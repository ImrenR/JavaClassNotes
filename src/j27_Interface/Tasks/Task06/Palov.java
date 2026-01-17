package j27_Interface.Tasks.Task06;

public class Palov implements Food{


    public void fry(){
        System.out.println("Fried");
    }

    public void boil(){
        System.out.println("boiled pilav");
    }





    @Override
    public void taste() {
        System.out.println("Tasty");
    }

    @Override
    public double ucret() {
        return 4.5;
    }
}
