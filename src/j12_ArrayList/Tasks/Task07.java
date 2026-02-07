package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task07 {
    public static void main(String[] args) {
        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Haluk","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Haluk","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */

        ArrayList<String > isimlist=new ArrayList<String>(
                Arrays.asList("Haluk","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali")
        );

        int index1 = 2;
        int index2=7;

        String temp = isimlist.get(index1);
        isimlist.set(index1, isimlist.get(index2)); // 2. index i 7.indextekieleman ile degistirdik
        isimlist.set(index2,temp); // 7. indexi de 2.elemanla degistirdik

        System.out.println("isimlist = " + isimlist);


    }
}
