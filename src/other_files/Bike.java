package other_files;

public class Bike {

    public String color; // default degeri null
   public int age; // default degeri 0 dir
  public   boolean isFast; // default degeri false tur.
// bu degerleri baska bir classta cagirabiliriz. Constructor ile!


    public Bike(String color, int age, boolean isFast) {// pli const
        this.color = color;
        this.age = age;
        this.isFast = isFast;
        System.out.println("coklu ptli calistii");
    }


    public Bike() {
        System.out.println("paratmetsiz const calisti");
    }
    public Bike(String color){
        System.out.println("tek parametreli cons calisti");
        this.color=color;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", isFast=" + isFast +
                '}';
    }
}
