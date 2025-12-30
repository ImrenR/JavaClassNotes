package j23_Encapsulation.Tasks.task01;

public class Bmi {//pojo Class
    // fields -> name, age, weight,height: encapsulated

    private  String name;
    private  int age;
    private  int weight;
    private int height;

    //const.

    public Bmi(int age, String name, int weight, int height) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public Bmi() {
    }

    // getter-setter

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
//toString..


    @Override
    public String toString() {
        return "Bmi{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}//Class sonu
