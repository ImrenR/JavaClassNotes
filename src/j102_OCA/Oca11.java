package j102_OCA;

public class Oca11 {
    public  static long square(int x){
        long y=x*(long)x;
        x=-1;
        return y;
    }
    public void nonstatic(){
        System.out.println("nonstatic method");
    }



    public static void main(String[] args) {
        int value=9;
        long result=square(value);
        System.out.println("value = " + value);

    }
}
