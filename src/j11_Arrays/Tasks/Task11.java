package j11_Arrays.Tasks;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup
		 print eden code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";

        int dolarToplam = 0;
 int euroToplam = 0;

String [] newArr = str.split(" ");
        System.out.println(Arrays.toString(newArr));

        for (int i = 0; i < newArr.length; i++) {
            if(newArr[i].startsWith("$")){
              String sayi = newArr[i].replace("$", "");
              dolarToplam += Integer.parseInt(sayi);
            } else if (newArr[i].startsWith("£")) {
                String sayi1= newArr[i].replace("£","");
                euroToplam += Integer.parseInt(sayi1);
            }

        }
        System.out.println("dolarToplam =" + dolarToplam);
        System.out.println("euroToplam =" +euroToplam);
    }
}
