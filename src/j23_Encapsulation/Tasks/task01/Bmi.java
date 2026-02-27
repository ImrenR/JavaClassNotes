package j23_Encapsulation.Tasks.task01;

public class Bmi {//pojo Class
    // fields -> name, age, weight,height: encapsulated

    private  String name;
    private  int age;
    private  double weight;
    private double height;


    //const.

    public Bmi(String name, int age, double weight, double height) {
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

private double getBmi(){

    return  weight/(height*height);

}

public String getSatus(){
        double bmi=getBmi();
        if(bmi<18.5) return "Zayif";
        else if (bmi<25) return "Normal";
        else if (bmi<30) return "Kilolu";
        else if (bmi>30) return "Obez";
        else return "gecersiz bir rakam girdiniz";
}

//toString..


    @Override
    public String toString() {
        return "Bmi{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", bmi=" + getBmi() +
                ", status='" + getSatus()+ '\'' +
                '}';
    }
}//Class sonu
