package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _05_arraylist5 {

    /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */

    public static void main(String[] args) {
        List<String> arr = new ArrayList<>(Arrays.asList("New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"));
      List<String> newArr =  rotateList(arr);
        System.out.println("newArr = " + newArr);
    }

    private static List<String> rotateList(List<String> arr) {
        List<String> reversedKelimeler = new ArrayList<>();
        for (int i = arr.size()-1; i >=0; i--) {
           reversedKelimeler.add(arr.get(i));
        }
        return reversedKelimeler;
    }
}

