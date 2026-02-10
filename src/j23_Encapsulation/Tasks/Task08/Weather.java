package j23_Encapsulation.Tasks.Task08;

public class Weather {

  private double temperatureCelsius;

    public Weather(double temperatureCelsius) {
        this.temperatureCelsius = temperatureCelsius;

    }

    public double getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public void setTemperatureCelsius(double temperatureCelsius) {
        this.temperatureCelsius = temperatureCelsius;
    }

    // method c-> f cevir
    public double getTemperatureFahrenheit(){
        return (temperatureCelsius*9 /5) + 32;
    }
    // status
    public String getWeatherStatus(){
        if(temperatureCelsius<0) {
           return("Freezing");
        } else if (temperatureCelsius<15 && temperatureCelsius>0) {
            return("Cold");
        } else if (temperatureCelsius>16 && temperatureCelsius<25) {
            return("Mild");
        }else return("Hot");
    }

    @Override
    public String toString() {
        return "Weather{" +
                "temperatureCelsius=" + temperatureCelsius +
                ", Fahrenheit=" + getTemperatureFahrenheit() +
                ", Status='" + getWeatherStatus() + '\'' +
                '}';
    }
}


class WeatherRunner{
    static void main() {
        Weather w1= new Weather(-5);
        w1.getWeatherStatus();
        w1.getTemperatureFahrenheit();
        System.out.println("w1 = " + w1);
    }



}