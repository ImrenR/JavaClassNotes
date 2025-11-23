package j102_OCA;

public class Oca1 {
    public static void main(String[] args) {
        int x=1;
        int y=1;
        if (x++<++y){ //1<2
            System.out.println("Hello");
        }else {
            System.out.println("Welcome");
        }
        System.out.println("Log:"+x+":"+y);//2  2
    }
}
