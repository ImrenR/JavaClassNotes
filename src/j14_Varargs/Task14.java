package j14_Varargs;

import java.util.ArrayList;

public class Task14 {
    static void main() {
        //Create a method toArrayList that accepts varargs of integers and
        // returns an ArrayList<Integer>.
        //
        //Concepts: ArrayList, loop
        //Hint: Use add() inside a loop.

        System.out.println("toArrayList(34,45,34,23,45,45,56) = " + toArrayList(34, 45, 34, 23, 45, 45, 56));
    }
//= [34, 45, 34, 23, 45, 45, 56]
    private static ArrayList<Integer> toArrayList(int...numbers) {

        ArrayList<Integer> list =new ArrayList<>(); // created an empty list
         for(int num: numbers){
             list.add(num);
         }
        return list;
    }
}
