package j27_Interface.Tasks.Task06;

public class Lahmacun implements Food{

    public void dough(){
        System.out.println("Gluten free dough");
    }
    public void topping(){
        System.out.println("topping has parsley,onion,meat,herbs");
    }
    public void bake(){
        System.out.println("baked in the oven");

    }

    @Override
    public void taste() {
        System.out.println("Taste is delicious");
    }

    @Override
    public double ucret() {
        return 5.5;
    }
}
