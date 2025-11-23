package j102_OCA;

public class Oca12 {
    public static void toSum(Integer x,Integer y){
        System.out.println("Integer:"+ (x+y));
    }
    public static void toSum(byte x,byte  y){
        System.out.println("byte:"+ (x+y));
    }

    public static void toSum(int x,int y){
        System.out.println("int:"+ (x+y));
    }
    public static void toSum(long x,long y){
        System.out.println("long:"+ (x+y));
    }


    public static void main(String[] args) {
        toSum(10,20);
    }

}
