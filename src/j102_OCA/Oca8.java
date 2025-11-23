package j102_OCA;

public class Oca8 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Duke");
        System.out.println("sb.capacity() = " + sb.capacity());
        String str=sb.toString();
        System.out.println(str);
        //System.out.println(str==sb);
        System.out.println(str.equals(sb));
    }
}
