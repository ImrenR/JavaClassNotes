package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _04_arraylist4 {

    /*
        İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
           Arraylist'te s1'i s2 olarak değiştirin

        Return String arrayList

        Örneğin;
        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        s1 = blue
        s2 = yellow
        Tüm blue 'ları yellow'a dönüştürün.
        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
     */

    public static void main(String[] args) {
List<String> arr = new ArrayList<>(Arrays.asList("yellow" , "red" , "blue" , "red" , "blue"));
String s1= "blue";
String s2= "yellow";
        List<String> changedList = changeInArraylist(arr,s1,s2);
        System.out.println("changedList = " + changedList);
    }

    private static List<String> changeInArraylist(List<String> arr, String s1, String s2) {
        for (int i = 0; i <arr.size() ; i++) {
            if(arr.get(i).equals(s1)){
                arr.set(i,s2);
            }
        }
    return arr;

    }
}
