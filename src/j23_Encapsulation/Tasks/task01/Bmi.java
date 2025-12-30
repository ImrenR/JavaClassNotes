package j23_Encapsulation.Tasks.task01;

public class Bmi {//pojo Class
    // fields -> name, age, weight,height: encapsulated

    private  String name;
    private  int age;
    private  int weight;
    private int height;


    //const.

    public Bmi(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;

    }



// getter-setter

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }
public double getBmi(){
        return (double) weight/(height*height);
}

public String  getStatus(){
        double bmi=getBmi();
    if (bmi < 18.5) return "Zayıf";
    else if (bmi < 25) return "Normal";
    else if (bmi < 30) return "Kilolu";
    else return "Obez";
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
