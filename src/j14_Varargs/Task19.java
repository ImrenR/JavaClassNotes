package j14_Varargs;


import java.util.ArrayList;
import java.util.List;

public class Task19 {
    static void main() {
        //Create a method removeDuplicates that accepts varargs
        // of integers and
        // returns an ArrayList<Integer containing only unique values.
        //Rules:
        //Do not use Set
        //Use loops and contains()
        //Concepts combined:
        //varargs, ArrayList, loops, if statements

        List<Integer> uniqueNumbers = removeDuplicates(1,3,4,3,5,6,1,6);
        System.out.println("uniqueNumbers = " + uniqueNumbers);
    }

    private static List<Integer> removeDuplicates(int...numbers){
        List<Integer> list= new ArrayList<>();

        for (int num: numbers) {
            if(!list.contains(num)) {
                list.add(num);
            }
        }
        return list;
    }
}
