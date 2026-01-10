package j26_Abstract.abstarct04;

public abstract class Salad extends Food {

    public abstract String madeIn();

    @Override

    public String taste() { // burada implemented method istenmis yani buranin cocuklari icin sabit bir return olacak.
        return "fresh";
    }
}
