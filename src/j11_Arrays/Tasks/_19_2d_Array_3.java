package j11_Arrays.Tasks;

import java.util.Arrays;

public class _19_2d_Array_3 {

    public static void main(String[] args) {

        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.

         */

        String [][] cities = {
                {"new jersey","atlanta","ohio"} ,
                {"Pittsburgh" ,"ohio","new york","ohio"} ,
                {"ohio","new york"}
        };
        for (int i = 0; i < cities.length ; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                 if (cities[i][j].equals("ohio")){
                     cities[i][j] ="Florida";
                 }
            }
        }
        System.out.println("Arrays.deepToString(cities) = " + Arrays.deepToString(cities));

    }
}

