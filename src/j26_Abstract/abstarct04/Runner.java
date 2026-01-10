package j26_Abstract.abstarct04;

public class Runner {
   public static void main() {
        CheeseCake c1=new CheeseCake();
       System.out.println("cheeseCake madeIn = " + c1.madeIn()); // US
       System.out.println("chesecake taste = " + c1.taste()); // Sugar

       GreekSalad g1=new GreekSalad();
       System.out.println("Greeksalad tastes = " + g1.taste()); //fresh
       System.out.println("GreekSalad made in = " + g1.madeIn()); // greece

       Baklava b1=new Baklava();
       System.out.println("Baklava made in = " + b1.madeIn()); // turkey
       System.out.println("Baklava taste = " + b1.taste()); // Sweet

       SezarSalad s1=new SezarSalad(); // fresh
       System.out.println("SezarSalad taste = " + s1.taste());
       System.out.println("SezarSalad made in = " + s1.madeIn()); // Mediterranean
   }
}
