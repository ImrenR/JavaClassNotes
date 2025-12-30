package j23_Encapsulation.Tasks.task02;

import java.util.Scanner;

public class Student {//outher Class level
    //fields ..
private String name;
private int age;
    //cons..

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // setter getter

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

//toString


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}//outher Class sonu

class  StudentRunner {//inner class level


    static void main() {
        Student sdt=new Student("haluk",48);
        System.out.println("Student name is " + sdt.getName());
        System.out.println("He is " + sdt.getAge() + "years old");
    }


}//inner class sonu
