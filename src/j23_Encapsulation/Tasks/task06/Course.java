package j23_Encapsulation.Tasks.task06;

public class Course {

    String courseName;
    double price;
    boolean hasCertificate;



    public Course(String courseName, double price, boolean hasCertificate) {
        this.courseName = courseName;
        this.price = price;
        this.hasCertificate = hasCertificate;
        calculateFinalPrice();
    }

    public double getPrice() {
        return price;
    }


    public void setHasCertificate(boolean hasCertificate) {
            this.hasCertificate=hasCertificate;
            calculateFinalPrice();

        }
    private void calculateFinalPrice() {
        if(hasCertificate==true){
            price+=300;
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", price=" + price +
                ", hasCertificate=" + hasCertificate +
                '}';
    }
}

class CourseRunner{
    static void main() {
        Course prc = new Course("abc",45.7,true);
        System.out.println("prc = " + prc);
    }



}