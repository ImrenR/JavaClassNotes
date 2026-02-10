package j23_Encapsulation.Tasks.task03;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Employees {//outher Class level

//fields..
private String name;
private int salary;
private LocalDate dob;




//constructor..

    public Employees(String name, int salary, LocalDate dob) {
        this.name = name;
        this.salary = salary;
        this.dob = dob;


        ageCalculator();
    }


    // getters and setters..

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public LocalDate getDob() {

        return dob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDob(LocalDate dob) {

        this.dob = dob;
    }

    // method yas kontrolu
    public void ageCalculator() {
        int age = LocalDate.now().getYear() - dob.getYear();

        if (age > 18) {
            System.out.println("Welcome to our company " + name + " your salary is " + salary);
        } else if (age < 18) {
            System.out.println("Come back when you are 18 years old.");
        } else {
            System.out.println("We can have interview with you after that you can have " + salary + " salary.");
        }
    }
//toString method..


    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", dob=" + dob +
                '}';
    }
}//outher class sonu

class  Runner {//inner class level

    public static void main(String[] args) {


Employees emp= new Employees("Fernando",80000, LocalDate.of(2000,11,23));

System.out.print(emp);





    }


}//inner class sonu
