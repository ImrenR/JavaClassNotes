package j102_OCA;

public class Oca6 {
    public static void main(String[] args) {
        doSum(10,20);
        doSum(10.0,20.0);
    }

    private static void doSum(int i, int i1) {
        System.out.println("int sum:"+(i+i1));
    }
    private static void doSum(double i, double i1) {
        System.out.println("double sum:"+(i+i1));
    }
    private static void doSum(Integer i, Integer i1) {
        System.out.println("Integer sum:"+(i+i1));
    }
}
