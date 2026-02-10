package j23_Encapsulation.encapsulation03;

public class Arac {//pojo Class
      /*
    1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
       olan Araba  isimli bir class cretae ediniz.
    2- bütün fieldları parametre alan bir constructor tanımlayınız.
    3- Runner isminde main için bir class oluşturunuz.
    4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
    5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı veri girisine karsi kontrol ediniz.
      */

    // fields->private
    private String model;
    private  String renk;
    private int yil;
    private int motorHacmi;
    // const


    public Arac() {

    }

    public Arac(String renk, String model) {
        this.renk = renk;
        this.model = model;
    }

    public Arac(String model, String renk, int motor, int motorHacmi, int yil) {

        this.model = model;
        this.renk = renk;

        setMotorHacmi(motorHacmi);
        setYil(yil);


    }



    // getter-setter

    public int getYil() {
        return yil;
    }

    public int getMotorHacmi() {
        return motorHacmi;
    }

    public void setYil(int yil) {
        if (yil >=1960 && yil<=2026){
            this.yil = Math.abs(yil);

        }else
            System.out.println("Hatali bir yil girdiniz");
        this.yil=yil;

    }

    public void setMotorHacmi(int motorHacmi) {
       if(motorHacmi<1000){
           this.motorHacmi = Math.abs(motorHacmi);
       }else
           System.out.println("Motor hacmi 1000 cc ve alti olmalidir!");
this.motorHacmi=motorHacmi;

    }
//toString


    @Override
    public String toString() {
        return
                "model='" + model +
                ", renk='" + renk +
                ", yil=" + yil +
                ", motorHacmi=" + motorHacmi ;
    }
}
