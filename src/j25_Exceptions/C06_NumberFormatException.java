package j25_Exceptions;

public class C06_NumberFormatException {
    public static void main(String[] args) {
        // NumberFormatException -> numerik formatta olmayan bir value parseInt() meth call edilirse oluşan RTE

        String imren="1903";
        System.out.println(imren); //1903
        System.out.println("imren + 34 = " + imren + 34);// 190334
        //String i toplamak istersek int cevirmek zorundayiz

        int nikola = Integer.parseInt(imren);
        System.out.println("nikola = " + (nikola + 34)); // 1937

        String id="386437564l";

        try{
            int invaId=Integer.parseInt(id);
            System.out.println("invaId = " + invaId);
            System.out.println("Sorunsuz calisti exception firlatmadi");

        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
            id="3864375641";
            int invaId=Integer.parseInt(id);
            System.out.println(invaId);
            System.out.println("Print okunduysa try exception firlatti ve handle etti");
        }
//cikti =>
//For input string: "386437564l"
//Print okunduysa try exception firlatti ve handle etti

    }
}
