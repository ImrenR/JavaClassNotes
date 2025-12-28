package j14_Varargs;

import java.util.ArrayList;

public class Task15 {
    static void main() {
        //Create a method printArrayAndVarargs that takes:
        //
        //one int array
        //
        //one varargs int...
        //
        //Print all values together.
        //
        //Concepts: arrays, varargs, loops
        int [] arr = {23,45,56};
        printArrayAndVarargs(arr,45,56,56,34);
    }

    private static void printArrayAndVarargs(int[] arr,int...x) { // buraya array oldugunu vurgula,method call a sadece ismini yaz
        ArrayList<Integer> list = new ArrayList<>();
       for (int avuc:arr){
           list.add(avuc);
       }
       for (int avuc:x){
           list.add(avuc);
       }
        System.out.println("list = " + list);//list = [23, 45, 56, 45, 56, 56, 34]
    }
}
