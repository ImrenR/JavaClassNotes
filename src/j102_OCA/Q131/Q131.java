package j102_OCA.Q131;

public class Q131 {
    public static void main(String[] args) {

       // Vehicle y = new Car(20);
        //System.out.println(y);
    }

    public class Vehicle {
        int x;
        Vehicle() {
            this(10);// line n1
        }
        Vehicle(int x) {
            this.x = x;
        }
    }
   public  class Car extends Vehicle {

        int y;
        Car(int y) {
            super();
            this.y = y;
        }

    }

}

//What is the result?
//A. Compilation fails at line n2.
// B. Compilation fails at line n1.
// C. 20:20
//D. 10:20
//Answer: A
