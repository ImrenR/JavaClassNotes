package j23_Encapsulation.Tasks.task01;

public class BmiRunner {
    public static void main(String[] args) {

           Bmi obj=new Bmi(35,"imren",66,167);

        System.out.println("obj.getWeight() = " + obj.getWeight()); // obj.getWeight() = 66
        obj.setWeight(55);
        System.out.println("obj = " + obj);
        //obj = Bmi{name='imren', age=35, weight=55, height=167}
    }
}
