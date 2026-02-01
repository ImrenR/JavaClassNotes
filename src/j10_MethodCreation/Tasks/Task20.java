package j10_MethodCreation.Tasks;


public class Task20 {
    /*

    task->
      Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarıni print eden METHOD create ediniz.

       [$1 $12 €34 €56 $45 €78]
        dolarToplami: 58
        euroToplami: 168


       */

public static void paraToplamYazdir(String para) {

    int dolarToplam=0;
    int euroToplam=0;

    String [] arr =para.split(" "); // butun sayilari listeye aldim split startswith leri kullanabilmek icin
    
    for (String avuc:arr){
        if(avuc.startsWith("$")) {
            dolarToplam+= Integer.parseInt(avuc.substring(1)); // $1 deki 1 i al
        } else if (avuc.startsWith("€")) {
            euroToplam+=Integer.parseInt(avuc.substring(1));
            
        }

    }
    System.out.println("dolarToplami :" + dolarToplam);
    System.out.println("eurtoplami :" + euroToplam);
}


    public static void main(String[] args) {

String para="$1 $12 €34 €56 $45 €78";

paraToplamYazdir(para);





    }





}
