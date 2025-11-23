package j102_OCA.Q041;


    public abstract class A {
        public A() {
            System.out.println("A'nın Constructor");
        }

        abstract void m1();
        abstract void m2();
        void m3(){
            System.out.println("Class A 'dan gelen method");
        }
    }

