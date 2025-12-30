package j23_Encapsulation.Tasks.task01;

public class BmiRunner {
    public static void main(String[] args) {

           Bmi obj1=new Bmi("imren",45,40,167);

        System.out.println("obj1.getBmi() = " + obj1.getBmi());
        System.out.println("obj1.getStatus() = " + obj1.getStatus());
        // obj1.getBmi() = 0.0014342572340349242
        //obj1.getStatus() = Zayıf
    }
}
