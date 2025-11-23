package j102_OCA.Q047;


    class Machine{
        public void start(){//Machine Parent Class

            System.out.println("Machine Started");
        }
        public void finih(){//Machine Parent Class

            System.out.println("Machine Finish");
        }
    }
    class Camera extends Machine{//Camera Sub Class
        @Override
        public void start(){

            System.out.println("Camera Started");
        }
        public void snap(){

            System.out.println("Photo taken");
        }
    }

