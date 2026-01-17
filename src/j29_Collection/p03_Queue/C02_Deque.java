package j29_Collection.p03_Queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {
    public static void main(String[] args) {
             /*
        Deque: Double Ended Queue -> Queue'larda FİFO Deque'lerde hem FİFO hem LİFO geçerli
       LİFO : Last in First out -> metrobuse son binen ilk iner :)

         */
        Deque<String> d1=new LinkedList<>(Arrays.asList("JavaCAN","kavaSU","JavaNAZ","javvaNur"));

         //deque print-> sout(d)
        System.out.println("d1 = " + d1);// [JavaCAN, kavaSU, JavaNAZ, javvaNur]

        // deque eleman ekleme -> add()
        d1.add("imren");
        System.out.println("d1 add sonrasi = " + d1); //[JavaCAN, kavaSU, JavaNAZ, javvaNur, imren]
        System.out.println("d1.getFirst() = " + d1.getFirst()); // JavaCAN
        System.out.println("d1.getLast() = " + d1.getLast()); //Imren
        System.out.println("d1.peek() = " + d1.peek());// JavaCAN
        System.out.println("d1.peekFirst() = " + d1.peekFirst());// JavaCAN
        System.out.println("d1.peekLast() = " + d1.peekLast()); // imren

        d1.clear();
        System.out.println("d1.peekFirst() = " + d1.peekFirst()); // null
        System.out.println("d1.peekLast() = " + d1.peekLast()); //null
       // System.out.println("d1.getFirst() = " + d1.getFirst()); // CTE
      //  System.out.println("d1.getLast() = " + d1.getLast()); // CTE
Deque<String> d2= new LinkedList<>(Arrays.asList("javaCAN","javaSU","javaNAZ","javvaNUR"));
        System.out.println("d2.poll() = " + d2.poll());// javaCAN
        System.out.println("d2.pollFirst() = " + d2.pollFirst()); //javaSU
        System.out.println("d2.pollLast() = " + d2.pollLast()); // javvaNUR
        System.out.println("d2.removeFirst() = " + d2.removeFirst()); //javaNAZ
       // System.out.println("d2.removeLast() = " + d2.removeLast()); // CTE=> NoSuchElemntException



    }
}
